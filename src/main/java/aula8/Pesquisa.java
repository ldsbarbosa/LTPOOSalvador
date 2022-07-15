package aula8;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Pesquisa {

    int qtdVezes(int[] valor, int numero) {
        int i, cont = 0;
        for(i = 0 ; i < valor.length; i++){
            cont += (valor[i] == numero) ? 1 : 0 ;
        }
        return cont;
    }
    
}
