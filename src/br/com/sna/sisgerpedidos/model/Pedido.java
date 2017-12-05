
package br.com.sna.sisgerpedidos.model;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numPedido;
    private String dataPedido;
    private double valorTotalPedido;
    

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }
}
