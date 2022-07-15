package aula2;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo5 {
    public static void main(String args[]) {
	float x=2.7531978f;
        System.out.printf("Mudando somente casas após a virgula!\n");
	System.out.printf("%f\n",x);
	System.out.printf("%.1f\n",x);// Para precisão, usa-se o numero desejado
        // da precisão após um ponto entre a porcentagem e o f.
	System.out.printf("%.2f\n",x);
        System.out.printf("%.3f\n",x);
        System.out.printf("-----------------\n");
	System.out.printf("Mudando posicao e casas após a virgula!\n");
	System.out.printf("%f\n",x);// Já para alterar a posição, usa-se um numero
        // sem estar precedido de um ponto entre a porcentagem e o f.
	System.out.printf("%10.1f\n",x);
        System.out.printf("%20.3f\n",x);
	System.out.printf("%25.5f\n",x);
	System.out.printf("%30.7f\n",x);
        System.out.printf("%30f\n",x);
    }
}
