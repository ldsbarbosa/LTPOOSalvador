package aula6;

import java.util.Random;
import java.util.Scanner;

/**
 *6.3 - Exercício c
    Escreva um método que calcula a distância entre dois pontos (x1,y1) e (x2,y2), com a leitura de
    parâmetros no próprio método. Escreva outro método com o mesmo nome, mas que passa os
    valores de x1, x2, y1 e y2, e que também calcula a distância entre dois pontos.
 * @author Lucas da Silva Barbosa
 */
public class Exercicio3 {
    public static void main(String arg[]) {
        Scanner leitor = new Scanner(System.in);
        float latitude1, longitude1, latitude2, longitude2, distancia;
        int decisao;

        System.out.println("Digite 1 se deseja informar uma distância ou "
                        + " digite 2 se deseja saber de uma distância aleatória.");
        decisao = leitor.nextInt();
        while (decisao != 1 && decisao != 2) {
                System.out.println("Informe ou 1 ou 2!");
                decisao = leitor.nextInt();
        }
        if(decisao == 1) {
                System.out.println("Informe a latitude da primeira posição!");
                latitude1 = leitor.nextFloat();
                System.out.println("Informe a longitude da primeira posição!");
                longitude1 = leitor.nextFloat();
                System.out.println("Informe a latitude da segunda posição!");
                latitude2 = leitor.nextFloat();
                System.out.println("Informe a longitude da segunda posição!");
                longitude2 = leitor.nextFloat();

                calculo(latitude1, longitude1, latitude2, longitude2);
        }
        if(decisao == 2) {
                calculo();
        }
    }

    public static void calculo(float latitude1,float longitude1,float latitude2,float longitude2){
        float distancia;

        distancia = (float) Math.sqrt(Math.pow(latitude1 - latitude2, 2) + Math.pow(longitude1 - longitude2, 2));
        System.out.printf("A distancia é de %.4f!",distancia);
    }

    public static void calculo() {
        Random gerador = new Random();
        float latitude1, longitude1, latitude2, longitude2, distancia;

        latitude1 = gerador.nextFloat();
        longitude1 = gerador.nextFloat();
        latitude2 = gerador.nextFloat();
        longitude2 = gerador.nextFloat();

        distancia = (float) Math.sqrt(Math.pow(latitude1 - latitude2, 2) + Math.pow(longitude1 - longitude2, 2));
        System.out.printf("A distancia é de %.4f!",distancia);
    }
}
