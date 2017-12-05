package br.com.sna.sisgerpedidos.business;

import br.com.sna.sisgerpedidos.model.ItemPedido;
import java.util.ArrayList;
import java.util.List;

/*
Armazena os produtos (Itens) e quantidades do pedido
*/

public class PedidoBus {
public List<ItemPedido> listaPedido;
    
    public PedidoBus(){
        listaPedido = new ArrayList<>();
    }
    
    public void adicionarItem(ItemPedido itemPed){
        listaPedido.add(itemPed);
    }
    
    public List<ItemPedido>listarItens(){
        return listaPedido;
    }    
}
