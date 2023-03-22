/*
Elabore um programa em Java que leia a base e a altura de um triângulo,
calcule e apresente a área.
 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
      double a, b;
      double area;
      
      System.out.println("Digite a altura: ");
      a = teclado.nextDouble();
      
      System.out.println("Digite a base: ");
      b = teclado.nextDouble();
      
      area = (a * b)/2;
      
      System.out.println("A área e "+area);
    }
}
