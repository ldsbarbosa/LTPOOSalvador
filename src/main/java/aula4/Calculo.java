package aula4;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Calculo {
    private double resultado; //resultado é uma variável de instância
    public void somaValores(double x,double y){
	resultado = x+y; //x e y são variáveis locais
	System.out.println(x+" + "+y+" = "+resultado);
    }
}
