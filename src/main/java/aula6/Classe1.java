package aula6;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Classe1 {
    private int somaDivisores = 0;
    
    public int getSomaDivisores(){
        return somaDivisores;
    }
    public void setSomaDivisores(int somaDivisores){
        this.somaDivisores = somaDivisores;
    }
    public String verificaNumPerfeito(int numero) {
        for(int indice = 1;indice<numero;indice++) {
            if(numero%indice==0) {
                somaDivisores += indice;
            }
        }
        
        if(getSomaDivisores() == numero) {
            return "O número é perfeito!";
        }else {
            return "O número não é perfeito. :-(";
        }
    }
}
