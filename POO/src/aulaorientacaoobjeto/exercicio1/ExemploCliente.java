package aulaorientacaoobjeto.exercicio1;
public class ExemploCliente {

    public static void main(String[] args) {
        Cliente pessoa = new Cliente("555555","Paulo");
        Cliente pessoa2 = new Cliente("555555","Paulo",9999999);
        Cliente pessoa3 = new Cliente();
        pessoa3.nome = "Chaves Henrique";
        pessoa3.cnh = 887766;
     
        
    }
    
}
