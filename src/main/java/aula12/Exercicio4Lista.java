package aula12;

/*
Um grande projeto mundial está em curso para mapear todo o material genético do ser humano: o Projeto Genoma Humano.
As moléculas de DNA (moléculas que contêm material genético) podem ser representadas por cadeias de caracteres que usam um alfabeto de apenas 4 letras:
‘A’, ‘C’, ‘T’ e ‘G’. Um exemplo de uma tal cadeia é:

TCATATGCAAATAGCTGCATACCGA

Nesta tarefa você deverá produzir uma ferramenta muito utilizada no projeto Genoma: um programa que procura ocorrências de uma pequena cadeia de DNA
(que vamos chamar de p) dentro de uma outra cadeia de DNA (que vamos chamar de t). Você deverá procurar ocorrências "diretas", que ocorre quando a cadeia p aparece como subcadeia
dentro de t. Por exemplo, se 

p = CATA
t = TCATATGCAAATAGCTGCATACCGA

então p ocorre na forma direta na posição 2 e na posição 18 de t.

Tarefa
Sua tarefa é escrever um programa que, dadas duas cadeias p e t, onde o comprimento de p é menor ou igual ao comprimento de t, procura todas as ocorrências diretas.
Leia a cadeia p de um array qualquer.
Faça uma busca da seqüência p na seqüência t que deverá estar num segundo array.
Por fim, mostre a cadeia p, a cadeia t e a posição das ocorrências diretas.

Exemplo de Entrada
CATA
TCATATGCAAATAGCTGCATACCGA

Exemplo de Saída
CATA
TCATATGCAAATAGCTGCATACCGA
ocorrência direta nas posições: 2 18
 */

/**
 *
 * @author Lucas da Silva Barbosa
 */
import java.util.Scanner;
public class Exercicio4Lista {
    public static void main(String[] args) {
        // Instanciando objetos
        Scanner leitor = new Scanner(System.in);
        ClasseComparaGenoma objetoGenoma = new ClasseComparaGenoma();
        ClasseGeraGenoma objetoGerado = new ClasseGeraGenoma();
        //Declarando variáveis
        int decisao;
        String genomaBase, genomaOcorrencia;
        
        System.out.println("-Projeto Genoma Humano!-");
        System.out.println("Deseja fazer uma pesquisa aleatória(1) ou uma pesquisa customizada(2)?");
        decisao = leitor.nextInt();
        while(decisao != 1 && decisao != 2){
            System.out.println("Insira 1 ou 2");
            decisao = leitor.nextInt();
        }
        switch(decisao){
            case 1:
                System.out.println("Será gerado um genoma base");
                objetoGenoma.setGenomaBase(objetoGerado.geraGenomaBase());
                genomaBase = objetoGenoma.getGenomaBase();
                System.out.printf("Genoma base:\n%S\n",genomaBase);
                System.out.println("Agora, será gerado um genoma de ocorrencia");
                objetoGenoma.setGenomaOcorrencia(objetoGerado.geraGenomaOcorrencia());
                genomaOcorrencia = objetoGenoma.getGenomaOcorrencia();
                System.out.printf("Genoma ocorrencia:\n%S\n",genomaOcorrencia);
                objetoGenoma.comparaGenoma();
                break;
            case 2:
                System.out.println("Entre com uma cadeia de genomas base");
                objetoGenoma.setGenomaBase(leitor.nextLine());
                objetoGenoma.setGenomaBase(leitor.nextLine());
                genomaBase = objetoGenoma.getGenomaBase();
                System.out.printf("Genoma base:\n%S\n",genomaBase);
                System.out.println("Entre com a cadeia de genomas que serão as ocorrências na base");
                objetoGenoma.setGenomaOcorrencia(leitor.nextLine());
                genomaOcorrencia = objetoGenoma.getGenomaOcorrencia();
                System.out.printf("Genoma ocorrencia:\n%S\n",genomaOcorrencia);
                objetoGenoma.comparaGenoma();
                break;
            default:
                System.out.println("Você saiu do sistema.");
                break;
        }
        
    }
}
