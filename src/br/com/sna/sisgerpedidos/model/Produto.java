
package br.com.sna.sisgerpedidos.model;


public class Produto {
   private int codProd; 
   private String nomeProd;
   private int qtdProd;
   private double valorProd;  
   
   public Produto(){
       nomeProd = "";
       qtdProd = 0;
       valorProd = 0.0;
   }
   
    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public int getCodProd() {
        return codProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public int getQtdProd() {
        return qtdProd;
    }

    public void setQtdProd(int qtdProd) {
        this.qtdProd = qtdProd;
    }

    public double getValorProd() {
        return valorProd;
    }

    public void setValorProd(double valorProd) {
        this.valorProd = valorProd;
    }
}


