package aula2;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo8 {
    public static void main(String args[]) {
		 int var;
		 Scanner x = new Scanner(System.in);
		 
		 System.out.println("Entrada de numero inteiro no Java!\n");
		 System.out.println("Digite um numero inteiro");
		 var = x.nextInt();
		 System.out.printf("Numero inteiro armazenado: %d",var);
    }
}
