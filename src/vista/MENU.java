/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy
 */
public final class MENU extends javax.swing.JFrame {
    Login l=new Login();
    /**
     * Creates new form MENU
     */
    public MENU() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonempleado = new javax.swing.JButton();
        botoncliente = new javax.swing.JButton();
        botonreserva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonhabitacion = new javax.swing.JButton();
        botonservicio = new javax.swing.JButton();
        botonusuario = new javax.swing.JButton();
        botonfactura1 = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labeluser = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();
        NOMBREEMPLEADO = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        IDempleado = new javax.swing.JLabel();
        direcciones = new javax.swing.JLabel();
        roles = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonempleado.setBackground(new java.awt.Color(0, 0, 102));
        botonempleado.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        botonempleado.setForeground(new java.awt.Color(255, 255, 255));
        botonempleado.setText("EMPLEADO");
        botonempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonempleadoActionPerformed(evt);
            }
        });
        jPanel1.add(botonempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 270, 75));

        botoncliente.setBackground(new java.awt.Color(0, 0, 102));
        botoncliente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        botoncliente.setForeground(new java.awt.Color(204, 204, 255));
        botoncliente.setText("CLIENTE");
        botoncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonclienteActionPerformed(evt);
            }
        });
        jPanel1.add(botoncliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 270, 75));

        botonreserva.setBackground(new java.awt.Color(0, 0, 102));
        botonreserva.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        botonreserva.setForeground(new java.awt.Color(255, 255, 255));
        botonreserva.setText("RESERVA");
        botonreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonreservaActionPerformed(evt);
            }
        });
        jPanel1.add(botonreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 270, 75));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 115, 41, -1));

        botonhabitacion.setBackground(new java.awt.Color(0, 0, 102));
        botonhabitacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        botonhabitacion.setForeground(new java.awt.Color(255, 255, 255));
        botonhabitacion.setText("HABITACION");
        botonhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonhabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(botonhabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 270, 75));

        botonservicio.setBackground(new java.awt.Color(0, 0, 102));
        botonservicio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        botonservicio.setForeground(new java.awt.Color(255, 255, 255));
        botonservicio.setText("SERVICIO");
        botonservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonservicioActionPerformed(evt);
            }
        });
        jPanel1.add(botonservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 270, 75));

        botonusuario.setBackground(new java.awt.Color(0, 0, 102));
        botonusuario.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        botonusuario.setForeground(new java.awt.Color(255, 255, 255));
        botonusuario.setText("Usuarios");
        botonusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(botonusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 270, 75));

        botonfactura1.setBackground(new java.awt.Color(0, 0, 102));
        botonfactura1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        botonfactura1.setForeground(new java.awt.Color(255, 255, 255));
        botonfactura1.setText("FACTURA");
        botonfactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonfactura1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonfactura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 270, 75));

        btnReporte.setBackground(new java.awt.Color(0, 0, 102));
        btnReporte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("REPORTE");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 270, 70));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(java.awt.Color.lightGray);
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("_");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 50, 30));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 50, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO :");

        labeluser.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labeluser.setForeground(new java.awt.Color(255, 255, 255));
        labeluser.setText("-----------------------");
        labeluser.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labeluserAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(labeluser, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addComponent(labeluser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 640, 50));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fidelizacion_hotel-lujo.jpg"))); // NOI18N
        FONDO.setText("f");
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 740, 470));

        NOMBREEMPLEADO.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NOMBREEMPLEADO.setForeground(new java.awt.Color(255, 255, 255));
        NOMBREEMPLEADO.setText("jLabel4");
        jPanel1.add(NOMBREEMPLEADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));

        Telefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 80, 20));

        IDempleado.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        IDempleado.setForeground(new java.awt.Color(255, 255, 255));
        IDempleado.setText("jLabel3");
        jPanel1.add(IDempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 90, 40));

        direcciones.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        direcciones.setForeground(new java.awt.Color(255, 255, 255));
        direcciones.setText("jLabel3");
        jPanel1.add(direcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        roles.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        roles.setForeground(new java.awt.Color(255, 255, 255));
        roles.setText("jLabel3");
        jPanel1.add(roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonreservaActionPerformed
        // TODO add your handling code here:
        JFReserva R=new JFReserva();
        R.setVisible(true);
        JFReserva.txtEmpleado.setText(this.labeluser.getText());
        JFReserva.txtIDEmpleado.setText(MENU.IDempleado.getText());
    }//GEN-LAST:event_botonreservaActionPerformed

    private void botonclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonclienteActionPerformed
        // TODO add your handling code here:
        JFCliente C=new JFCliente();
        C.setVisible(true);
    }//GEN-LAST:event_botonclienteActionPerformed

    private void botonempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonempleadoActionPerformed
        // TODO add your handling code here:
        JFEmpleado E=new JFEmpleado();
        E.setVisible(true);
        
    }//GEN-LAST:event_botonempleadoActionPerformed

    private void botonhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonhabitacionActionPerformed
        // TODO add your handling code here:
       JFHabitacion H=new JFHabitacion();
       H.setVisible(true);
    }//GEN-LAST:event_botonhabitacionActionPerformed

    private void botonservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonservicioActionPerformed
        // TODO add your handling code here:
        JFServicio S= new JFServicio();
        S.setVisible(true);
    }//GEN-LAST:event_botonservicioActionPerformed

    private void botonfactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonfactura1ActionPerformed
        // TODO add your handling code here:
        JF_Factura F= new JF_Factura();
        F.setVisible(true);
        JF_Factura.resultadoEmpleado.setText(MENU.NOMBREEMPLEADO.getText());
    }//GEN-LAST:event_botonfactura1ActionPerformed

    private void labeluserAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labeluserAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_labeluserAncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonusuarioActionPerformed
        // TODO add your handling code here:
        JFusuario u=new JFusuario();
        u.setVisible(true);
    }//GEN-LAST:event_botonusuarioActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
      JFReportes C=new JFReportes();
        C.setVisible(true);
    }//GEN-LAST:event_btnReporteActionPerformed

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
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    public static javax.swing.JLabel IDempleado;
    public static javax.swing.JLabel NOMBREEMPLEADO;
    public static javax.swing.JLabel Telefono;
    private javax.swing.JButton botoncliente;
    public javax.swing.JButton botonempleado;
    private javax.swing.JButton botonfactura1;
    private javax.swing.JButton botonhabitacion;
    private javax.swing.JButton botonreserva;
    private javax.swing.JButton botonservicio;
    public javax.swing.JButton botonusuario;
    private javax.swing.JButton btnReporte;
    public static javax.swing.JLabel direcciones;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel labeluser;
    public static javax.swing.JLabel roles;
    // End of variables declaration//GEN-END:variables
}
