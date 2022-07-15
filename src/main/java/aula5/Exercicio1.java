package aula5;

import java.util.Scanner;

/**
 *a) Imagine que você está tentando fazer um jogo de luta medieval com canhões, e tenta simular a
realidade. Para isso você precisa utilizar equações da física para determinar o alcance da bala do
canhão. Imagine também que o alvo está a 300 metros do canhão e tem 50 metros de
comprimento. Faça um programa que calcula o alcance a partir da velocidade de lançamento e
do ângulo de tiro, e verifica se o tiro acertará alguma parte do alvo, utilizando as seguintes
fórmulas:

* Alcance = V^2 * sen(2*θ)/g

* onde:
* alcance = alcance máximo que o tiro de canhão poderá alcançar
* V0 = velocidade inicial do tiro de canhão
* θ = ângulo de tiro
* g = aceleração da gravidade (considere como sendo 9,8 m/s2)
* 
* Crie uma classe com um método com duas variáveis de instância: velocidade e ângulo, depois crie
* os métodos gets e sets para cada um desses campos da classe, crie também um método que calcula e
* retorna o alcance.
* Crie outra classe com o método main que lê os valores da velocidade e ângulo e chama o método da
* primeira classe que calcula o alcance. Por fim mostre a informação se atingiu o alvo ou não.
 
 * @author Lucas da Silva Barbosa
 */
public class Exercicio1 {
    public static void main(String args[]) {
        float velocidade, angulo, alcance;
        String mensagem;
        Scanner leitor = new Scanner(System.in);
        Classe1 objeto1 = new Classe1();

        System.out.println("--Canhão Medieval--");
        System.out.println("Entre com a velocidade inicial");
        velocidade = leitor.nextFloat();
        System.out.println("Entre com o angulo entre o canhão e o chão");
        angulo = leitor.nextFloat();
        
        alcance = objeto1.calculaAlcance(velocidade,angulo);
        
        mensagem = String.format("O alcance foi de %f metros", alcance);
        
        System.out.println(mensagem);
        if(300 <= alcance && alcance <= 350) {
            System.out.println("Você atingiu o alvo!");
        }else {
            System.out.println("Você errou o alvo.");
        }
    }
}
