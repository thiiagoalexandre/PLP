/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploif;
import java.util.Scanner;

/**
 *
 * @author thiagosilva
 */
public class ExemploIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, soma;
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com o valor do primeiro numero");
        num1 = s.nextInt();
        System.out.println("Entre com o valor do segundo numero");
        num2 = s.nextInt();
        soma = (num1+num2);
        
        if (soma>10) {
            System.out.printf("Soma dos dois números = %d",(soma));
        }
        else{
            System.out.println("A soma foi menor que o numero 10.");
        }
    }
    
}
