package aula11;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class SegundaClasse2 {
    private double resultado;
	
    public double dividirNumeros(int numerador, int denominador) throws DividirPorZeroException {
        if(denominador == 0) {
            throw new DividirPorZeroException(denominador);
        }else{
            this.resultado = (double) numerador/ (double) denominador;
            System.out.printf("O resultado da divisão de %d por %d resulta em %.3f",numerador,denominador,resultado);
            return this.resultado;
        }
    }
}
