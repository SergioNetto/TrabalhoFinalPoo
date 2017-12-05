
package br.com.sna.sisgerpedidos.view;

import br.com.sna.sisgerpedidos.GerenciarPedidos;
import br.com.sna.sisgerpedidos.business.EstoqueBus;
import br.com.sna.sisgerpedidos.business.PedidoBus;
import br.com.sna.sisgerpedidos.model.ItemPedido;
import br.com.sna.sisgerpedidos.model.Pedido;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PedidoView extends javax.swing.JFrame {
    public ItemPedido itemPed;
    public EstoqueBus est;
    public Pedido ped;
    public PedidoBus pedBus;
            
    public PedidoView(EstoqueBus est) {
        initComponents();
        this.est = est;
        ped = new Pedido();
        pedBus = new PedidoBus();
        Date data = new Date();
        SimpleDateFormat dataPedido = new SimpleDateFormat("dd/MM/yyyy");
        ped.setDataPedido(String.valueOf(dataPedido.format(data)));
        lblTxtNumPedido.setText(String.valueOf(GerenciarPedidos.codPed));
        lblTxtDataPedido.setText(ped.getDataPedido());           
        lblTxtValorTotalPedido.setText(String.valueOf(0));        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumPedido = new javax.swing.JLabel();
        lblDataPedido = new javax.swing.JLabel();
        lblValorTotalPedido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblItens = new javax.swing.JTable();
        btAdicionarItem = new javax.swing.JButton();
        btFecharPedido = new javax.swing.JButton();
        lblTxtValorTotalPedido = new javax.swing.JLabel();
        lblTxtDataPedido = new javax.swing.JLabel();
        lblTxtNumPedido = new javax.swing.JLabel();

        setTitle("Cadastrar Pedido");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        lblNumPedido.setText("Numero do Pedido:");

        lblDataPedido.setText("Data do pedido:");

        lblValorTotalPedido.setText("Valor Total: ");

        jTblItens.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTblItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Produto", "Nome ", "Valor Unit", "Quantidade", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTblItens);

        btAdicionarItem.setText("Adicionar Item");
        btAdicionarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAdicionarItemMouseClicked(evt);
            }
        });

        btFecharPedido.setText("Fechar Pedido");
        btFecharPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFecharPedidoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btAdicionarItem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btFecharPedido))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblNumPedido)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblTxtNumPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDataPedido)
                                .addComponent(lblValorTotalPedido))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTxtValorTotalPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(lblTxtDataPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumPedido)
                    .addComponent(lblTxtNumPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDataPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTxtDataPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValorTotalPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTxtValorTotalPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionarItem)
                    .addComponent(btFecharPedido))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAdicionarItemMouseClicked
        ItemPedidoView telaItem = new ItemPedidoView(est, ped, pedBus);
        telaItem.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btAdicionarItemMouseClicked

/*
Fecha o pedido e gera uma "Nota" 
*/
    
    private void btFecharPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFecharPedidoMouseClicked
        NumberFormat moeda = new DecimalFormat("#0.00");
        String valor;
        StringBuilder sb = new StringBuilder();
        ped.setNumPedido(GerenciarPedidos.codPed);
        sb.append("Número do pedido: ").append(ped.getNumPedido()).append("\n");
        sb.append("Data do pedido:   ").append(ped.getDataPedido()).append("\n");        
        sb.append("Itens: ").append("\n");
        sb.append("------------------------------------------------------------------------------------------------------------------------").append("\n");
        for (ItemPedido itemPed : pedBus.listarItens()) {
            sb.append("Codigo: ");
            sb.append(itemPed.getCodProdutoItem()).append(" | Produto: ");
            sb.append(itemPed.getNomeProdutoItem()).append(" | Valor Item - R$ ");
            valor = moeda.format(itemPed.getValorUnitItem());
            sb.append(valor).append(" | Qtd: ");
            sb.append(itemPed.getQtdItem()).append(" | Valor Total Item: R$ ");   
            valor = moeda.format(itemPed.getValorTotItem());
            sb.append(valor).append("\n");
        }
        sb.append("------------------------------------------------------------------------------------------------------------------------").append("\n");
        valor = moeda.format(ped.getValorTotalPedido());
        sb.append("Total do pedido:  R$ ").append(valor).append("\n"); 
        
        JOptionPane.showMessageDialog(null, sb.toString());
        GerenciarPedidos.codPed+=1;
        this.setVisible(false);        
    }//GEN-LAST:event_btFecharPedidoMouseClicked

    // Atualiza as informações quando omfoco volta para a janela
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        atualizaTela();
    }//GEN-LAST:event_formWindowGainedFocus



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarItem;
    private javax.swing.JButton btFecharPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblItens;
    private javax.swing.JLabel lblDataPedido;
    private javax.swing.JLabel lblNumPedido;
    private javax.swing.JLabel lblTxtDataPedido;
    private javax.swing.JLabel lblTxtNumPedido;
    private javax.swing.JLabel lblTxtValorTotalPedido;
    private javax.swing.JLabel lblValorTotalPedido;
    // End of variables declaration//GEN-END:variables

    public void atualizaTela(){
        DefaultTableModel tabmodel = (DefaultTableModel) jTblItens.getModel();
        tabmodel.setNumRows(0);
        double soma=0;
        for (ItemPedido itemPed : pedBus.listarItens()) {
            soma+=itemPed.getValorTotItem();
            tabmodel.addRow(new Object[]{
                (Object) itemPed.getCodProdutoItem(),
                (Object) itemPed.getNomeProdutoItem(),
                (Object) itemPed.getValorUnitItem(),
                (Object) itemPed.getQtdItem(),       
                (Object) itemPed.getValorTotItem(),   
            }
            );
        }
        lblTxtValorTotalPedido.setText(String.valueOf(soma));
        ped.setValorTotalPedido(Double.parseDouble(lblTxtValorTotalPedido.getText()));
    }

}
