package poo.polimorfismo;

/**
 *
 * @author thiagosilva
 */
public class ComputadorFactory {

    public static Computador getComputador(String type, String ram, String hdd, String cpu) {

        if ("Computador Pessoal".equalsIgnoreCase(type)) {
            return new ComputadorPessoal(ram, hdd, cpu);
        } else if ("Servidor".equalsIgnoreCase(type)) {
            return new Servidor(ram, hdd, cpu);
        }
        return null;
    }

}
