package poo.polimorfismo;

/**
 *
 * @author thiagosilva
 */
public class diretor extends funcionario {
    @Override
    public double getSalario(int horas) {
        return horas * 200;
    }
}
