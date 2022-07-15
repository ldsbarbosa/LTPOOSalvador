package aula11;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Teste2 {
    public void armazena(){
        System.out.println("início do m�todo armazena");
        double dobro[] = new double[5];
        int i;
        for(i=0;i<=5;i++){//Atenção: neste caso as posições do array vão de 0 a 4
            dobro[i] = i*2;
        }
    }
}
