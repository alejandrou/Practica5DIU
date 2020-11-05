/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author carlo
 */
public class Lienzo extends JPanel{
    
    private BufferedImage imagen, imagenCopia, logo;
    private Image logoScaled;
    private int widthIconPosition, heightIconPosition;

    public Lienzo() {
        try {
            imagen = ImageIO.read(new URL("https://www.zooplus.es/magazine/wp-content/uploads/2019/10/Siberian-Husky-mit-Welpe-768x512.jpg"));
            imagenCopia = ImageIO.read(new URL("https://www.zooplus.es/magazine/wp-content/uploads/2019/10/Siberian-Husky-mit-Welpe-768x512.jpg"));
            logo = ImageIO.read(new URL("https://audiofit.org/wp-content/uploads/2018/04/LOGO-FONDO-TRANSPARENTE.png"));
            logoScaled = logo.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    
            widthIconPosition = imagen.getWidth()-100;
            heightIconPosition = 0;
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
        g.drawImage(logoScaled, widthIconPosition, heightIconPosition, null);
    }
    
    public void changeColors(boolean red, boolean green, boolean blue){
        imagen = UtilsPractica5.seleccionarComponentes(imagenCopia, red, green, blue);
        this.repaint();
    }
    
    public void changeIconPosition(int pos){
        switch(pos){
            case 0:
                widthIconPosition = 0;
                heightIconPosition = 0;
                break;
            case 1:
                widthIconPosition = imagen.getWidth()-100;
                heightIconPosition = 0;
                break;
            case 2:
                widthIconPosition = 0;
                heightIconPosition = imagen.getHeight()-100;
                break;
            case 3:
                widthIconPosition = imagen.getWidth()-100;
                heightIconPosition = imagen.getHeight()-100;
                break;
        }
        this.repaint();
    }
}
