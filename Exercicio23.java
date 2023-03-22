/*
Criar um algoritmo que imprima a tabela de conversão de graus CelsiusFahrenheit para o intervalo desejado pelo usuário. O algoritmo deve solicitar
ao usuário o limite superior, o limite inferior do intervalo e o decremento.
Fórmula de conversão: C = 5 (F – 32) / 9
 */
package listadeexercicios;

import java.util.Scanner;


public class Exercicio23 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
    int num;
    double cel;
    double fahr;
    
    System.out.println("Digite um numero");
    num = teclado.nextInt();
    
         for(int i = 1; i <= num; i++){
             cel = i;
             fahr = (cel * 1.8) + 32;
             System.out.println("Graus "+cel);
             System.out.println("Fahrenheit "+fahr);
         }
    }    
}
