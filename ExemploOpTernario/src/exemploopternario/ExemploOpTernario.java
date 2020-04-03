/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploopternario;

/**
 *
 * @author thiagosilva
 */
public class ExemploOpTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        a = 9;
        b = 2;
        /*
        * if(a==b) {
        * valor = "verdadeiro";
        * }else
        * {
        * valor = "falso";
        * }
         */
        String valor = (a < b) ? "verdadeiro" : "falso";
        System.out.print(valor);
    }

}
