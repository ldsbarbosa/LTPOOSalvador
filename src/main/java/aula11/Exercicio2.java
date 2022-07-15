package aula11;

/**
 *
Desenvolva um código em java que:
   
    Cria uma classe com o método main;
        i. Que lê a idade de uma pessoa;
        ii. Instancia um objeto da segunda classe;
        iii. Passa o valor lido para o método da segunda classe;
        iv. Adicione um try...catch para verificar se a idade não é negativa. Escolha uma exceção para este caso.
    Cria uma segunda classe com um método;
        i. O método deve receber uma idade e informar se é maior de idade ou não.
 * 
 * @author Lucas da Silva Barbosa
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Instanciando objetos
        Scanner leitor = new Scanner(System.in);
        SegundaClasse objeto = new SegundaClasse();

        //Criando vari�veis
        int idade;
        boolean eMaior;

        //Entrando com a idade da pessoa
        System.out.println("Entre com a idade de uma pessoa!");
        idade = leitor.nextInt();
        System.out.println("A idade foi recebida");

        //Entrando no try...catch para verificar idade
        try{
            eMaior = objeto.verificaIdade(idade);
            if(eMaior){
                System.out.println("É maior de idade");
            }else {
                System.out.println("È menor de idade");
            }
        }catch(ArithmeticException excecao) {
            System.out.println(excecao);
            System.out.println("A idade inserida é negativa!");
        }
    }
}

