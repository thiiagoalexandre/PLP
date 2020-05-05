
package poo;

public class ExemploPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Thiago Alexandre";
        pessoa.idade = 26;
        pessoa.endereco = "QC 02 rua H torre H1";
        pessoa.fadiga = true;
        pessoa.dt_Nascimento = "08/03/1994";
        
        System.out.println("O nome da pessoa é:" + pessoa.nome +" e sua idade é:"+pessoa.idade);
    }
    
    
}
