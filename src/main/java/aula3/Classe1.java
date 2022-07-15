package aula3;

import java.util.Scanner;

/**
 *
 * @author  Lucas da Silva Barbosa
 */
public class Classe1 {
    public void leDoisValores(){
        int inteiro1, inteiro2;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero inteiro");
        inteiro1 = leitor.nextInt();
        System.out.println("Informe outro numero inteiro");
        inteiro2 = leitor.nextInt();
        if(inteiro1 > inteiro2)
            System.out.printf("O maior numero inserido foi %d",inteiro1);
        else
            System.out.printf("O maior numero inserido foi %d",inteiro2);
    }
}
