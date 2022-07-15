package aula7;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo4 {
    public static void main(String[] args){
        int[] vetor={1,3,5,7,9};
        ExemploArray var = new ExemploArray();
        
        System.out.println("O número armazenado na posição 4 é " + vetor[3]);
        
        var.mostraArray3(vetor[3]);
        
        System.out.println("O número armazenado na posição 4 é " + vetor[3]);
        /*Nesse caso, o valor alterado no método não altera o valor 
        original do elemento do array, pois se passa um valor primitivo, e não uma referência a um objeto, por exemplo, um array*/
    }
}
