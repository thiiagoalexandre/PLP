package poo.polimorfismo;

/**
 *
 * @author thiagosilva
 */
public class estagiario extends funcionario {

    private int x=10;
    @Override
    public double getSalario(int horas) {
        return horas * 50;
    }
    
    public int total(){
        return this.x+super.x;
    }

}
