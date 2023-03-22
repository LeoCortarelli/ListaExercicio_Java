/*
Ler um número e imprimir se ele é igual a 5, a 200, a 400, se está no intervalo
entre 500 e 1000, inclusive, ou se ele está fora dos escopos anteriores.
 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double numero;
        double igual;
        
        
        
        
        System.out.println("Digite o primeiro numero: ");
        numero = teclado.nextDouble();
        
        
        if(numero == 5){
           igual =  numero;
           System.out.println("Ele e igual a 5");
        }else if (numero == 200){
           igual = numero; 
           System.out.println("Ele e igual a 200");
        }else if (numero == 400){
            igual = numero;
            System.out.println("Ele e igual a 400");
        }else{
            System.out.println("Ele não e igual a nenhum dos numeros relacionados");
        }
        
        if(numero > 500 && numero < 1000){
            System.out.println("Ele esta dentro do intervalo");
        }else{
            System.out.println("Ele não esta dentro do intervalo");
        }
    }    
}
