
package br.com.sna.sisgerpedidos;

import br.com.sna.sisgerpedidos.view.MenuView;
/*
Menu principal com 4 opções:
- Produtos - para cadastrar os produtos
- Pedido - para cadastrar o pedido
- Estoque para Visualizar os produtos cadastrados
- Sair
*/

public class GerenciarPedidos {

    public static int codProd;
    public static int codPed;
    
    public static void main(String[] args) {
        codProd = 1;
        codPed = 1;
        MenuView menu = new MenuView();
        menu.setVisible(true);
    }
    
}
