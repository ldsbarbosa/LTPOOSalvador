package aula4;

import java.util.Scanner;

/**
 *a ) Crie uma classe com estes métodos:
         um método que recebe o comprimento de três pedaços de madeira, verifica se os
        mesmos podem formar um triângulo e retorna 0 em caso afirmativo e 1 em caso
        negativo;
         um outro método que verifica e informa na tela qual o tipo de triângulo que pode ser
        formado.
        Crie uma segunda classe, com o método main, que fará a leitura do comprimento de três
        pedaços de madeira e chama o método que verifica se os mesmos podem formar um triângulo
        ou não. Se puder formar um triângulo, esse método deverá chamar o outro que verifica que tipo
        de triângulo pode ser formado, caso contrário deverá informar a seguinte frase “não pode formar
        um triângulo”. Use os métodos printf ou println da classe System e os métodos da classe
        Scanner.

 * @author Lucas da Silva Barbosa
 */
public class Exercicio1 {
    public static void main(String args[]) {
        float primeiraMedida, segundaMedida, terceiraMedida;
        Scanner leitor = new Scanner(System.in);
        Classe1 acai = new Classe1();

        System.out.println("Informe três comprimentos abaixo: \n");
        System.out.println("Primeiro comprimento: ");
        primeiraMedida = leitor.nextFloat();
        System.out.println("Segundo comprimento: ");
        segundaMedida = leitor.nextFloat();
        System.out.println("Terceiro comprimento: ");
        terceiraMedida = leitor.nextFloat();

        acai.calculaComprimento(primeiraMedida,segundaMedida,terceiraMedida);
    }
}
