package aula11;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo7 {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositarValor(200);
        try{
            c.sacarValor(300);
        }catch(VerificaSaladoException e) {
            System.out.println(e.getMessage());
        /* O método getMessage() da classe Throwable é usado
        para retornar uma mensagem detalhada do objeto Throwable.
        Pode-se usar esse método para obter a mensagem de exceção
        detalhada como um valor de string.*/
        }
    }
}
