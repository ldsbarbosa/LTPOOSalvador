package aula7;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo3 {
    public static void main(String[] args) {
        int i;
        int[] numeros = {1,3,5,7,9};
        ExemploArray objeto1 = new ExemploArray();
        
        System.out.println("Array original antes do método");
        for(int n: numeros){// Imprime todos os items do Array pela primeira vez
            System.out.printf("%4d\t",n);
        }
        objeto1.mostraArray2(numeros); // Não é passado o array enquanto valor primitivo, e sim sua referência. Qualquer alteração na execução do método afetará o array original.
        
        System.out.println("Array original depois do método");
        for (int n : numeros) {// Imprime todos os items do Array após o método
            System.out.printf("%4d\t", n);
        }
    }
}
