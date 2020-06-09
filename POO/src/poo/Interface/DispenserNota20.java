/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.Interface;

/**
 *
 * @author thiagosilva
 */
public class DispenserNota20 implements IDispenserCaixaEletronico {
    private IDispenserCaixaEletronico proximoDispenser;

    @Override
    public void setProximoElo(IDispenserCaixaEletronico proximoElo) {
        this.proximoDispenser = proximoElo;
        
    }

    @Override
    public void sacar(SaqueDinheiro saque) {
        if(saque.getValor()>=20){
            int notas = saque.getValor()/20;
            int restante = saque.getValor()%20;
            System.out.println("Liberando "+ notas + " de R$20");
            if(restante != 0){
                this.proximoDispenser.sacar(new SaqueDinheiro(restante));
            }
        }else{
            this.proximoDispenser.sacar(saque);
        }
        
    }
    
}
