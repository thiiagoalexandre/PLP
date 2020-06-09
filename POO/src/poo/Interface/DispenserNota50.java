package poo.Interface;

/**
 *
 * @author thiagosilva
 */
public class DispenserNota50 implements IDispenserCaixaEletronico{
    private IDispenserCaixaEletronico proximoDispenser;

    @Override
    public void setProximoElo(IDispenserCaixaEletronico proximoElo) {
        this.proximoDispenser = proximoElo;
        
    }

    @Override
    public void sacar(SaqueDinheiro saque) {
        if(saque.getValor()>=50){
            int notas = saque.getValor()/50;
            int restante = saque.getValor()%50;
            System.out.println("Liberando "+ notas + " de R$50");
            if(restante != 0){
                this.proximoDispenser.sacar(new SaqueDinheiro(restante));
            }
        }else{
            this.proximoDispenser.sacar(saque);
        }
        
    }
    
}
