/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploscanner;
import java.util.Scanner;

/**
 *
 * @author thiagosilva
 */
public class ExemploScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = s.next();
        System.out.println("Digite sua idade:");
        int idade = s.nextInt();
        System.out.println("Seu nome é "+nome+" e você tem "+idade+" anos.");
    }
    
}
