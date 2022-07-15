package aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class MinhasJanelas {
    public String exemploGUI() {
        String quilometro,litro,saida;
        double consumo;
        quilometro = JOptionPane.showInputDialog("Quanto quilometros foram rodados?");
        litro = JOptionPane.showInputDialog("Quanto litros foram consumidos?");
        consumo = Double.parseDouble(quilometro)/Double.parseDouble(litro);
        saida = String.format("Consumo = %.1f km/l",consumo);
        return saida;
    }
}
