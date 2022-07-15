package aula4;

import javax.swing.JOptionPane;

/**
 *c )   Crie uma classe chamada Fatura para que uma loja de suprimentos em informática possa
        apresentar a fatura de um produto vendido na loja. Essa classe deverá ter uma variável de
        instância denominada totalFatura. Na referida classe deverá ter um método que recebe estas
        informações:
         Número da fatura (String)
         Nome do produto (String)
         Quantidade de produtos (int)
         Preço de cada produto (double)
        Então, calcule o total da fatura (preço x quantidade) e guarde na variável de instância criada
        anteriormente. Nessa mesma classe, crie um segundo método que mostra uma tela com todos os
        itens da fatura, inclusive o total da mesma.
    
 * @author Salvador Alves Junior
 * 
 * OBS: Neste exercício, por conta de na época não ter alguns conhecimentos da linguagem Java, fiz conforme a resolução do prof.
 * Salvador Alves. Muito obrigado, prof. Salvador!
 */
public class Exercicio3 {
    public static void main(String args[]) {
        String minhaFatura,nome,aux;
        int quant;
        double preco;
        Fatura var = new Fatura();

        minhaFatura = JOptionPane.showInputDialog(null,"Número da fatura?");

        nome = JOptionPane.showInputDialog(null,"Nome do produto?");

        aux = JOptionPane.showInputDialog(null,"Quantidade de produto?");
        quant=Integer.parseInt(aux);

        aux = JOptionPane.showInputDialog(null,"Preço do produto?");
        preco=Double.parseDouble(aux);

        var.recebeFatura(minhaFatura, nome, quant, preco);
    }
}
