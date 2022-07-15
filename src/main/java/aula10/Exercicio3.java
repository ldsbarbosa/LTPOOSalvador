package aula10;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 c) Leia uma frase de um arquivo e mostre na tela apenas as consoantes da referida frase.
 * 
 * @author Lucas da Silva Barbosa
 */
public class Exercicio3 {
    public static void main(String[] args) {
        String consoante = "";
        int i;
        try {
            FileReader fr = new FileReader("d:\\testeJava\\exercicio3.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String linha = br.readLine();
                for (i = 0; i < linha.length(); i++){
                    if(!(linha.charAt(i) == ' ' || linha.charAt(i) == 'A' || linha.charAt(i) == 'a' || linha.charAt(i) == 'E' || linha.charAt(i) == 'e' || linha.charAt(i) == 'I' ||
                            linha.charAt(i) == 'i' || linha.charAt(i) == 'O' || linha.charAt(i) == 'o' || linha.charAt(i) == 'U' || linha.charAt(i) == 'u')){
                        consoante += linha.charAt(i);
                    }
                }
                System.out.println(consoante);
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
