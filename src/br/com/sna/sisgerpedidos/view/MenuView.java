
package br.com.sna.sisgerpedidos.view;
import br.com.sna.sisgerpedidos.business.EstoqueBus;
import br.com.sna.sisgerpedidos.model.ItemPedido;
import br.com.sna.sisgerpedidos.model.Pedido;
import br.com.sna.sisgerpedidos.model.Produto;

public class MenuView extends javax.swing.JFrame {
    
    public Pedido ped;
    public Produto prod;
    public ItemPedido itemPed;
    public EstoqueBus est;

    public MenuView() {
        initComponents();
        est = new EstoqueBus();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btProduto = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btPedido = new javax.swing.JButton();
        btEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Gerenciamento de Pedidos");
        setIconImages(null);
        setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerenciamento de Pedidos");

        btProduto.setText("Produto");
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutoActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btPedido.setText("Pedido");
        btPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedidoActionPerformed(evt);
            }
        });

        btEstoque.setText("Estoque");
        btEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEstoqueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(btProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEstoque)
                .addGap(55, 55, 55)
                .addComponent(btSair)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutoActionPerformed
        ProdutoView telaProd = new ProdutoView(est);
        telaProd.setVisible(true);
        
    }//GEN-LAST:event_btProdutoActionPerformed

    private void btPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedidoActionPerformed
        PedidoView telaPed = new PedidoView(est);
        telaPed.setVisible(true);
    }//GEN-LAST:event_btPedidoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEstoqueMouseClicked
        EstoqueView telaEst = new EstoqueView(est);
        telaEst.setVisible(true);
    }//GEN-LAST:event_btEstoqueMouseClicked
 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEstoque;
    private javax.swing.JButton btPedido;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}


        
