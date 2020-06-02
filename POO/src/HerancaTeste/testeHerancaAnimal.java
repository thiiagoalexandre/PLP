package HerancaTeste;

import poo.Heranca.cachorro;
import poo.Heranca.gato;

/**
 *
 * @author thiagosilva
 */
public class testeHerancaAnimal {

    
    public static void main(String[] args) {
        cachorro cachorro1 = new cachorro();
        gato gato1 = new gato();
        
        cachorro1.setNome("Dog");
        cachorro1.setRaca("Poodle");
        System.out.println("O cachorro "+cachorro1.getNome()+" é da raça "+cachorro1.getRaca()+" faz:"+cachorro1.late());
        
        gato1.setNome("Bichano");
        gato1.setRaca("Persa");
        System.out.println("O gato "+gato1.getNome()+" é da raça "+gato1.getRaca()+" faz:"+gato1.mia());
    }
    
}
