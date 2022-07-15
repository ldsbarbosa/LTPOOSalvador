package aula10;

import java.io.File;
import java.text.DateFormat;
/**
a)Leia o nome de uma arquivo pelo teclado e tente abrir o mesmo usando a classe File. Obtenha os dados do referido arquivo: 
•	Tamanho do arquivo
•	Caminho completo até o arquivo
•	A data da última modificação (formatado)
 * 
 * @author Lucas da Silva Barbosa
 */
public class Classe1 {
    
    public void analisaArquivo(File arquivo){
        System.out.println("X_______________________________________________X\n\n");
        if(arquivo.exists()){
            if(arquivo.isFile()){
                System.out.println("Tamanho do arquivo, em kilobytes: "+arquivo.length());// Tamanho do arquivo
                
                System.out.println("Caminho absoluto do arquivo: "+arquivo.getAbsolutePath());// Caminho absoluto do arquivo
                
                DateFormat formatadorDeData = DateFormat.getDateTimeInstance();// Utilização da classe DateFormat para receber a formatação de data e hora
                long x = arquivo.lastModified();// Tempo da ultima modificação do arquivo
                System.out.println("Última modificação: " + formatadorDeData.format(x));// Formatação do ultimo tempo da modificação do arquivo
            }
        }else{
            System.out.println("Insira dados válidos."+arquivo.length());
        }
        System.out.println("\n\nX_______________________________________________X");
    }
    
}
