/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobreak;

/**
 *
 * @author thiagosilva
 */
public class ExemploBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 8; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("FIM");
    }
}
    