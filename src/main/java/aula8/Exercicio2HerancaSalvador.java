package aula8;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author Salvador Alves Junior
 */
public class Exercicio2HerancaSalvador {
    public static void main(String args[]){
        
        Scanner x = new Scanner(System.in);
        CarroSalvador aux = new CarroSalvador();
        
        String msg;
        final int quantidade=5;
        int i, resposta;
        
        //definição dos arrays
        String[] marca = new String[quantidade],nome = new String[quantidade];
        int quilometragem[] = new int[quantidade];
        boolean ligado[] = new boolean[quantidade];
        
        System.out.println("Entre com os dados de 5 carros\n");
        for(i=0; i<quantidade; i++){
            System.out.println("Entre com os dados do carro "+(i+1));

            System.out.println("Marca: ");
            aux.setMarca(x.nextLine());
            marca[i]=aux.getMarca();
            
            System.out.println("Nome: ");
            aux.setNome(x.nextLine());
            nome[i]=aux.getNome();
            
            System.out.println("Quilometragem: ");
            aux.setQuilometragem(x.nextInt());
            quilometragem[i]=aux.getQuilometragem();
            
            System.out.println("Ligado (1) ou Desligado (2): ");
            resposta = x.nextInt();
            System.out.println();
            if(resposta==1)
                aux.liga();
            else
                aux.desliga();
            //Formata e mostra o resultado
            msg = String.format("%s\n%s\n%d km\nLigado=%s\n",marca[i],nome[i],quilometragem[i],aux.ligado);
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
