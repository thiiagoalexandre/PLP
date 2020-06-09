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
public interface IDispenserCaixaEletronico {
    
    void setProximoElo(IDispenserCaixaEletronico proximoElo);
    void sacar(SaqueDinheiro saque);
    
}
