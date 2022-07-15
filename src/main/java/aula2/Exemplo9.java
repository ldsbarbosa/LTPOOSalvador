package aula2;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo9 {
   public static void main(String args[]) {
        float var;
        Scanner x = new Scanner(System.in);
        System.out.println("Digite um numero com alguns digitos após a virgula.");
        var = x.nextFloat();
        System.out.printf("Valor armazenado: %f\n",var);
    } 
}
