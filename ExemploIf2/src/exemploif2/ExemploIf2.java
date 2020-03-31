/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploif2;
import java.util.Scanner;
/**
 *
 * @author thiagosilva
 */
public class ExemploIf2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um Número:");
        numero = s.nextInt();
        
        if (numero > 0){
            System.out.printf("O numero digitado é positivo");
        }
        else{
            System.out.println("O numero digitado é negativo");
        }
    }
    
}
