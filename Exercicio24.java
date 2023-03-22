/*
Entrar com 20 números e imprimir a soma dos positivos e o total de números
negativos.
 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
        int soma = 0;
        int neg = 0;
        int num;
        
        for(int cont = 0; cont < 21; cont++){
            System.out.println("Digite um numero");
            num = teclado.nextInt();
            
            if(num > 0){
                soma = soma + num;
            }else{
                neg++;
            }
            cont++;           
        }
        System.out.println("A soma dos positivos "+soma); 
        System.out.println("O total de numeros negativos "+neg); 
    }
}
