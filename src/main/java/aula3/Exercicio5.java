package aula3;

/**
 *d ) Crie uma classe com um método que lê o comprimento de 3 pedaços de madeira e verifica se os
    mesmos podem formar um triângulo, ou seja, se cada lado é menor que a soma dos outro dois.
    Esse método deve ser chamado pelo método main de outra classe do mesmo projeto.
    A < B + C
    B < A + C
    C < A + B
 * @author  Lucas da Silva Barbosa
 */
public class Exercicio5 {
    public static void main(String args[]) {
        Classe5 pitomba = new Classe5();
        pitomba.madeiraTriangulo2();
    }
}
