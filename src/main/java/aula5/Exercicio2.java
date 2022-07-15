package aula5;

import java.util.Scanner;

/**
 *b) Imagine que você está fazendo um jogo sobre Corrida de Dragsters (um tipo corrida envolvendo
    um veículo leve com motores extremamente potentes, especialmente projetados para provas de
    arrancadas em retas). O código abaixo visa criar um programa onde você deve entrar com o
    valor da aceleração e da distância e o referido programa calcula a velocidade final, usando a
    Equação de Torricelli.
    * 
 *Observações:
     Considera-se que a velocidade inicial (V1) é zero.
     A velocidade é calculada originalmente em m/s e deve ser convertida para km/h antes de
    mostrar o resultado na tela. Para isso o programa deve multiplicar a velocidade calculada
    por 3.6.
    Crie uma classe com um método com duas variáveis de instância: aceleração e distância, depois crie
    os métodos gets e sets para cada um desses campos da classe, crie também um método que calcula e
    retorna a velocidade final.
    Crie outra classe com o método main que lê os valores da aceleração e distância e chama o método
    da primeira classe que calcula a velocidade final. Por fim mostre a informação se a velocidade final
    bateu um novo recorde ou não. 
 * @author Lucas da Silva Barbosa
 */
public class Exercicio2 {
    public static void main(String args[]) {
        float aceleracao, distancia, velocidade;
        Scanner leitor = new Scanner(System.in);
        Classe2 objeto2 = new Classe2();

        System.out.println("--Corrida de Dragsters--");
        System.out.println("Entre com a aceleração do veiculo, em metros por segundo ao quadrado.");
        aceleracao = leitor.nextFloat();
        objeto2.setAceleracao(aceleracao);
        
        System.out.println("Entre com a distancia que o veiculo deve percorrer, em metros.");
        distancia = leitor.nextFloat();
        objeto2.setDistancia(distancia);

        velocidade = objeto2.calculaVelocidade();
        velocidade *= 3.6;
        
        System.out.printf("A velocidade final do veículo é de %f quilometros por hora!\n",velocidade);
        if(velocidade > 100) {
            System.out.println("Você bateu o recorde!!");
        }else {
            System.out.println("Você não bateu o recorde.");
        }
    }
}
