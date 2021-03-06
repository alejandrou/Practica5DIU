/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import configurations.Configuration;
import configurations.ConfigurationsManager;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

/** Preguntar si es mejor usar la variable evt o usar el isSelected()
 *
 * @author carlo
 */
public class Practica5 extends javax.swing.JFrame {

    /**
     * Creates new form Practica5
     */
    ConfigurationsManager manager;
    boolean loadingConfiguration, savingConfiguration;
    
    public Practica5() {
        this.manager = new ConfigurationsManager(10);
        manager.addConfiguration(new Configuration(true, true, true, 1));
        loadingConfiguration=false;
        savingConfiguration=false;     
        initComponents();
        undo.setEnabled(false);
        redo.setEnabled(false);
    }
    
    private void loadConfiguration(Configuration config){
        loadingConfiguration=true;
        boolean[] colors = config.getColors();
        int pos = config.getIconPosition();
        
        lienzo1.changeIconPosition(pos);
        lienzo1.changeColors(colors[0], colors[1], colors[2]);
        
        switch(pos){
            case 0:
                logoLeftUp.setSelected(true);
                break;
            case 1:
                logoRightUp.setSelected(true);
                break;
            case 2:
                logoLeftDown.setSelected(true);
                break;
            case 3:
                logoRightDown.setSelected(true);
                break;
        }
        
        photoRed.setSelected(colors[0]);
        photoGreen.setSelected(colors[1]);
        photoBlue.setSelected(colors[2]);
        if(colors[0] && colors[1] && colors[2]){
            photoColorAll.setSelected(true); 
            photoColorAll.setEnabled(false);
        }else{
            photoColorAll.setSelected(false);
            photoColorAll.setEnabled(true);
        }
        loadingConfiguration=false;
    }
    
