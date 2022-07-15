package aula2;

import java.util.Scanner;

/**
 *a ) Crie a classe chamada DeclaracaoVariaveis.java e dentro do método main faça o seguinte:
     Declare uma variável do tipo String para armazenar o nome de um carro;
     Declare uma variável do tipo int para armazenar a velocidade máxima desse carro;
     Declare uma variável do tipo float para armazenar o tempo de aceleração de 0 a 100 desse
    carro;
     Declare uma variável do tipo double para armazenar o preço desse carro;
     Leia pelo teclado o nome, a velocidade máxima, o tempo de aceleração de 0 a 100 e preço
    de um carro, e armazene nas referidas variáveis;
     Mostre uma frase com todas essas informações.

 * @author Lucas da Silva Barbosa
 */
public class DeclaracaoVariaveis {
    public static void main(String args[]){
        String carro;
        int velMaxCarro;
        float acelCarro;
        double precoCarro;
        Scanner x;
        x = new Scanner(System.in);

        System.out.println("Entre com os dados do carro! A aceleracao, terceira entrada, é de 0 a 100.");
        carro = x.nextLine();
        velMaxCarro = x.nextInt();
        acelCarro = x.nextFloat();
        precoCarro = x.nextDouble();

        System.out.printf("O carro "+carro);
        System.out.printf(" possui velocidade máxima de %d km/s ",velMaxCarro);
        System.out.printf("com aceleracao de %.2f m/s.",acelCarro);
        System.out.printf("Seu preco é, em reais à vista, de "+precoCarro);
    }
}
