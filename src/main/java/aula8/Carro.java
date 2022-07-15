/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Carro extends MeioDeTransporte {
    private String marca;
    private String nome;
    private int quilometragem;

    public String getMarca() {// Getter e Setter para Marca
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {// Getter e Setter para Nome
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuilometragem() {// Getter e Setter para Quilometragem
        return quilometragem;
    }
    public void setQuilometragem(int quilometragem) {
        if (999999 > quilometragem && quilometragem > 0){
            this.quilometragem = quilometragem;
        } else{
            System.out.println("Insira uma quilometragem válida");
        }
    }
}
