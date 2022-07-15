package aula10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;// Ou também "import java.io.*;"
/**
 *
 d)Leia um texto de um arquivo e envie o texto lido para um segundo arquivo.
 * 
 * @author Lucas da Silva Barbosa
 */
public class Exercicio4 {
    public static void main(String[] args) {
        String texto = "";
        
        //Lendo o texto
        try {
            FileReader fr = new FileReader("d:\\testeJava\\exercicio4.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String linha = br.readLine();
                texto += ("\n"+linha);
            }
            br.close();
            fr.close();
            System.out.println("Texto lido com sucesso!!");
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        
        //Inserindo o texto lido
        try {
            FileWriter fw = new FileWriter("d:\\testeJava\\exercicio4_2.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.newLine();
            bw.close();
            fw.close();
            System.out.println("Dados gravados com sucesso!!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
