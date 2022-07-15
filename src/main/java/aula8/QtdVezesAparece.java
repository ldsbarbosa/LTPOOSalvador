package aula8;
import java.util.*;
/**
 *
 * @author Lucas da Silva Barbosa
 */
public class QtdVezesAparece {
    public static void main(String[] args) {
        int i, numero, qtdVezes;
        int[] valor = new int[10];
        
        Random aleatorio = new Random();
        Scanner leitor = new Scanner(System.in);
        
        Pesquisa objeto1 = new Pesquisa();
        
        for(i = 0; i < 10; i++){
            valor[i] = aleatorio.nextInt(5);
        }
        System.out.println("Qual número de 1 a 5 deseja consultar?");
        numero = leitor.nextInt();
        qtdVezes = objeto1.qtdVezes(valor,numero);
        if(qtdVezes == 0){
            System.out.println("O número não aparece no vetor.");
        }else{
            System.out.printf("O número aparece no vetor %d vezes.\n",qtdVezes);
            System.out.println("Vetor: ");
            for(i = 0; i < 10; i++){
                System.out.printf("%4d",valor[i]);
            }
        }
    }
}
