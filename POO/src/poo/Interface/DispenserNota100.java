package poo.Interface;

/**
 *
 * @author thiagosilva
 */
public class DispenserNota100 implements IDispenserCaixaEletronico{
    private IDispenserCaixaEletronico proximoDispenser;

    @Override
    public void setProximoElo(IDispenserCaixaEletronico proximoElo) {
        this.proximoDispenser = proximoElo;
        
    }

    @Override
    public void sacar(SaqueDinheiro saque) {
        if(saque.getValor()>=10){
            int notas = saque.getValor()/100;
            int restante = saque.getValor()%100;
            System.out.println("Liberando "+ notas + " de R$100");
            if(restante != 0){
                this.proximoDispenser.sacar(new SaqueDinheiro(restante));
            }
        }else{
            this.proximoDispenser.sacar(saque);
        }
        
    }
    
}
