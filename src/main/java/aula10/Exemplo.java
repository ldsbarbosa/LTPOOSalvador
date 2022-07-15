package aula10;

import java.io.File;
import java.net.URI; // QUAL A DIFERENÇA ENTRE URL, URI E URN - https://www.youtube.com/watch?v=vHa_cKryvnM

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo {
    public static void main(String[] args) {
        Verifica vf = new Verifica();
        File hipotese1 = new File("d:\\testeJava\\", "saida.txt");
        vf.VerificaArquivo(hipotese1);

        File hipotese2 = new File("d:\\testeJava\\");
        vf.VerificaArquivo(hipotese2);

        File hipotese3 = new File("..\\Aleatorio\\src\\main\\olaMundo.txt");
        vf.VerificaArquivo(hipotese3);

        String url = "https://www.kaggle.com/allen-institute-for-ai/CORD-19-research-challenge";
        File hipotese4 = new File(url);
        try {
            URI uri = hipotese4.toURI();
            System.out.println("uri:- " + uri);

        } catch (SecurityException e) {
            System.out.println(e);
        }
    }
}
