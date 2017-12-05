
package br.com.sna.sisgerpedidos;

import br.com.sna.sisgerpedidos.view.MenuView;


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
