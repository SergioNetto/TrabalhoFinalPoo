
package br.com.sna.sisgerpedidos.view;

import br.com.sna.sisgerpedidos.GerenciarPedidos;
import br.com.sna.sisgerpedidos.exception.LeituraException;
import br.com.sna.sisgerpedidos.business.EstoqueBus;
import br.com.sna.sisgerpedidos.business.PedidoBus;
import br.com.sna.sisgerpedidos.model.ItemPedido;
import br.com.sna.sisgerpedidos.model.Pedido;
import br.com.sna.sisgerpedidos.model.Produto;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ItemPedidoView extends javax.swing.JFrame {

    EstoqueBus est;
    ItemPedido itemPed;
    Pedido ped;
    PedidoBus pedBus;
    public int quantidade;
    public double valor;
    
    public ItemPedidoView(EstoqueBus est, Pedido ped, PedidoBus pedBus) {
        initComponents();
        this.est = est;
        this.ped = ped;
        this.pedBus = pedBus;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodProdItem = new javax.swing.JLabel();
        txtCodProdItem = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        lblNomeProdutoItem = new javax.swing.JLabel();
        lblTxtNomeProdItem = new javax.swing.JLabel();
        lblValorProdItem = new javax.swing.JLabel();
        lblTxtValorProdItem = new javax.swing.JLabel();
        lblQtdProdItem = new javax.swing.JLabel();
        txtQuantProdItem = new javax.swing.JTextField();
        btCalculaValorTotal = new javax.swing.JButton();
        lblValorTotalItem = new javax.swing.JLabel();
        lblTxtValorTotalProdItem = new javax.swing.JLabel();
        btConfirmaItem = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        lblQuantDispItem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTxtQuantDispItem = new javax.swing.JLabel();

        setTitle("Inserir Item");

        lblCodProdItem.setText("Código do produto:");

        btBuscar.setText("Buscar");
        btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscarMouseClicked(evt);
            }
        });

        lblNomeProdutoItem.setText("Nome:");

        lblTxtNomeProdItem.setText(" ");

        lblValorProdItem.setText("Valor:");

        lblQtdProdItem.setText("Quantidade:");

        btCalculaValorTotal.setText("Calcular");
        btCalculaValorTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCalculaValorTotalMouseClicked(evt);
            }
        });

        lblValorTotalItem.setText("Valor Total:");

        btConfirmaItem.setText("Confirma Item");
        btConfirmaItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btConfirmaItemMouseClicked(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimparMouseClicked(evt);
            }
        });

        lblQuantDispItem.setText("Quantidade Disponível:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodProdItem)
                    .addComponent(lblNomeProdutoItem)
                    .addComponent(lblValorProdItem)
                    .addComponent(lblQtdProdItem)
                    .addComponent(lblValorTotalItem)
                    .addComponent(lblQuantDispItem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btConfirmaItem, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(txtCodProdItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTxtValorProdItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuantProdItem)
                    .addComponent(lblTxtValorTotalProdItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTxtQuantDispItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTxtNomeProdItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBuscar)
                    .addComponent(btCalculaValorTotal)
                    .addComponent(btLimpar))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodProdItem)
                            .addComponent(txtCodProdItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeProdutoItem)
                            .addComponent(lblTxtNomeProdItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValorProdItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQuantDispItem))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTxtValorProdItem, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTxtQuantDispItem, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdProdItem)
                    .addComponent(txtQuantProdItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCalculaValorTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValorTotalItem)
                    .addComponent(lblTxtValorTotalProdItem, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmaItem)
                    .addComponent(btLimpar))
                .addGap(0, 66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void testaCampo(String teste, int tipo) throws LeituraException{
        try {
            if(teste.equals("")) throw new LeituraException(tipo);
            if((tipo==3)&&(Integer.parseInt(txtQuantProdItem.getText()) > quantidade)) throw new LeituraException(tipo);
            if((tipo==4)&&(Integer.parseInt(txtQuantProdItem.getText()) < 1)) throw new LeituraException(tipo);
        } catch (LeituraException ex) {
            throw ex;
        }
    }
    
    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked
        try {
            this.testaCampo(txtCodProdItem.getText(), 1);
            for (Produto item : est.listarProdutos()) {
                if (Integer.parseInt(txtCodProdItem.getText()) == item.getCodProd()){                
                    lblTxtNomeProdItem.setText(item.getNomeProd());
                    lblTxtValorProdItem.setText(String.valueOf(item.getValorProd())); 
                    lblTxtQuantDispItem.setText(String.valueOf(item.getQtdProd())); 
                    quantidade = item.getQtdProd();
                    valor= item.getValorProd();
                    break;
                }
            }    
        } catch (LeituraException ex) {            
            JOptionPane.showMessageDialog(null,"Aconteceu o erro: " + ex.getMessage());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Digite apenas números");
        }
            
    }//GEN-LAST:event_btBuscarMouseClicked

    private void btCalculaValorTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCalculaValorTotalMouseClicked
        try {
            this.testaCampo(txtCodProdItem.getText(), 1);
            this.testaCampo(txtQuantProdItem.getText(), 2);
            this.testaCampo(txtQuantProdItem.getText(), 3);            
            this.testaCampo(txtQuantProdItem.getText(), 4);
            lblTxtValorTotalProdItem.setText(String.valueOf(Integer.parseInt(txtQuantProdItem.getText())*valor));  
        } catch (LeituraException ex) {            
            JOptionPane.showMessageDialog(null,"Aconteceu o erro: " + ex.getMessage());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Digite apenas números");
        }
  
    }//GEN-LAST:event_btCalculaValorTotalMouseClicked

    private void btConfirmaItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConfirmaItemMouseClicked
        itemPed = new ItemPedido();
        try {
            itemPed.setCodProdutoItem(Integer.parseInt(txtCodProdItem.getText()));
            itemPed.setNomeProdutoItem(lblTxtNomeProdItem.getText());
            itemPed.setQtdItem(Integer.parseInt(txtQuantProdItem.getText()));
            itemPed.setValorUnitItem(valor);
            itemPed.setValorTotItem((Integer.parseInt(txtQuantProdItem.getText())*valor));           
            pedBus.adicionarItem(itemPed);   
            
            // acerta qdt do estoque           
            for (Produto item : est.listarProdutos()) {
                if (Integer.parseInt(txtCodProdItem.getText()) == item.getCodProd()){                      
                    item.setQtdProd(item.getQtdProd()-itemPed.getQtdItem());                  
                    break;
                }
            }            
            this.setVisible(false);
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_btConfirmaItemMouseClicked

    private void btLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimparMouseClicked
        limparTela();
    }//GEN-LAST:event_btLimparMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCalculaValorTotal;
    private javax.swing.JButton btConfirmaItem;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCodProdItem;
    private javax.swing.JLabel lblNomeProdutoItem;
    private javax.swing.JLabel lblQtdProdItem;
    private javax.swing.JLabel lblQuantDispItem;
    private javax.swing.JLabel lblTxtNomeProdItem;
    private javax.swing.JLabel lblTxtQuantDispItem;
    private javax.swing.JLabel lblTxtValorProdItem;
    private javax.swing.JLabel lblTxtValorTotalProdItem;
    private javax.swing.JLabel lblValorProdItem;
    private javax.swing.JLabel lblValorTotalItem;
    private javax.swing.JTextField txtCodProdItem;
    private javax.swing.JTextField txtQuantProdItem;
    // End of variables declaration//GEN-END:variables

    private void limparTela() {
        for (Component item : this.getContentPane().getComponents()) {
            if (item instanceof JTextField) {
                JTextField campo = (JTextField) item;
                campo.setText(null);
            }
        }
        lblTxtNomeProdItem.setText("");
        lblTxtValorProdItem.setText("");
        lblTxtQuantDispItem.setText("");
        lblTxtValorTotalProdItem.setText("");        
        txtCodProdItem.requestFocus();
    }


}



