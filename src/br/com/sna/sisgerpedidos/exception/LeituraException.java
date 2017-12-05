
package br.com.sna.sisgerpedidos.exception;

/*
Trata várias exceções chamadas dos campos de leitura de 
acordo com o código do exceção
*/

public class LeituraException extends Exception{
    private int codigo;
    private String mensagem;
    
    public LeituraException(int codigo){
        this.codigo = codigo;
        tratarExcecao();
    }

    private void tratarExcecao() {
        if(codigo == 1){
            mensagem = "Digite o código do produto!";
        }
        if(codigo == 2){
            mensagem = "Digite a quantidade desejada!";
        }
        if(codigo == 3){
            mensagem = "Quantidade acima da disponivel em estoque!";
        }
        if(codigo == 4){
            mensagem = "Quantidade deve ser de pelo menos 1(UMA) unidade";
        }
    }
    @Override
    public String getMessage(){
        return mensagem;
    }
}
