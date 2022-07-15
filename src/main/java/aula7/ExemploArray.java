package aula7;

import java.util.Random;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class ExemploArray {
    public void testaArray() {
        int index; // Indíce tipado como inteiro
        Random gerador = new Random(); // Instanciação da classe "Random"
        int[] numeros = new int[10]; // Vetor unidimensional de 10 itens
        
        for(index=0;index<numeros.length;index++){ // Laço for atribuindo 0 para o indice, dizendo que a condição do laço passar é se o indice for menor que o tamanho do laço, e incrimentando em 1 digito a cada passada
            numeros[index] = gerador.nextInt(100);
            System.out.println("valor["+index+"] = "+numeros[index]);
        }
    }

    void mostraArray(int[] vetor) {
        int i;
        //Primeira opção para percorrer um vetor.
        for(i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);}
        
        //Segunda opção para percorrer um vetor.
        System.out.println("Ou ainda");
        for(int n:vetor){
            System.out.println(n);}
    }

    void mostraArray2(int[] numeros) {
        int i;
        
        System.out.println("\nVetor processado no método mostraArray2");
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * 2;
            System.out.printf("%4d\t", numeros[i]);
        }
        System.out.println("");
    }

    void mostraArray3(int numero) {
        numero *= 2;
        System.out.println("O dobro do número armazenado exibido acima é: " + numero);
    }
}
