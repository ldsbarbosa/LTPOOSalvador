package aula4;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo2 {
    public static void main(String args[]) {
        Calculo soma;
        soma = new Calculo( );
        // soma.resultado = 5; Esta linha de código daria erro se executada.
        // A atributo "resultado" é uma variável de instancia
        soma.somaValores(2.0,3.0);
    }
}
