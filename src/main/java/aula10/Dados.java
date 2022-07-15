package aula10;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException; // Também pode fazer um import só com "import java.io.*;"

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Dados {
    
    public void escreveDados(File arq, boolean modo, String texto) {
        try {
            FileWriter fw = new FileWriter(arq, modo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.newLine();
            bw.close();
            fw.close();
            System.out.println("Dados gravados com sucesso");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
