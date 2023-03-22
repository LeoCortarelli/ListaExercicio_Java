package listadeexercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int num1;
        float num2;
        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        num1 = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = teclado.nextFloat();
        
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
        
        System.out.println("Soma: "+soma);
        System.out.println("subtração: "+subtracao);
        System.out.println("multiplicação: "+multiplicacao);
        System.out.println("divisão: "+divisao); 
    }
}
