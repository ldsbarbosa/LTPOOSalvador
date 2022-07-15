/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Classe2 {

    public void mandaFrase(String fraseInput, File arquivo) {
        int i;
        String vogais = "";
        
        for (i = 0; i < fraseInput.length(); i++){
            if(fraseInput.charAt(i) == 'A' || fraseInput.charAt(i) == 'a' || fraseInput.charAt(i) == 'E' ||
                    fraseInput.charAt(i) == 'e' || fraseInput.charAt(i) == 'I' ||
                    fraseInput.charAt(i) == 'i' || fraseInput.charAt(i) == 'O' || fraseInput.charAt(i) == 'o' ||
                    fraseInput.charAt(i) == 'U' || fraseInput.charAt(i) == 'u'){
                vogais += fraseInput.charAt(i);
            }
        }
        
        System.out.println("Frase: "+fraseInput);
        System.out.println("Vogais presentes na frase: "+vogais);
        try {
            FileWriter registradorArquivo = new FileWriter(arquivo, true);
            BufferedWriter bufferArquivo = new BufferedWriter(registradorArquivo);
            
            bufferArquivo.newLine();
            bufferArquivo.write(vogais);
            
            bufferArquivo.close();
            registradorArquivo.close();
            
            System.out.println("Dados gravados com sucesso. Somente as vogais forma inseridas.");
        } catch (IOException excecao) {
            System.out.println(excecao);
        }        
    }
    
}
