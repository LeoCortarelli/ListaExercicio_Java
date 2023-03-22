/*
Entrar com um número e imprimir a raiz quadrada do número caso ele seja
positivo e o quadrado do número caso ele seja negativo.
 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double numero;
        double raiz;
        double quadrado;
        
        System.out.println("Digite o numero: ");
        numero = teclado.nextDouble();
        
        if(numero > 0){
            raiz = Math.sqrt(numero);
            System.out.println("A raiz "+raiz);
        }else{
            quadrado = numero * numero;
            System.out.println("O quadrado "+quadrado);
        }
    }
}
