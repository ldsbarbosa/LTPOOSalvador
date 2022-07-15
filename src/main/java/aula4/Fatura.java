package aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Fatura {
    private double totalFatura;

    public void recebeFatura(String nroFatura,String nomeProduto,int quantProduto,double precoProduto){
        totalFatura=precoProduto*quantProduto;
        String aux;

        aux = String.format(
        "Fatura número: "+nroFatura
        +"\nProduto: "+nomeProduto
        +"\nQuantidade: "+quantProduto
        +"\nPreço unitário: R$ "+precoProduto
        +"\n______________________________"
        +"\nTotal da Fatura: R$ "+totalFatura);

        exibeFatura(aux);
    }
    public void exibeFatura(String faturaFinal){
        JOptionPane.showMessageDialog(null,faturaFinal);
    }
}
