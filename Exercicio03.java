package listadeexercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um numero: ");
        numero = teclado.nextInt();
        
        numero++;
        
        System.out.println("Sucessor: "+numero);
        
        numero--;
        numero--;
        System.out.println("Antecessor: "+numero);
    }
}
