package listadeexercicios;

import java.util.Scanner;

/*Ler uma temperatura em graus centígrados e apresentá-la convertida em
graus Fahrenheit. A fórmula de conversão é:
• F= (C * (9/5)) + 32
I. onde F é a temperatura em Fahrenheit e C é a temperatura em
centígrados.
*/
public class Exercicio04 {
    public static void main(String[] args) {
        double c;
    double f;
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite a temperatura em graus centigratos: ");
    c = teclado.nextDouble();
    
    f = (c * 1.8) + 32;
    
    System.out.println("Em Fahrenheit: "+f);
    }
}
