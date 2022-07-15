package aula2;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo2 {
    public static void main(String args[]) {
        int x = 2;
        float z = 2.236f;// Não se esquecer de castar números decimais que
        float znumero = 741326549122.236f;// serão float, ou botando o f no final
        System.out.printf("Numeros!\n");//  ou com cast to (float)
        System.out.printf("Primeiro valor = %e\n",znumero);
        System.out.printf("Segundo valor = %E\n",znumero);
        System.out.printf("Terceiro valor = %.3f\n",z);
        System.out.printf("Quarto valor = %d", x);
    }
}
