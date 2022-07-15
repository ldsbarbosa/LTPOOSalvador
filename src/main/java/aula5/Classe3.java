package aula5;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Classe3 {
    private int numeroSegundo;
    private int numeroPrimeiro;
    private int tentativas = 0;	

    // Primeiro Numero
    public int getNumeroPrimeiro(){
        return numeroPrimeiro;
    }
    public void setNumeroPrimeiro(int numeroPrimeiro){
        this.numeroPrimeiro = numeroPrimeiro;
    }

    // Segundo Numero
    public int getNumeroSegundo(){
        return numeroSegundo;
    }
    public void setNumeroSegundo(int numeroSegundo){
        this.numeroSegundo = numeroSegundo;
    }

    //Adivinhar numero
    public int adivinhaNumero() {
        if(numeroPrimeiro == numeroSegundo)
            return 1;
        else
            if(numeroSegundo > numeroPrimeiro) {
                System.out.println("Tente um número menor.");
                return 0;
            }else {
                System.out.println("Tente um número maior.");
                return 0;
            }
    }
}
