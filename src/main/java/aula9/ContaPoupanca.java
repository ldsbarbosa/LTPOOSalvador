package aula9;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas da Silva Barbosa
 */
public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;
    
    // Métodos get e set
    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    // Métodos principais
    public void calcularNovoSaldo(){
        String mensagem = String.format("O seu saldo é de %.2f. Qual a taxa de rendimento desejada?",getSaldoConta());
        setDiaRendimento(Integer.parseInt(JOptionPane.showInputDialog(null,mensagem)));
        setSaldoConta(getSaldoConta()*getDiaRendimento());
        mensagem = String.format("O seu saldo agora é de %.2f. Saldo atualizado com sucesso!",getSaldoConta());
        JOptionPane.showMessageDialog(null,mensagem);
    }
}
