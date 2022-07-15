package aula7;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Classe1 {
    public void recebeArray(int[] vetor, int numDesejado) {
        int qtdVezes = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == numDesejado){
                qtdVezes++;
            }
        }
        System.out.println("Vetor:");
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("%4d",vetor[i]);
        }
        if(qtdVezes == 0){
            System.out.println("\nO número desejado não aparece no vetor.");
        }else{
            System.out.printf("\nO número %d aparece %d vezes no vetor",numDesejado,qtdVezes);
        }
    }

    public float[] recebeArray2(float[] vetor) {
        float maiorNumero = vetor[0];
        float qtdVezes = 0;
        for(int i = 1; i < vetor.length; i++){
            if(maiorNumero < vetor[i]){
                maiorNumero = vetor[i];
            }
        }
        for(int i = 0; i < vetor.length; i++){
            if(maiorNumero == vetor[i]){
                qtdVezes++;
            }
        }
        float[] respostas = {maiorNumero, qtdVezes};
        return respostas;
    }
}
