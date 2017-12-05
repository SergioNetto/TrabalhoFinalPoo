
package br.com.sna.sisgerpedidos.business;

import br.com.sna.sisgerpedidos.model.Produto;
import java.util.ArrayList;
import java.util.List;


public class EstoqueBus {
    public List<Produto>listaProdutos;
    
    public EstoqueBus() {
        listaProdutos = new ArrayList();
    }
    
    public void adicionarProduto(Produto prod){
        listaProdutos.add(prod);
    }
    
    public List<Produto>listarProdutos(){
        return listaProdutos;
    }
}
