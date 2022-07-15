package aula3;

import java.util.Scanner;

/**
 *
 * @author  Lucas da Silva Barbosa
 */
public class Classe2 {
    public void comparaParImpar() {
        int inteiro1;
	Scanner leitor = new Scanner(System.in);
	System.out.println("Informe um numero inteiro");
	inteiro1 = leitor.nextInt();
	if(inteiro1 % 2 == 0)
            System.out.printf("O numero é par!!");
	else
            System.out.printf("O numero é impar!!");
    }    
}
