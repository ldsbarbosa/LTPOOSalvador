package aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo5 {
    public static void main(String args[]){
        String texto;
        float numero = 37.5271f;
        texto = String.format("numero = %.2f", numero);
        JOptionPane.showMessageDialog(null,texto);
    }
}
