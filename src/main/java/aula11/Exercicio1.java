package aula11;

/**
 *
 * Desenvolva um código em java que:
    1- Tem uma classe com um método main;
    2- Define um array de números inteiros, com 50 posições de memória;
    3- Cada posição de memória deve armazenar um valor aleatório usando a classe Random;
    4- Adicione um try...catch no laço de laço de repetição que você usa para armazenar valores no array, pegando ArrayIndexOutOfBoundsException;
    5- Mostre todos valores armazenados no array
 * 
 * @author Lucas da Silva Barbosa
 */
import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        //Instanciando objetos
        Random aleatorio = new Random();

        //Criando variáveis
        int[] numeros = new int[50];
        int index;

        //Iniciando minha estrutura try...catch
        try {//Usando laço de repetição para atribuir e mostrar os valores.
            for(index = 0; index < numeros.length;index++) {
                numeros[index] = aleatorio.nextInt(100);
                System.out.printf("Número no indice [%d] = %d\n",index,numeros[index]);
            }
        }catch(ArrayIndexOutOfBoundsException excecao) {
            System.out.println("Não foi possível atribuir os valores!!");
        }
    }
}
