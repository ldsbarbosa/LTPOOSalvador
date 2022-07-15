package aula5;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Classe2 {
    private float aceleracao, distancia;

    //Aceleracao
    public float getAceleracao(){
        return aceleracao;
    }

    public void setAceleracao(float aceleracao){
        this.aceleracao = aceleracao;
    }

    //Distancia
    public float getDistancia(){
        return distancia;
    }
    public void setDistancia(float distancia){
        this.distancia = distancia;
    }

    //Velocidade
    public float calculaVelocidade() {
        float velocidadeFinal;
        velocidadeFinal = (float) Math.sqrt(2*getAceleracao()*getDistancia());
        return velocidadeFinal;
    }
}
