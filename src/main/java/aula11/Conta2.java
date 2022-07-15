package aula11;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Conta2 {
    private double valorTransacao = 0, saldoConta = 0;

    public void sacarValor(double valorTransacao) throws VerificaSaldoException {
        if (this.saldoConta < valorTransacao) {
            throw new VerificaSaldoException(valorTransacao);
    }
        this.saldoConta -= valorTransacao;
    }

    public void depositarValor(double valorTransacao) {
        this.saldoConta += valorTransacao;
    }
}
