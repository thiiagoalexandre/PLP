package aulaorientacaoobjeto.exercicio1;
public class Cliente {
    int idCliente;
    String cpf;
    String nome;
    int cnh;

    public Cliente() {
    }

    public Cliente(int idCliente, String cpf, String nome, int cnh) {
        this.idCliente = idCliente;
        this.cpf = cpf;
        this.nome = nome;
        this.cnh = cnh;
    }

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Cliente(String cpf, String nome, int cnh) {
        this.cpf = cpf;
        this.nome = nome;
        this.cnh = cnh;
    }
    
    
}
