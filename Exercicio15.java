/*

 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3, n4, n5;
        double maior;
        double menor;
        
        System.out.println("Digite o primeiro numero: ");
        n1 = teclado.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = teclado.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        n3 = teclado.nextDouble();
        System.out.println("Digite o quarto numero: ");
        n4 = teclado.nextDouble();
        System.out.println("Digite o quinto numero: ");
        n5 = teclado.nextDouble();
        
        
        if(n1 > n2 && n1 > n3 ){
            maior = n1;
            if(n2 < n3){
               menor = n2;
            }else{
                menor = n3;
            }
        }else if(n2 > n1 && n2 > n3){
            maior = n2;
            if(n1 < n3){
               menor = n1;
            }else{
                menor = n3;
            }
        }else{
            maior = n3;
            if(n1 < n2){
               menor = n1;
            }else{
                menor = n2;
            }
        }
        
        if(maior < n4){
            maior = n4; 
         }
        if(maior < n5){
            maior = n5;
        }
        
        if(n4 < menor){
            menor = n4;
        }
        if(n5 < menor){
            menor = n5;
        }
        
        
        System.out.println("O maior numero e "+maior);
        System.out.println("O menor numero e "+menor);
     }
 }

