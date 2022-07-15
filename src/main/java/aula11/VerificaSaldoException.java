package aula11;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class VerificaSaldoException extends Exception{
    public VerificaSaldoException(double valor) {
        super("Saldo insuficiente para um saque no valor de R$ " + valor);
    }
}
