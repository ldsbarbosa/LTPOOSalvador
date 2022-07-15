/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class CarroSalvador extends MeioDeTransporteSalvador{//a classe Carro herda a Classe MeioDeTransporte
    private String marca;
    private String nome;
    private int quilometragem;
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(int quilometragem) {
        if(quilometragem >=0 && quilometragem <= 999999)
            this.quilometragem = quilometragem;
        else
            System.out.println("Valor inválido!!");
        }
    
    @Override//destaca que a classe setVelocidade foi reescrita
    public void setVelocidade(int velocidade) {
        if(velocidade>= 0 && velocidade <= 200)
            this.velocidade = velocidade;
        else
            System.out.println("Valor inválido!!");
    }
}