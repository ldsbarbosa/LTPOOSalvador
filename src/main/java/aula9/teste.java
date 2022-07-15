package aula9;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 * *Exercício 2 – Desenvolva os seguintes códigos
    1. Classe: Animal
         Variáveis de instância:
        o nomeAnimal (String)
        o pesoAnimal (double)
         métodos:
        o gets e sets
    2. Classe: Peixe (herda Animal)
         Variáveis de instância:
        o tipoHabitat (String) – água doce, água salgada,...
        o pesoPeixe (double)
         métodos:
        o gets e sets
    3. Classe: Cachorrro (herda Animal)
         Variáveis de instância:
        o racaCachorro (String)
         métodos:
        o gets e sets
    4. Classe: teste
         Criar um método main com menu que contenha os seguintes itens:
        o Entre com os dados de peixe
        o Entre com os dados de cachorro
        o Mostre os dados de algum animal
 * @author Lucas da Silva Barbosa
 */
public class teste {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Peixe fish = new Peixe();
        String mensagem;
        Random aleatorio = new Random();
        int sorteio,indice;
        
        JOptionPane.showMessageDialog(null, "Entre com os dados do peixe e do cachorro!");
        
        dog.setNomeAnimal(JOptionPane.showInputDialog(null, "Nome do cachorro: "));
        mensagem = String.format("Peso do %s: ",dog.getNomeAnimal());
        dog.setPesoAnimal(Double.parseDouble(JOptionPane.showInputDialog(null, mensagem)));
        mensagem = String.format("Raça do %s: ",dog.getNomeAnimal());
        dog.setRacaCachorro(JOptionPane.showInputDialog(null, mensagem));
        
        fish.setNomeAnimal(JOptionPane.showInputDialog(null, "Nome do peixe: "));
        mensagem = String.format("Peso do %s: ",fish.getNomeAnimal());
        fish.setPesoPeixe(Double.parseDouble(JOptionPane.showInputDialog(null, mensagem)));
        fish.setPesoAnimal(fish.getPesoPeixe());
        mensagem = String.format("Habitat do %s: ",fish.getNomeAnimal());
        fish.setTipoHabitat(JOptionPane.showInputDialog(null, mensagem));
        
        sorteio = aleatorio.nextInt(2);
        mensagem = "";
        if(sorteio == 1){
            mensagem = String.format("Nome do cachorro: %s"
                    + "\nPeso do cachorro: %s\n"
                    + "Raça do cachorro: %s",dog.getNomeAnimal(),dog.getPesoAnimal()
                    ,dog.getRacaCachorro());
            JOptionPane.showMessageDialog(null, mensagem);
        }else{
            mensagem = String.format("Nome do peixe: %s"
                    + "\nPeso do peixe: %s\n"
                    + "Raça do peixe: %s",fish.getNomeAnimal(),fish.getPesoAnimal()
                    ,fish.getTipoHabitat());
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}
