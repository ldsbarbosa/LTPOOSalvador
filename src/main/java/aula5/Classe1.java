package aula5;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Classe1 {
    public float calculaAlcance(float velocidade, float angulo) {
        float alcance, anguloRadianos;
        anguloRadianos = (float) ((angulo * 3.1415)/180);
        alcance = (float) ((Math.pow(velocidade, 2) * Math.sin(2*anguloRadianos))/9.8);
        return alcance;
    }
}
