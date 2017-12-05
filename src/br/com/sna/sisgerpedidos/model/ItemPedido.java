
package br.com.sna.sisgerpedidos.model;

public class ItemPedido {
    private int codProdutoItem;
    private String nomeProdutoItem;
    private double valorUnitItem;
    private int qtdItem;
    private double valorTotItem;    

    public int getCodProdutoItem() {
        return codProdutoItem;
    }

    public void setCodProdutoItem(int codProdutoItem) {
        this.codProdutoItem = codProdutoItem;
    }

    public String getNomeProdutoItem() {
        return nomeProdutoItem;
    }

    public void setNomeProdutoItem(String nomeProdutoItem) {
        this.nomeProdutoItem = nomeProdutoItem;
    }

    public double getValorUnitItem() {
        return valorUnitItem;
    }

    public void setValorUnitItem(double valorUnitItem) {
        this.valorUnitItem = valorUnitItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public double getValorTotItem() {
        return valorTotItem;
    }

    public void setValorTotItem(double valorTotItem) {
        this.valorTotItem = valorTotItem;
    }
}
