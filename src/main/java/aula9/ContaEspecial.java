package aula9;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas da Silva Barbosa
 */
public class ContaEspecial extends ContaBancaria{
    private float limiteCredito;

    //Métodos modificadores e acessores do atributo
    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    //Metodo alterado
    @Override
    public void sacarValor(){
        float quantidadeSacada;
        String mensagem;
        if(getSaldoConta() <= (-1 * getLimiteCredito())){
            mensagem = String.format("Você não pode sacar! Seu limite é de %.2f",getLimiteCredito());
            JOptionPane.showMessageDialog(null,mensagem);
        }else{
            mensagem = String.format("O seu saldo é %.2f.Quanto você deseja sacar?",getSaldoConta());
            quantidadeSacada = Float.parseFloat(JOptionPane.showInputDialog(mensagem));
            if(quantidadeSacada > (getSaldoConta()+getLimiteCredito())){
                while(quantidadeSacada > (getSaldoConta()+getLimiteCredito())){
                    quantidadeSacada = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor válido."));
                }
            }
            setSaldoConta(getSaldoConta()-quantidadeSacada);
            mensagem = String.format("O seu saldo agora é de %.2f. Saque realizado com sucesso!",getSaldoConta());
            JOptionPane.showMessageDialog(null,mensagem);
        }
    }
}
