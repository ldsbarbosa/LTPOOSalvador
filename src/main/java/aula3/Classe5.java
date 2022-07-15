package aula3;

import java.util.Scanner;

/**
 *
 * @author  Lucas da Silva Barbosa
 */
public class Classe5 {
    public void madeiraTriangulo2() {
        float madeira1,madeira2,madeira3;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o comprimento da primeira madeira!");
        madeira1 = leitor.nextFloat();
        System.out.println("Informe o comprimento da segunda madeira!");
        madeira2 = leitor.nextFloat();
        System.out.println("Informe o comprimento da terceira madeira!");
        madeira3 = leitor.nextFloat();
        
        if( madeira1<madeira2+madeira3 && madeira2<madeira1+madeira3 && madeira3<madeira2+madeira1) {
            System.out.println("Dá pra fazer um triangulo com as madeiras!");
            if (madeira1 == madeira2 && madeira2 == madeira3 && madeira1 == madeira3)
                System.out.println("Além disso, o triangulo é equilátero!");
            else
                if (madeira1 == madeira2 || madeira2 == madeira3 || madeira1 == madeira3)
                    System.out.println("Além disso, o triangulo é isoscéles!");
                else
                    System.out.println("Além disso, o triangulo é escaleno!");
        }
        else
            System.out.println("Não vai rolar de fazer um triangulo com as madeiras. :-(");
    }
}
