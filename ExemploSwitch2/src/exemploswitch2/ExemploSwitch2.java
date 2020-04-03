/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploswitch2;
import java.util.Scanner;
/**
 *
 * @author thiagosilva
 */
public class ExemploSwitch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número para saber qual dia da semana?");
        System.out.println("Digite 1 para segunda e 7 para domingo");
        int num = in.nextInt();
        String dia = (num==1) ? "segunda" :
                     (num==2) ? "terça" :
                     (num==3) ? "quarta" :
                     (num==4) ? "quinta" :
                     (num==5) ? "sexta" :
                     (num==6) ? "sabado" :
                     (num==7) ? "domingo" :
                                "Dia inválido";

        System.out.println("O dia escolhido foi: "+dia);
    }
    
}
