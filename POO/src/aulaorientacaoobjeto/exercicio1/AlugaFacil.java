package aulaorientacaoobjeto.exercicio1;

public class AlugaFacil {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.idCliente = 1;
        cliente1.nome = "Paulo";
        cliente1.cpf = "000000000-00";
        cliente1.cnh = 222222222;

        System.out.println(cliente1.nome + " tem ID " + 
                cliente1.idCliente + ", cpf " + 
                cliente1.cpf + " e sua CNH é " + 
                cliente1.cnh);

        Cliente cliente2 = new Cliente();
        cliente2.idCliente = 2;
        cliente2.nome = "Ana";
        cliente2.cpf = "999999999-99";
        cliente2.cnh = 222101010;

        System.out.println(cliente2.nome + " tem ID " + 
                cliente2.idCliente + ", cpf " + 
                cliente2.cpf + " e sua CNH é " + 
                cliente2.cnh);

        Carro carro1 = new Carro();
        carro1.idCarro = 1;
        carro1.placa = "jjj0023";
        carro1.fabricante = "Ford";
        carro1.modelo = "Ka";
        carro1.ano = 2017;
        carro1.cor = "Branca";
        carro1.valorDiaria = 95.00;

        System.out.println("O carro locado é o " + 
                carro1.modelo + ", com ID " + 
                carro1.idCarro + ", placa " + 
                carro1.placa + ", ano " + 
                carro1.ano + ", cor " + 
                carro1.cor + ", pagando um total de R$" + 
                carro1.valorDiaria + " na diaria");

        Carro carro2 = new Carro();
        carro2.idCarro = 2;
        carro2.placa = "jbu3548";
        carro2.fabricante = "Fiat";
        carro2.modelo = "Chronos";
        carro2.ano = 2019;
        carro2.cor = "Vermelho";
        carro2.valorDiaria = 110.00;

        System.out.println("O carro locado é o " + 
                carro2.modelo + ", com ID " + 
                carro2.idCarro + ", placa " + 
                carro2.placa + ", ano " + 
                carro2.ano + ", cor " + 
                carro2.cor + ", pagando um total de R$" + 
                carro2.valorDiaria + " na diaria");
    }

}
