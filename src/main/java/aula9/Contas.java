package aula9;
import javax.swing.JOptionPane;
/**
 *Exercício 1 – Desenvolva os seguintes códigos
    1. Classe: ContaBancaria
         Variáveis de instância:
        o cliente (String)
        o numeroConta (int)
        o saldoConta (float)
         métodos:
        o gets e sets
        o sacarValor (não permite valor negativo)
        o depositarValor
    2. Classe: ContaPoupaca (herda ContaBancaria)
         Variáveis de instância:
        o diaRendimento (int)
         métodos:
        o gets e sets
        o calcularNovoSaldo (recebe a taxa de rendimento e atualiza o saldo)
    3. Classe: ContaEspecial (herda ContaBancaria)
         Variáveis de instância:
        o limiteCredito (float)
         métodos:
        o gets e sets
        o sacarValor (permitir o saldo negativo até o valor do limite de crédito)
    4. Classe: Contas
         Criar um método main com menu que contenha os seguintes itens:
        o Incluir dados relativos ás contas dos clientes
        o Sacar determinado valor da(s) sua(s) conta(s)
        o Depositar determinado valor da(s) sua(s) conta(s)
        o Mostrar novo saldo do cliente, a partir da taxa de rendimento, daqueles que possuem conta
        poupança
        o Mostrar os dados da conta de um cliente
 * @author Lucas da Silva Barbosa
 */
public class Contas {
    public static void main(String[] args) {
        String mensagem;
        String decisao1 = "a";
        String decisao2 = "a";
        boolean decisaoBoolean1 = true;
        boolean decisaoBoolean2 = true;
        
        JOptionPane.showMessageDialog(null, "Bem vindo ao Banco UniProjeção!");
        while(decisaoBoolean1){
            decisao1 = JOptionPane.showInputDialog(null, "A sua conta é poupança ou especial?");
            if("Poupança".equals(decisao1) || "Especial".equals(decisao1)){
                decisaoBoolean1 = false;
            }
        }
        switch(decisao1){
            case "Poupança":
                ContaPoupanca contaP = new ContaPoupanca();
                contaP.setCliente(JOptionPane.showInputDialog(null, "Qual seu nome?"));
                contaP.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número da sua conta?")));
                contaP.setSaldoConta(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o seu saldo?")));
                contaP.setDiaRendimento(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o rendimento por dia?")));
                while(decisaoBoolean2){
                    decisao2 = JOptionPane.showInputDialog(null, "Deseja realizar a operação de sacar, depositar ou calcular o novo saldo?");
                    if("Saque".equals(decisao2) || "Depósito".equals(decisao2) || "Calcúlo".equals(decisao2)){
                        decisaoBoolean2 = false;
                    }
                }
                switch(decisao2){
                    case "Saque":
                        contaP.sacarValor();
                        break;
                    case "Depósito":
                        contaP.depositarValor();
                        break;
                    case "Calcúlo":
                        contaP.calcularNovoSaldo();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Algo não esperado aconteceu");
                        break;
                }
                mensagem = String.format("POUPANÇA\nNome do cliente: %s"
                    + "\nNumero da conta: %d\n"
                    + "Saldo: %.2f\n"
                    + "Rendimento aplicado: %d",contaP.getCliente(),contaP.getNumeroConta()
                    ,contaP.getSaldoConta(),contaP.getDiaRendimento());
                JOptionPane.showMessageDialog(null, mensagem);
                break;
            case "Especial":
                ContaEspecial contaE = new ContaEspecial();
                contaE.setCliente(JOptionPane.showInputDialog(null, "Qual seu nome?"));
                contaE.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número da sua conta?")));
                contaE.setSaldoConta(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o seu saldo?")));
                contaE.setLimiteCredito(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o limite do cartão?")));
                while(decisaoBoolean2){
                    decisao2 = JOptionPane.showInputDialog(null, "Deseja realizar a operação de sacar ou depositar?");
                    if("Saque".equals(decisao2) || "Depósito".equals(decisao2)){
                        decisaoBoolean2 = false;
                    }
                }
                switch(decisao2){
                    case "Saque":
                        contaE.sacarValor();
                        break;
                    case "Depósito":
                        contaE.depositarValor();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Algo não esperado aconteceu");
                        break;
                }
                mensagem = String.format("ESPECIAL\nNome do cliente: %s"
                    + "\nNumero da conta: %d\n"
                    + "Saldo: %.2f\n"
                    + "Limite da conta: %.2f",contaE.getCliente(),contaE.getNumeroConta()
                    ,contaE.getSaldoConta(),contaE.getLimiteCredito());
                JOptionPane.showMessageDialog(null, mensagem);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Algo não esperado aconteceu");
                break;
        }
    }
}
