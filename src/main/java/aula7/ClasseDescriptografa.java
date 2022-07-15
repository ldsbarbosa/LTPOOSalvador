package aula7;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class ClasseDescriptografa {

    public int descriptografa(String senhaCripto) { // Recebe a senha em formato String
        int[] senhaVetor;// Recrio a senha criptografada como um vetor
        int tamanhoDaSenha = senhaCripto.length();// Calcula o tamanho da senha
        senhaVetor = new int[tamanhoDaSenha];// Instancio nova referência ao vetor usando o tamanho da senha inserida
        int contSenha = tamanhoDaSenha;// Crio um contador para o laço for que recebe o mesmo valor do tamanho da senha
        int auxiliar; // Variável destinada à trocar variáveis de lugar e auxiliar no uso dos laços for
        int senhaDescripto = 0; //Aqui, armazeno a senha descriptografada em formato String
        String digitoSenha;
        
        for(int index = 0; index < senhaVetor.length; index++){//"Descascando" a senha e inserindo digito por digito e inserindo no vetor
            senhaVetor[index] = ((int) (senhaCripto.charAt(index)))-48;// Na tabela ASCII printável, 0 corresponde à 48.
        }
        
        auxiliar = senhaVetor[1];//Troque o segundo dígito pelo quarto
        senhaVetor[1] = senhaVetor[3];
        senhaVetor[3] = auxiliar;
        
        auxiliar = senhaVetor[0];//Troque o primeiro dígito pelo terceiro
        senhaVetor[0] = senhaVetor[2];
        senhaVetor[2] = auxiliar;
        
        for(int index = 0; index < senhaVetor.length; index++){// Se for maior ou igual a sete, subtrai sete. Caso contrario, soma três.
            if (senhaVetor[index] >= 7){
                senhaVetor[index] -= 7;
            }else{
                senhaVetor[index] += 3;
            }
        }
        
        contSenha = tamanhoDaSenha;
        for(int index = 0; index < senhaVetor.length; index++){// Formatação da senha descriptografada
            senhaDescripto += (int) (senhaVetor[index] * Math.pow(10,contSenha-1));
            contSenha--;
        }
        return senhaDescripto;
    }
}
