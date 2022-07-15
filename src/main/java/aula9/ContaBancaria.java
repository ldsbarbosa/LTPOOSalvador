package aula9;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas da Silva Barbosa
 */
public class ContaBancaria {
    private String cliente;
    private int numeroConta;
    private float saldoConta = 100;

    // Get e Set dos atributos à cima
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }
    
    // Metodos principais
    public void sacarValor(){
        float quantidadeSacada;
        String mensagem;
        if(saldoConta <= 0){
            JOptionPane.showMessageDialog(null,"Você não pode sacar!");
        }else{
            mensagem = String.format("O seu saldo é %.2f.Quanto você deseja sacar?",this.saldoConta);
            quantidadeSacada = Float.parseFloat(JOptionPane.showInputDialog(mensagem));
            if(quantidadeSacada > saldoConta){
                while(quantidadeSacada > saldoConta){
                    quantidadeSacada = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor válido."));
                }
            }
            saldoConta -= quantidadeSacada;
            mensagem = String.format("O seu saldo agora é de %.2f. Saque realizado com sucesso!",this.saldoConta);
            JOptionPane.showMessageDialog(null,mensagem);
        }
    }
    
    public void depositarValor(){
        float quantidadeDepositada;
        String mensagem;
        
        mensagem = String.format("O seu saldo é %.2f.Quanto você deseja depositar?",this.saldoConta);
        quantidadeDepositada = Float.parseFloat(JOptionPane.showInputDialog(mensagem));
        saldoConta += quantidadeDepositada;
        mensagem = String.format("O seu saldo agora é de %.2f. Saque realizado com sucesso!",this.saldoConta);
        JOptionPane.showMessageDialog(null,mensagem);

    }
}
