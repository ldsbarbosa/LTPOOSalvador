package aula11;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo1 {
    public static void main(String args[]) {
        System.out.println("início do m�todo main");
        Teste1 ts = new Teste1();
        int x = 10;
        int y = 0;
        System.out.printf("%d dividido por %d = %d\n",x,y,ts.calculo(x, y));
        System.out.println("fim do método main");
    }
}
