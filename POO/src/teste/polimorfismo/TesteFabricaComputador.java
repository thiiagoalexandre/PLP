
package teste.polimorfismo;

import poo.polimorfismo.Computador;
import poo.polimorfismo.ComputadorFactory;

/**
 *
 * @author thiagosilva
 */
public class TesteFabricaComputador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computador pc = ComputadorFactory.getComputador("Computador Pessoal","4GB","500GB","i3 - 2.4 Ghz");
        Computador server = ComputadorFactory.getComputador("Servidor","128GB","6TB SSD","Xeon - 3.9 Ghz");
        
        System.out.println("Factory Computador pessoal configuração: "+pc);
        System.out.println("Factory Servidor configuração: "+server);
    }
    
}
