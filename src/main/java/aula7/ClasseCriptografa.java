package aula7;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class ClasseCriptografa {

    public String criptografa(int senha) {
        int[] senhaVetor;// Recrio a senha original como um vetor
        int tamanhoDaSenha = String.valueOf(senha).length();// Calcula o tamanho da senha
        senhaVetor = new int[tamanhoDaSenha];// Instancio nova referência ao vetor usando o tamanho da senha inserida
        int contSenha = tamanhoDaSenha;// Crio um contador para o laço for que recebe o mesmo valor do tamanho da senha
        int auxiliar; // Variável destinada à trocar variáveis de lugar
        String digitoSenha; //Aqui, construo a senha criptografada digito por digito em formato String
        String senhaCripto = ""; //Aqui, armazeno a senha criptografada em formato String
                
        for(int index = 0; index < senhaVetor.length; index++){//"Descascando" a senha e inserindo digito por digito no vetor
            senhaVetor[index] = (int) ( (senha/Math.pow(10,contSenha-1))%10 );
            contSenha--;
        }
        
        for(int index = 0; index < senhaVetor.length; index++){// Soma o valor por 7 e reatribui o valor da soma.
            senhaVetor[index] += 7;
        }
        for(int index = 0; index < senhaVetor.length; index++){// Divide por 10 e reatribui o resto da divisão.
            senhaVetor[index] %= 10;
        }
        auxiliar = senhaVetor[0];//Troque o primeiro dígito pelo terceiro
        senhaVetor[0] = senhaVetor[2];
        senhaVetor[2] = auxiliar;
        
        auxiliar = senhaVetor[1];//Troque o segundo dígito pelo quarto
        senhaVetor[1] = senhaVetor[3];
        senhaVetor[3] = auxiliar;
        
        for(int index = 0; index < senhaVetor.length; index++){// Construção da senha enquanto String
            digitoSenha = String.format("%d",(senhaVetor[index]));
            senhaCripto += digitoSenha;
        }
        return senhaCripto;
    }
}
