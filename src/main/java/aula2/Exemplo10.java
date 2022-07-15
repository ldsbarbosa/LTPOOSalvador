package aula2;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo10 {
    public static void main(String args[]) {
        double var;
        Scanner x;
        x=new Scanner(System.in);
        System.out.println("Dessa vez, você pode inserir um numero com bastante casas após a virgula!");
        var = x.nextDouble();
        System.out.printf("Numero coletado: %f\n",var);
    }
}
