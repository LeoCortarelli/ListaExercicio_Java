/*
Ler um número e indicar se ele está ou não entre o intervalo de 20 a 90.
 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        double num;
        
        System.out.println("Digite um numero: ");
        num = teclado.nextDouble();
        
        if(num <= 20 || num >= 90){
            System.out.println("Ele não esta no intervalo");
        }else{
            System.out.println("Ele está no intervalo");
        }
    }
}
