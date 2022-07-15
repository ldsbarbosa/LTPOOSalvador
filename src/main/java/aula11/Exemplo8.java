package aula11;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo8 {
    public static void main(String[] args) {
        Conta2 c = new Conta2();
        c.depositarValor(200);
        try {
            c.sacarValor(300);
        }catch(VerificaSaldoException e){
            System.out.println(e.getMessage());
        }
   }
}
