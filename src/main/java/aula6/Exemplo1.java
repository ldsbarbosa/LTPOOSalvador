package aula6;

import java.util.Random;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo1 {
    public static void main(String[] args){
        Random var = new Random();//instancia um objeto da classe Random

        boolean v1=var.nextBoolean();//chama o método nextBoolean( ) da classe Random
        float v3=var.nextFloat();//chama o método nextFloat( ) da classe Random
        double v4=var.nextDouble();//chama o método nextDouble( ) da classe Random
        int v5=var.nextInt();//chama o método nextInt( ) da classe Random
        long v6=var.nextLong();//chama o método nextLong( ) da classe Random
        double gauss=var.nextGaussian();//chama o método nextGaussian( ) da classe Random

        System.out.println("boolean = "+v1);
        System.out.println("float = "+v3);
        System.out.println("double = "+v4);
        System.out.println("int = "+v5);
        System.out.println("long = "+v6);
        System.out.println("gaussiano = "+gauss);
    }
}
