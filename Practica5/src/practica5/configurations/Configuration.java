/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurations;

/**
 *
 * @author carlo
 */
public class Configuration {
    
    final private boolean[] colors;
    final private int iconPosition;
    
    public Configuration(boolean red, boolean green, boolean blue, int pos){
        colors = new boolean[3];
        colors[0] = red;
        colors[1] = green;
        colors[2] = blue;
        iconPosition = pos;
    }

    public boolean[] getColors() {
        return colors;
    }

    public int getIconPosition() {
        return iconPosition;
    }
}