    private Configuration saveConfiguration(){
        int pos=0;
        
        if(logoLeftUp.isSelected()){
            pos=0;
        }else if(logoRightUp.isSelected()){
            pos=1;
        }else if(logoLeftDown.isSelected()){
            pos=2;
        }else if(logoRightDown.isSelected()){
            pos=3;
        }
        undo.setEnabled(true);
        return new Configuration(photoRed.isSelected(), photoGreen.isSelected(), photoBlue.isSelected(), pos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPositionsGroup = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lienzo1 = new main.Lienzo();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        photoColorAll = new javax.swing.JCheckBox();
        photoBlue = new javax.swing.JCheckBox();
        photoRed = new javax.swing.JCheckBox();
        photoGreen = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        logoLeftUp = new javax.swing.JRadioButton();
        logoLeftDown = new javax.swing.JRadioButton();
        logoRightDown = new javax.swing.JRadioButton();
        logoRightUp = new javax.swing.JRadioButton();
        undo = new javax.swing.JButton();
        redo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 3), "Imagen"));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 3), "Configuración"));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 2), "Colores Fotografía"));

        photoColorAll.setSelected(true);
        photoColorAll.setText("Todos");
        photoColorAll.setToolTipText("Activar o desactivar todos los colores.");
        photoColorAll.setEnabled(false);
        photoColorAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                photoColorAllItemStateChanged(evt);
            }
        });

        photoBlue.setSelected(true);
        photoBlue.setText("Azul");
        photoBlue.setToolTipText("Activar color azul.");
        photoBlue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                photoBlueItemStateChanged(evt);
            }
        });

        photoRed.setSelected(true);
        photoRed.setText("Rojo");
        photoRed.setToolTipText("Activar color rojo.");
        photoRed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                photoRedItemStateChanged(evt);
            }
        });

        photoGreen.setSelected(true);
        photoGreen.setText("Verde");
        photoGreen.setToolTipText("Activar color verde.");
        photoGreen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                photoGreenItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photoColorAll)
                    .addComponent(photoBlue)
                    .addComponent(photoRed)
                    .addComponent(photoGreen))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photoColorAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photoBlue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photoRed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photoGreen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 2), "Posición del Logo"));

        logoPositionsGroup.add(logoLeftUp);
        logoLeftUp.setText("Izquierda Arriba");
        logoLeftUp.setToolTipText("Mover logo a la izquierda arriba de la fotografía.");
        logoLeftUp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                logoLeftUpItemStateChanged(evt);
            }
        });

        logoPositionsGroup.add(logoLeftDown);
        logoLeftDown.setText("Izquierda Abajo");
        logoLeftDown.setToolTipText("Mover logo a la izquierda abajo de la fotografía.");
        logoLeftDown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                logoLeftDownItemStateChanged(evt);
            }
        });

        logoPositionsGroup.add(logoRightDown);
        logoRightDown.setText("Derecha Abajo");
        logoRightDown.setToolTipText("Mover logo a la derecha abajo de la fotografía.");
        logoRightDown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                logoRightDownItemStateChanged(evt);
            }
        });

        logoPositionsGroup.add(logoRightUp);
        logoRightUp.setSelected(true);
        logoRightUp.setText("Derecha Arriba");
        logoRightUp.setToolTipText("Mover logo a la derecha arriba de la fotografía.");
        logoRightUp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                logoRightUpItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLeftUp)
                    .addComponent(logoLeftDown)
                    .addComponent(logoRightDown)
                    .addComponent(logoRightUp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLeftUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoRightUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoLeftDown, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoRightDown)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        undo.setBackground(new java.awt.Color(255, 204, 102));
        undo.setText("Deshacer");
        undo.setToolTipText("Deshacer última acción.");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        redo.setBackground(new java.awt.Color(255, 204, 102));
        redo.setText("Rehacer");
        redo.setToolTipText("Rehacer última acción.");
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(undo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redo)
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(undo)
                    .addComponent(redo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void photoColorAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_photoColorAllItemStateChanged
        if(!loadingConfiguration){
            if(photoColorAll.isSelected()){
                loadingConfiguration=true;
                
                photoBlue.setSelected(true);
                photoRed.setSelected(true);
                photoGreen.setSelected(true);
                photoColorAll.setSelected(true);
                photoColorAll.setEnabled(false);
                lienzo1.changeColors(true, true, true);
                if(!savingConfiguration){
                    manager.addConfiguration(saveConfiguration());
                }
                loadingConfiguration=false;
            }      
        }
    }//GEN-LAST:event_photoColorAllItemStateChanged

    private void photoBlueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_photoBlueItemStateChanged
        if(!loadingConfiguration){
            if(!photoBlue.isSelected() && !photoRed.isSelected() && !photoGreen.isSelected()){
                loadingConfiguration=true;
                JOptionPane.showMessageDialog(this,"Tiene que haber siempre un color activo.","Alert",JOptionPane.ERROR_MESSAGE);
                loadingConfiguration=false;
            }else {
                savingConfiguration=true;
                if(photoBlue.isSelected() && photoRed.isSelected() && photoGreen.isSelected()){
                    photoColorAll.setSelected(true);
                    photoColorAll.setEnabled(false);
                } else if(!photoBlue.isSelected()){
                    photoColorAll.setSelected(false);
                    photoColorAll.setEnabled(true);           
                }
                lienzo1.changeColors(photoRed.isSelected(), photoGreen.isSelected(), photoBlue.isSelected());
                manager.addConfiguration(saveConfiguration());
                savingConfiguration=false;
            }
        }      
    }//GEN-LAST:event_photoBlueItemStateChanged

    private void photoRedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_photoRedItemStateChanged
        if(!loadingConfiguration){
            if(!photoBlue.isSelected() && !photoRed.isSelected() && !photoGreen.isSelected()){
                loadingConfiguration=true;
                JOptionPane.showMessageDialog(this,"Tiene que haber siempre un color activo.","Alert",JOptionPane.ERROR_MESSAGE);
                loadingConfiguration=false;
            }else{
                savingConfiguration=true;
                if(photoBlue.isSelected() && photoRed.isSelected() && photoGreen.isSelected()){
                    photoColorAll.setSelected(true);
                    photoColorAll.setEnabled(false);
                } else if(!photoRed.isSelected()){
                    photoColorAll.setSelected(false);
                    photoColorAll.setEnabled(true);
                }
                lienzo1.changeColors(photoRed.isSelected(), photoGreen.isSelected(), photoBlue.isSelected());
                manager.addConfiguration(saveConfiguration());
                savingConfiguration=false;
            }     
        }
    }//GEN-LAST:event_photoRedItemStateChanged

    private void photoGreenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_photoGreenItemStateChanged
        if(!loadingConfiguration){
            if(!photoBlue.isSelected() && !photoRed.isSelected() && !photoGreen.isSelected()){
                loadingConfiguration=true;
                JOptionPane.showMessageDialog(this,"Tiene que haber siempre un color activo.","Alert",JOptionPane.ERROR_MESSAGE);
                loadingConfiguration=false;
            } else {
                savingConfiguration=true;
                if(photoBlue.isSelected() && photoRed.isSelected() && photoGreen.isSelected()){
                    photoColorAll.setSelected(true);
                    photoColorAll.setEnabled(false);
                    lienzo1.changeColors(true, true, true);
                } else if(!photoGreen.isSelected()){
                    photoColorAll.setSelected(false);
                    photoColorAll.setEnabled(true);
                }
                lienzo1.changeColors(photoRed.isSelected(), photoGreen.isSelected(), photoBlue.isSelected());
                manager.addConfiguration(saveConfiguration());
                savingConfiguration=false;
            }
        }
    }//GEN-LAST:event_photoGreenItemStateChanged

    private void logoLeftUpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_logoLeftUpItemStateChanged
        if(!loadingConfiguration){
            if(evt.getStateChange() == ItemEvent.SELECTED){
                lienzo1.changeIconPosition(0);
                manager.addConfiguration(saveConfiguration());
            }
        }
    }//GEN-LAST:event_logoLeftUpItemStateChanged

    private void logoRightUpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_logoRightUpItemStateChanged
        if(!loadingConfiguration){
            if(evt.getStateChange() == ItemEvent.SELECTED){
                lienzo1.changeIconPosition(1);
                manager.addConfiguration(saveConfiguration());
            }
        }
    }//GEN-LAST:event_logoRightUpItemStateChanged

    private void logoLeftDownItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_logoLeftDownItemStateChanged
        if(!loadingConfiguration){
            if(evt.getStateChange() == ItemEvent.SELECTED){
                lienzo1.changeIconPosition(2);
                manager.addConfiguration(saveConfiguration());
            }
        }
    }//GEN-LAST:event_logoLeftDownItemStateChanged

    private void logoRightDownItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_logoRightDownItemStateChanged
        if(!loadingConfiguration){
            if(evt.getStateChange() == ItemEvent.SELECTED){
                lienzo1.changeIconPosition(3);
                manager.addConfiguration(saveConfiguration());
            }
        }
    }//GEN-LAST:event_logoRightDownItemStateChanged

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        Configuration conf = (Configuration) manager.getPreConfig();
        if(conf==null){
            undo.setEnabled(false);
        }else{
            redo.setEnabled(true);
            loadConfiguration(conf);
        }
    }//GEN-LAST:event_undoActionPerformed

    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed
        Configuration conf = (Configuration) manager.getNextConfig();
        if(conf==null){
            redo.setEnabled(false);
        }else{
            undo.setEnabled(true);
            loadConfiguration(conf);
        }
    }//GEN-LAST:event_redoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private main.Lienzo lienzo1;
    private javax.swing.JRadioButton logoLeftDown;
    private javax.swing.JRadioButton logoLeftUp;
    private javax.swing.ButtonGroup logoPositionsGroup;
    private javax.swing.JRadioButton logoRightDown;
    private javax.swing.JRadioButton logoRightUp;
    private javax.swing.JCheckBox photoBlue;
    private javax.swing.JCheckBox photoColorAll;
    private javax.swing.JCheckBox photoGreen;
    private javax.swing.JCheckBox photoRed;
    private javax.swing.JButton redo;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}
