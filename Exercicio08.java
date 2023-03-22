/*
Elabore um programa em Java que leia a base e a altura de um retângulo e
apresente o perímetro, a área e a diagonal, dada as fórmulas:
*/

package listadeexercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        
        double base;
        double altura;
        double perimetro;
        double area;
        double diagonal;
        double quadrado;
        
        System.out.println("Digite a base: ");
        base = teclado.nextDouble();
        
        System.out.println("Digite a altura: ");
        altura = teclado.nextDouble();
        
        perimetro = 2 * (base + altura);
        
        area = base * altura;
        
        quadrado = Math.pow(area, base);
        
        diagonal = Math.sqrt(quadrado);
        
        
        System.out.println("O resultado do perimetro e "+perimetro);
        System.out.println("O resultado da área e "+area);
        System.out.println("O resultado do diagonal "+diagonal);
        
    }
}
