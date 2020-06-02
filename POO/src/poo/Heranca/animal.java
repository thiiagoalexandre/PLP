package poo.Heranca;

/**
 *
 * @author thiagosilva
 */
public class animal {
    private String nome;
    private String raca;

    public animal() {
    }

    public animal(String nome) {
        this.nome = nome;
    }
    
    public String caminha(){
        return("caminhadno");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
}
