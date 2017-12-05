
package br.com.sna.sisgerpedidos.view;

import br.com.sna.sisgerpedidos.business.EstoqueBus;
import br.com.sna.sisgerpedidos.model.Produto;
import javax.swing.table.DefaultTableModel;

/*
Serve apenas para a visualização dos produtos
*/

public class EstoqueView extends javax.swing.JFrame {

    EstoqueBus est;
    public EstoqueView(EstoqueBus est) {
        this.est = est;
        initComponents();
        apresentarDadosNoTable();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTblEstoque = new javax.swing.JTable();

        setTitle("Consultar Estoque");

        jTblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quant", "Valor"
            }
        ));
        jScrollPane2.setViewportView(jTblEstoque);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblEstoque;
    // End of variables declaration//GEN-END:variables

    private void apresentarDadosNoTable() {
        DefaultTableModel tabmodel = (DefaultTableModel) jTblEstoque.getModel();
        tabmodel.setNumRows(0);
        for (Produto item : est.listarProdutos()) {
            tabmodel.addRow(new Object[]{
                (Object) item.getCodProd(),
                (Object) item.getNomeProd(),
                (Object) item.getQtdProd(),
                (Object) item.getValorProd()}
            );
        }
       
    }

}
