package listadeexercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double raio;
        double altura;
        double volume;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o raio da lata: ");
        raio = teclado.nextDouble();
        System.out.println("Digite o altura da lata: ");
        altura = teclado.nextDouble();
        
        volume = Math.PI * Math.pow(raio,2) * altura;
        System.out.println("O volume da lata e "+volume);
    }
}
