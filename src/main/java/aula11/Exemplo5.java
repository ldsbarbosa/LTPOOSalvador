package aula11;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo5 {
    static void verificaIdade(int idade) {
        if (idade < 16) {
            throw new ArithmeticException("Não pode viajar sozinha sem expressa autorização judicial\n");
        }else{
            System.out.println("Já pode viajar sozinha!!\n");
        }
    }

    public static void main(String[] args) {
        try{
            verificaIdade(15);
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Procure um posto do Juizado de Menores\n");
        }
    }
}
