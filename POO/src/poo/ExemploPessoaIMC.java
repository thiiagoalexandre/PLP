package poo;

import java.util.Scanner;

public class ExemploPessoaIMC {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        PessoaIMC pessoaIMC1 = new PessoaIMC();
                
        System.out.println("Nome da pessoa 1");
        pessoaIMC1.nome = teclado.nextLine();
        
        System.out.println("Peso da pessoa 1");
        pessoaIMC1.peso = teclado.nextFloat();
        
        System.out.println("Altura da pessoa 1");
        pessoaIMC1.altura = teclado.nextFloat();
        
        System.out.printf("IMC da pessoa 1 = %.1f - %s\n", pessoaIMC1.calcularIMC(),pessoaIMC1.classificarIMC());
    }
    
}
