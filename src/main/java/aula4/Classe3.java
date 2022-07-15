package aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas da Silva Barbosa
 */
class Classe3 {
    
    public void maiorValor(int valor1, int valor2) {
        if(valor1>valor2) {
            String textoFinal = String.format("O primeiro valor, %d, é o maior.",valor1);
            JOptionPane.showMessageDialog(null,textoFinal);
        }else {
            String textoFinal = String.format("O segundo valor, %d, é o maior.",valor2);
            JOptionPane.showMessageDialog(null,textoFinal);
        }
    }
}
