package com.mycompany.loginproyect.formularios;

import com.mycompany.loginproyect.clases.Usuarios;
import com.mycompany.loginproyect.clases.Usuario;
import javax.swing.JOptionPane;

public class FrmLogin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmLogin.class.getName());

    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        LblIngreso = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        TxtClave = new javax.swing.JTextField();
        LblClave = new javax.swing.JLabel();
        BtnIniciarSesion = new javax.swing.JButton();
        LblLoginIcon = new javax.swing.JLabel();
        LblUnitecnarLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));

        LblIngreso.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        LblIngreso.setForeground(new java.awt.Color(0, 0, 0));
        LblIngreso.setText("INGRESO AL SISTEMA");

        LblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        LblUsuario.setText("Usuario:");

        TxtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TxtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TxtUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        TxtClave.setBackground(new java.awt.Color(255, 255, 255));
        TxtClave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtClave.setForeground(new java.awt.Color(0, 0, 0));
        TxtClave.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtClaveActionPerformed(evt);
            }
        });

        LblClave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LblClave.setForeground(new java.awt.Color(0, 0, 0));
        LblClave.setText("Clave:");

        BtnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        BtnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        BtnIniciarSesion.setText("Iniciar sesión");
        BtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarSesionActionPerformed(evt);
            }
        });

        LblLoginIcon.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LblLoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/loginproyect/imagenes/login.png"))); // NOI18N

        LblUnitecnarLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/loginproyect/imagenes/logo.png"))); // NOI18N

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblUnitecnarLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(LblLoginIcon)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(LblUsuario)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TxtUsuario)
                        .addComponent(TxtClave)
                        .addComponent(BtnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(LblClave)
                        .addGap(110, 110, 110))
                    .addComponent(LblIngreso, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(63, 63, 63))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(LblIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LblLoginIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LblClave)
                        .addGap(18, 18, 18)
                        .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(BtnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(LblUnitecnarLogo)))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void TxtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtClaveActionPerformed

    private void BtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarSesionActionPerformed
        String username = TxtUsuario.getText().trim();
        String clave = new String(TxtClave.getText()).trim();

        if (username.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Usuarios usuarioDAO = new Usuarios();
        Usuario usuario = usuarioDAO.validarUsuario(username, clave);

        if (usuario != null) {

            FrmDashboard dashboard = new FrmDashboard(usuario);
            dashboard.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "❌ Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnIniciarSesionActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIniciarSesion;
    private javax.swing.JLabel LblClave;
    private javax.swing.JLabel LblIngreso;
    private javax.swing.JLabel LblLoginIcon;
    private javax.swing.JLabel LblUnitecnarLogo;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JTextField TxtClave;
    private javax.swing.JTextField TxtUsuario;
    // End of variables declaration//GEN-END:variables
}
