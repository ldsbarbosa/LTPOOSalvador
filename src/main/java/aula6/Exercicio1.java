package aula6;

import java.util.Random;

/**
 *6.1 - Exercício a
    Leia as coordenadas x e y de dois pontos e em seguida calcule a distância entre os dois pontos:
    d = raiz ( (x2 – x1) ^2 + (y2 – y1) ^2 ).
 * @author Lucas da Silva Barbosa
 */
public class Exercicio1 {
    public static void main(String arg[]) {
        Random gerador = new Random();
        float latitude1, longitude1, latitude2, longitude2, distancia;

        latitude1 = gerador.nextFloat();
        longitude1 = gerador.nextFloat();
        latitude2 = gerador.nextFloat();
        longitude2 = gerador.nextFloat();

        distancia = (float) Math.sqrt(Math.pow(latitude1 - latitude2, 2) + Math.pow(longitude1 - longitude2, 2));
        System.out.printf("A distancia é de %f!",distancia);
    }
}
