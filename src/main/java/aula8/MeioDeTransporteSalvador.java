package aula8;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class MeioDeTransporteSalvador {
    protected boolean ligado;//protected para as subclasses poderem acessar
    protected int velocidade;
    public void liga(){
        this.ligado=true;
    }
    public void desliga(){
        this.ligado=false;
        setVelocidade(0);
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        if(velocidade>= 0)
            this.velocidade = velocidade;
        else
            System.out.println("Valor inválido!!");
    }
}
