package aula8;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class MeioDeTransporte {
    private boolean ligado;
    private int velocidade;

    public boolean getLigado() {// Getter e Setter(2 metodos) para Ligado
        return ligado;
    }
    public void liga(){// Metodos liga() desliga()
        this.ligado = true;
    }
    public void desliga(){
        this.ligado = false;
        this.velocidade = 0;
    }
    
    public int getVelocidade() {// Getter e Setter para Velocidade
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        if (200 > velocidade && velocidade >= 0){
            this.velocidade = velocidade;
        } else{
            System.out.println("Insira uma velocidade válida");
        }
    }
}
