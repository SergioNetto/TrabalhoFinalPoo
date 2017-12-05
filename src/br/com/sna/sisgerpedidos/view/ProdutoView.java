
package br.com.sna.sisgerpedidos.view;

import br.com.sna.sisgerpedidos.GerenciarPedidos;
import br.com.sna.sisgerpedidos.business.EstoqueBus;
import br.com.sna.sisgerpedidos.model.Produto;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ProdutoView extends javax.swing.JFrame {

    public Produto prod;
    public EstoqueBus est;
    
    public ProdutoView(EstoqueBus est) {
        initComponents();
        this.est = est;
        lblTxtCodProduto.setText(String.valueOf(GerenciarPedidos.codProd));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodProduto = new javax.swing.JLabel();
        lblNomeProduto = new javax.swing.JLabel();
        lblQuantidadeProduto = new javax.swing.JLabel();
        lblValorProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtQuantProduto = new javax.swing.JTextField();
        txtValorProduto = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jTblProdutos = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        lblTxtCodProduto = new javax.swing.JLabel();

        setTitle("Cadastrar Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblCodProduto.setText("Codigo do Produto:");

        lblNomeProduto.setText("Nome do Produto:");

        lblQuantidadeProduto.setText("Quantidade:");

        lblValorProduto.setText("Valor:");

        txtValorProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorProdutoActionPerformed(evt);
            }
        });

        btAdicionar.setText("Adicionar");
        btAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAdicionarMouseClicked(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimparMouseClicked(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblProdutos.setViewportView(tblProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeProduto)
                            .addComponent(lblQuantidadeProduto)
                            .addComponent(lblValorProduto))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeProduto)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 123, Short.MAX_VALUE)))
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAdicionar)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btSair))
                            .addComponent(jTblProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTxtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodProduto)
                    .addComponent(lblTxtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblQuantidadeProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorProduto))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionar)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTblProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorProdutoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btSairActionPerformed

    private void btAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAdicionarMouseClicked
        prod = new Produto();
        try {
            prod.setCodProd(GerenciarPedidos.codProd);
            prod.setNomeProd(txtNomeProduto.getText());
            prod.setQtdProd(Integer.parseInt(txtQuantProduto.getText()));
            prod.setValorProd(Double.parseDouble(txtValorProduto.getText()));
            est.adicionarProduto(prod);
            apresentarListaNaTabela();
            GerenciarPedidos.codProd+=1;
            limparTela();
            

        }  catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Digite apenas números");
        }
    }//GEN-LAST:event_btAdicionarMouseClicked

    private void btLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimparMouseClicked
        limparTela();
    }//GEN-LAST:event_btLimparMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (est != null) apresentarListaNaTabela();
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jTblProdutos;
    private javax.swing.JLabel lblCodProduto;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JLabel lblTxtCodProduto;
    private javax.swing.JLabel lblValorProduto;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQuantProduto;
    private javax.swing.JTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables
    private void limparTela() {
        for (Component item : this.getContentPane().getComponents()) {
            if (item instanceof JTextField) {
                JTextField campo = (JTextField) item;
                campo.setText(null);
            }
        }
        txtNomeProduto.requestFocus();
        lblTxtCodProduto.setText(String.valueOf(GerenciarPedidos.codProd));
    }
    
        private void apresentarListaNaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
        modelo.setNumRows(0);
        for (Produto item : est.listarProdutos()) {
            modelo.addRow(new Object[]{
                item.getCodProd(),
                item.getNomeProd(),
                item.getQtdProd(),
                item.getValorProd()
            });
        }
    }
}

