package poo.Heranca;

/**
 *
 * @author thiagosilva
 */
public class Motorista extends Pessoa {
    
    private String cnh;
            
    public Motorista(String nome, String cpf, String _cnh) {
        super(nome, cpf);
        this.cnh=_cnh;
    }

   

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    
}
