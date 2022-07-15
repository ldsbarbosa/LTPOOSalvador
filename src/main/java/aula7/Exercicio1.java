package aula7;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 * Uma empresa quer transmitir dados por telefone, mas quer que os mesmos sejam criptografados.
   Cada mensagem transmitida é composta por 4 dígitos de números inteiros.
    Crie uma classe para criptografar a mensagem da seguinte forma:
    - Adicione 7 a cada dígito
    - Obtenha o resto da divisão de cada dígito por 10
    - Troque o primeiro dígito pelo terceiro
    - Troque o segundo dígito pelo quarto
    - Mostre a nova mensagem com os novos 4 dígitos.
    Crie outra classe para descriptografar para os dígitos originais.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        ClasseCriptografa objetoCriptografa = new ClasseCriptografa();
        ClasseDescriptografa objetoDescriptografa = new ClasseDescriptografa();
        Scanner leitor = new Scanner(System.in);
        int senha, senhaDescripto;
        String senhaCripto;
        
        System.out.println("Entre com uma senha!");
        senha = leitor.nextInt();//Entra com a senha
        System.out.printf("A senha inserida foi %d\n",senha);//Exibe a senha original
        
        senhaCripto = objetoCriptografa.criptografa(senha);//Criptografa a senha
        System.out.printf("Agora a senha foi criptografada: A senha criptografada é %s\n",senhaCripto);//Exibe a senha criptografada
        
        senhaDescripto = objetoDescriptografa.descriptografa(senhaCripto);//Descriptografa a senha
        System.out.printf("Por útlimo, a senha foi descriptografada: A senha descriptografada é %d\n",senhaDescripto);//Exibe a senha descriptografada
    }
}
