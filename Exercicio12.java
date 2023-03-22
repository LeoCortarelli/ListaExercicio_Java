/*
Faça um algoritmo que receba a idade de uma pessoa e mostre a mensagem
de maioridade ou não.
 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        double idade;
        
        System.out.println("Digite a idade: ");
        idade = teclado.nextDouble();
        
        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de iade");
        }
    }
}
