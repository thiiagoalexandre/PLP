package teste.polimorfismo;

import poo.polimorfismo.diretor;

/**
 *
 * @author thiagosilva
 */
public class testeSobrescrita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        diretor diretor = new diretor();
        double salario = diretor.getSalario(200);
        System.out.println("O salario do diretor é " + salario);

    }

}
