package aula11;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Conta {
    private double valorTransacao;
    private double saldoConta;

    public void sacarValor(double valorTransacao) {
        if (this.saldoConta < valorTransacao) {
            throw new VerificaSaladoException(valorTransacao, this.saldoConta);// Sim, é VerificaSaladoException mesmo! Viva ao Salado!
        }
            this.saldoConta -= valorTransacao;
        }
     public void depositarValor(double valorTransacao){
        this.saldoConta += valorTransacao;
    }
}
