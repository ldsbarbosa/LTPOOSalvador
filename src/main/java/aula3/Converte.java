package aula3;

import java.util.Scanner;

/**
 *
 * @author  Lucas da Silva Barbosa
 */
public class Converte {
    public void radianosParaGraus() {
        float radianos, graus;
        double pi = Math.PI;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com o valor em radianos");
        radianos = leitor.nextFloat();
        graus =(float) ((radianos*180)/pi);
        System.out.printf("O valor inserido, em graus, é de %f",graus);
    }
    public void grausParaRadianos() {
        float radianos, graus;
        double pi = Math.PI;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com o valor em graus");
        graus = leitor.nextFloat();
        radianos =(float) ((graus*pi)/180);
        System.out.printf("O valor inserido, em radianos, é de %f",radianos);
    }
}
