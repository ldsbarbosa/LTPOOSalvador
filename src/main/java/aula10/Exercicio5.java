package aula10;
import java.util.Random; // Import para números aleatórios

import java.io.File; // Import para checar o arquivo.

import java.io.FileWriter; // Import para escrever no arquivo.
import java.io.BufferedWriter;

import java.io.FileReader; // Import para ler o arquivo.
import java.io.BufferedReader;

import java.io.IOException; // Outros imports
import java.io.FileNotFoundException;

/**
 *
    Gere 10 números aleatórios e os envie para um arquivo.
    Depois leia os números desse arquivo e mostre, na tela do computador, quantos destes são primos.
 * 
 * @author Lucas da Silva Barbosa
 */
public class Exercicio5 {
    
    public static void main(String[] args) {
        // Instanciando objetos de classes úteis!
        Random aleatorio = new Random();
        File arquivoPrincipal = new File("d:\\testeJava\\", "exercicio5.txt");
        
        //Criando vetores
        int[] numeros = new int[10];
        int[] numeros2 = new int[numeros.length];
        char[] numerosChar = new char[numeros.length];
        
        //Criando variáveis
        int i, j, numDivisores = 0;
        String mensagem = "";
        
        //Gerando os números aleatórios
        for(i = 0; i < numeros.length; i++){
            numeros[i] = aleatorio.nextInt(10);
            numerosChar[i] = Character.forDigit(numeros[i],10);
            mensagem += numerosChar[i];
        }
        
        //Escrevendo os números aleatórios
        try{
            FileWriter fw = new FileWriter(arquivoPrincipal, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(mensagem);
            bw.newLine();
            bw.close();
            fw.close();
            System.out.println("Dados gravados com sucesso!!");
        }catch( IOException excecao ) {
            System.out.println( excecao );
        }
        //Lendo, do arquivo, os números aleatórios
        mensagem = "";
        try {
            FileReader fr = new FileReader("d:\\testeJava\\exercicio5.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String linha = br.readLine();
                mensagem += linha;
            }
            br.close();
            fr.close();
            System.out.println("Texto lido com sucesso!!");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        //Fazendo leitura do String para pegar um número por vez
        for(i = 0; i < mensagem.length(); i++){
            switch(mensagem.charAt(i)){
                case '1':
                    numeros2[i] = 1;
                    break;
                case '2':
                    numeros2[i] = 2;
                    break;
                case '3':
                    numeros2[i] = 3;
                    break;
                case '4':
                    numeros2[i] = 4;
                    break;
                case '5':
                    numeros2[i] = 5;
                    break;
                case '6':
                    numeros2[i] = 6;
                    break;
                case '7':
                    numeros2[i] = 7;
                    break;
                case '8':
                    numeros2[i] = 8;
                    break;
                case '9':
                    numeros2[i] = 9;
                    break;
                default:
                    break;
            }
        }
        //Quantos dos números são primos!
        System.out.println("Exibindo os números primos!");
        
        for(i = 0; i < numeros2.length ; i++){
            numDivisores = 0;
            for(j = 1; j <= numeros2[i] ; j++){
                if((numeros2[i] % j) == 0){
                    numDivisores++;
                }
            }
            if(numDivisores == 2){
                System.out.printf("%4d",numeros2[i]);
            }
        }
    }
    
}
