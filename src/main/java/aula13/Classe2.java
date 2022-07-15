/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class Classe2 {

    public void leitorPalpite() {
        Classe3 objeto2 = new Classe3();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatador;
        LocalDate dataHomemPalpite;
        
        try {
            dataHomemPalpite =  LocalDate.parse(JOptionPane.showInputDialog("Em que data o homem pisou na lua?"));
            objeto2.comparandoPalpite(dataHomemPalpite);
        }catch(DateTimeParseException excecao) {
            System.out.println("Erro de formatação de data!");
        }
    }
}
