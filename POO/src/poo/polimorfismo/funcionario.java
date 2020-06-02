package poo.polimorfismo;

/**
 *
 * @author thiagosilva
 */
public class funcionario {
    private String nome;
    private double salario;
    public int x;

    public double getSalario(int horas) {
        return horas*100;
    
    }
    
    public int soma(int x, int y){
        return (x+y);
    }
    
    public int soma(int x, int y, int z){
        return (x+y+z);
    }
}
