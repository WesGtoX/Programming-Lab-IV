package class01_2019_08_01;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wesley
 */
public class FormCalculadora extends javax.swing.JFrame {

    public FormCalculadora() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCalculadora = new javax.swing.JLabel();
        lblValor1 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        lblValor2 = new javax.swing.JLabel();
        txtValor2 = new javax.swing.JTextField();
        lblOperacao = new javax.swing.JLabel();
        cbxOperacao = new javax.swing.JComboBox<>();
        jbtCalcular = new javax.swing.JButton();
        jbtlimpar = new javax.swing.JButton();
        lblOperacoesRealizadas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOperacoesRealizadas = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCalculadora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCalculadora.setText("Calculadora");

        lblValor1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValor1.setText("Valor 1:");

        lblValor2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValor2.setText("Valor 2:");

        lblOperacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOperacao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOperacao.setText("Operação:");

        cbxOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtCalcular.setText("Calcular");

        jbtlimpar.setText("Limpar");

        lblOperacoesRealizadas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOperacoesRealizadas.setText("Operações realizadas");

        tblOperacoesRealizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblOperacoesRealizadas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValor2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOperacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbtCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxOperacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCalculadora)
                            .addComponent(lblOperacoesRealizadas))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCalculadora)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor1)
                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor2)
                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOperacao)
                    .addComponent(cbxOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblOperacoesRealizadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxOperacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtCalcular;
    private javax.swing.JButton jbtlimpar;
    private javax.swing.JLabel lblCalculadora;
    private javax.swing.JLabel lblOperacao;
    private javax.swing.JLabel lblOperacoesRealizadas;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JTable tblOperacoesRealizadas;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Calculadora");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        configurarTabela();
        preencherComboOperacao();
    }
    
    private void preencherComboOperacao() {
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        m.addElement("Soma");
        m.addElement("Subtração");
        m.addElement("Multiplicação");
        m.addElement("Divisão");
        cbxOperacao.setModel(m);
    }
    
    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        
        m.addColumn("Operação");
        m.addColumn("Valor 1");
        m.addColumn("Valor 2");
        m.addColumn("Resultado");
        tblOperacoesRealizadas.setModel(m);
    }
}
