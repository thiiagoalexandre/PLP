package aulaorientacaoobjeto.exercicio1;

public class gerenciamentoFinanceiro {

    public static void main(String[] args) {
        contaCorrente conta1 = new contaCorrente();
        conta1.nomeCliente = "Bruna";
        conta1.nomeBanco = "Nubank";
        conta1.numeroConta = 12345;
        conta1.nomeAgencia = "Digital";
        conta1.saldo = 15654.87;
        
        System.out.println("Olá "+
                conta1.nomeCliente+"! Você possui uma conta no banco "+
                conta1.nomeBanco+", possuindo o número de conta "+
                conta1.numeroConta+", da agência "+
                conta1.nomeAgencia+", com um total de R$"+
                conta1.saldo);
        
    }

}
