/*
Ler um número inteiro e imprimir a terça parte deste número
 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
            double numero;
            double tercaParte;
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite um numero");
    numero = teclado.nextDouble();
        
    tercaParte = numero * 1/3;
    
    System.out.println("A terça parte do numero e: "+tercaParte);
    }
}
