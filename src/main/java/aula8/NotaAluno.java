package aula8;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class NotaAluno {
    public static void main(String[] args) {
        float notas[]=new float[5];
        float mediaNotas,soma=0;
        int i;
        Scanner var = new Scanner(System.in);
        System.out.println("Entre com as 5 notas");
        for(i=0;i<5;i++){
            notas[i] = var.nextFloat();
            soma+=notas[i];
        }
        mediaNotas=soma/5;
        System.out.printf("Media = %.1f\n",mediaNotas);
        System.out.println("notas abaixo da média:");
        for(i=0;i<5;i++){
            if(notas[i]<mediaNotas)
                System.out.println(notas[i]);
        }
    }
}
