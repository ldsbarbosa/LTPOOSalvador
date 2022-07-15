package aula11;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class VerificaSaladoException extends RuntimeException{
    private double valor;
    private double saldo;

    public VerificaSaladoException(double valor, double saldo) {
        super("O saldo de R$ " + saldo + " é insuficiente para um saque de R$" + valor);
        /*A classe VerificaSaladoException herdou a classe RuntimeException,
        mas não herdou seus construtores. Podemos acessá-los através da
        palavra-chave super do método construtor. Neste caso, vamos guardar
        uma mensagem que será utilizada pelo método getMessage*/
        setValor(valor);
        setSaldo(saldo);
    }
    public double getValor() {
        return valor;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
