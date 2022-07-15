package aula8;

/*
 * @author Lucas da Silva Barbosa
    Super classe direta: Quadrupede
    Super classe indireta: Mamífero
 */
public class Cachorro extends Quadrupede{
    public String som = "late";
    
    public String getSom(){
        return this.som;
    }
    
    public void setSom(String som){
        this.som = som;
    }
}
