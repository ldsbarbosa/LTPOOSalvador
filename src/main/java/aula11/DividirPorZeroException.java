package aula11;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class DividirPorZeroException extends Exception {
    public DividirPorZeroException(int denominador) {
        super("O denominador vale "+denominador+".");
    }
}
