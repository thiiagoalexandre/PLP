package HerancaTeste;

import poo.Heranca.Motorista;

/**
 *
 * @author thiagosilva
 */
public class testeHerancaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Motorista objetoMotorista= new Motorista("Jose","00000033333","9999444333");
        
        objetoMotorista.setNome("Thiago");
        objetoMotorista.setCnh("998877655");
        
        System.out.println(objetoMotorista.getNome()+" cnh "+ objetoMotorista.getCnh());
    }
    
}
