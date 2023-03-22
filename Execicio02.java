package listadeexercicios;

import java.util.Scanner;

public class Execicio02 {
    public static void main(String[] args){
        double n1, n2, n3, n4;
        double media;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        n1 = teclado.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        n2 = teclado.nextDouble();
        
        System.out.println("Digite o terceiro numero: ");
        n3 = teclado.nextDouble();
        
        System.out.println("Digite o quarto numero: ");
        n4 = teclado.nextDouble();
        
        media = (n1 + n2 + n3 + n4) / 4;
        
        System.out.println("A media e: "+media);
    }
}
