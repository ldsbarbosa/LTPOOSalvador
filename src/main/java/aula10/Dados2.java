package aula10;

import java.io.File; // Necessário para classificar o objeto adequadamente
import java.io.IOException; // Tratar a exceção de não achar o arquivo com a finalidade de dat seu output. Para escrever, é necessário por conta do input.
import java.io.FileReader; // Classe de leitura de arquivo tradicional
import java.io.BufferedReader; // Classe de leitura de arquivo com buffer, que é o recomendado.
import java.io.FileNotFoundException; // Tratar a exceção de não achar o arquivo com a finalidade de lê-lo. Para escrever, não é necessário.

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Dados2 {
    
    public void leDados(File arq) {
        try {
            FileReader fr = new FileReader(arq);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("\nConteúdo lido...");
            while (br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

}
