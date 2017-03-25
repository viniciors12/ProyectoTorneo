
package IG.Ventanas;

import IG.Ventanas.*;
import Entrenador.*;
import Equipo.*;
import Estadio.*;
import Jugador.*;
import Partido.*;
import Torneo.*;



public class VentanaAdministrador extends javax.swing.JFrame {
    metodosEnt metEnt = new metodosEnt(); 
    metodosEquipo metEquipo = new metodosEquipo();
    metodosEstadio metEstadio = new metodosEstadio();
    metodosJugador metJug = new metodosJugador();
    PartidoMetodos metPar = new PartidoMetodos();
    metodosTorneo metTor=new metodosTorneo();
    
    public VentanaAdministrador(metodosEnt metEnt,metodosEquipo metEquipo,metodosEstadio metEstadio,metodosJugador metJug,
            PartidoMetodos metPar, metodosTorneo metTor) {
        initComponents();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);//hace que la ventana permanezca grande desde el principio
        this.metEnt = metEnt;//singleton
        this.metEquipo = metEquipo;
        this.metEstadio=metEstadio;
        this.metJug=metJug;
        this.metPar=metPar;
        this.metTor=metTor;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJugador = new javax.swing.JButton();
        btnEntrenador = new javax.swing.JButton();
        btnTorneo = new javax.swing.JButton();
        btnEstadio = new javax.swing.JButton();
        btnEquipo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAtrass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnJugador.setText("Jugador");
        btnJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugadorActionPerformed(evt);
            }
        });

        btnEntrenador.setText("Entrenador");
        btnEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenadorActionPerformed(evt);
            }
        });

        btnTorneo.setText("Torneo");
        btnTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorneoActionPerformed(evt);
            }
        });

        btnEstadio.setText("Estadio");
        btnEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadioActionPerformed(evt);
            }
        });

        btnEquipo.setText("Equipo");
        btnEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipoActionPerformed(evt);
            }
        });

        jButton1.setText("Asignar equipo al torneo");

        jButton2.setText("Asignar entrenador al equipo");

        jLabel1.setText("Asignaciones ");

        jLabel2.setText("seleccione que desea crear");

        btnAtrass.setText("Atrás");
        btnAtrass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnJugador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(42, 42, 42)
                                .addComponent(jButton1)
                                .addGap(67, 67, 67))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(226, 226, 226))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnEquipo)
                                .addComponent(btnEntrenador)
                                .addComponent(btnEstadio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTorneo)
                                .addGap(24, 24, 24)))
                        .addGap(196, 196, 196)
                        .addComponent(btnAtrass)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(btnJugador))
                .addGap(18, 18, 18)
                .addComponent(btnEntrenador)
                .addGap(18, 18, 18)
                .addComponent(btnEstadio)
                .addGap(18, 18, 18)
                .addComponent(btnEquipo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTorneo)
                    .addComponent(btnAtrass))
                .addContainerGap(286, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadorActionPerformed
        AdministradorJugadores jugador=new AdministradorJugadores();
        jugador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJugadorActionPerformed

    private void btnEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenadorActionPerformed
        AdministradorEntrenador ven=new AdministradorEntrenador(metEnt,metEquipo,metEstadio,metJug,metPar,metTor);
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEntrenadorActionPerformed

    private void btnEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadioActionPerformed
        AdministradorEstadio ir=new AdministradorEstadio();
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEstadioActionPerformed

    private void btnEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipoActionPerformed
        AdministradorEquipo equipo=new AdministradorEquipo();
        equipo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEquipoActionPerformed

    private void btnAtrassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrassActionPerformed
       CrearOEliminar atras = new CrearOEliminar( metEnt,metEquipo,metEstadio,metJug,metPar,metTor);
       atras.setVisible(true);
           dispose();
    }//GEN-LAST:event_btnAtrassActionPerformed

    private void btnTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorneoActionPerformed
        AdministradorTorneo torneo = new AdministradorTorneo();
        torneo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTorneoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      //  java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
          //      new VentanaAdministrador().setVisible(true);
            //}
       // })
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrass;
    private javax.swing.JButton btnEntrenador;
    private javax.swing.JButton btnEquipo;
    private javax.swing.JButton btnEstadio;
    private javax.swing.JButton btnJugador;
    private javax.swing.JButton btnTorneo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
