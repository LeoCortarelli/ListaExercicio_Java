/*
Elabore um programa em Java que leia dois valores inteiros e apresente o
quociente e o resto da divisão entre eles.
 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double dividendo;
        double divisor;
        double quociente;
        double resto;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o dividendo: ");
        dividendo = teclado.nextDouble();
        System.out.println("Digite o divisor: ");
        divisor = teclado.nextDouble();
        
        quociente = dividendo / divisor;
        resto = dividendo % divisor;
        
        System.out.println("QUOCIENTE: "+quociente);
        System.out.println("RESTO: "+resto);
    }
}
