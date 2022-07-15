package aula6;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Sobrecarga {
    public void calcula(double valor) {
        double dobro=valor*2;
        String x = String.format("Dobro = %.3f",dobro);//formata toda a saída para um único String
        JOptionPane.showMessageDialog(null,x);
    }

    public void calcula(int valor1, int valor2) {
        int soma=valor1+valor2;
        String x = String.format("Soma = %d",soma); //formata toda a saída para um único String
        JOptionPane.showMessageDialog(null,x);		
    }
}
