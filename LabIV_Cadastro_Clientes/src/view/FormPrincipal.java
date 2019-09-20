package view;

/**
 *
 * @author Wesley
 */
public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastroClientes = new javax.swing.JLabel();
        btnCadastrarClientes = new javax.swing.JButton();
        btnCadastrarUsuarios = new javax.swing.JButton();
        btnListarClientes = new javax.swing.JButton();
        btnListarUsuarios = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCadastroClientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCadastroClientes.setText("Cadastro de Clientes");

        btnCadastrarClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCadastrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/compose.png"))); // NOI18N
        btnCadastrarClientes.setText("Cadastrar Clientes");
        btnCadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClientesActionPerformed(evt);
            }
        });

        btnCadastrarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCadastrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/compose.png"))); // NOI18N
        btnCadastrarUsuarios.setText("Cadastrar Usuários");
        btnCadastrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuariosActionPerformed(evt);
            }
        });

        btnListarClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnListarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifyingglass.png"))); // NOI18N
        btnListarClientes.setText("Listar Clientes");
        btnListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClientesActionPerformed(evt);
            }
        });

        btnListarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnListarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifyingglass.png"))); // NOI18N
        btnListarUsuarios.setText("Listar Usuários");
        btnListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuariosActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/power.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCadastroClientes)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastroClientes)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClientesActionPerformed
        // Abrir o formulario CADASTRAR CLIENTE
        FormCadastrarCliente frm = new FormCadastrarCliente();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarClientesActionPerformed

    private void btnCadastrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuariosActionPerformed
        // Abrir o formulario CADASTRAR USUÁRIO
        FormCadastrarUsuario frm = new FormCadastrarUsuario();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarUsuariosActionPerformed

    private void btnListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClientesActionPerformed
        // Abrir o formulario PESQUISAR CLIENTE
        FormPesquisar frm = new FormPesquisar(0);
        frm.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btnListarClientesActionPerformed

    private void btnListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuariosActionPerformed
        // Abrir o formulario PESQUISAR USUÁRIO
        FormPesquisar frm = new FormPesquisar(1);
        frm.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btnListarUsuariosActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // Abrir o formulario LOGIN
        FormLogin frm = new FormLogin();
        frm.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarClientes;
    private javax.swing.JButton btnCadastrarUsuarios;
    private javax.swing.JButton btnListarClientes;
    private javax.swing.JButton btnListarUsuarios;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel lblCadastroClientes;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Cadastro de Clientes");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
}
