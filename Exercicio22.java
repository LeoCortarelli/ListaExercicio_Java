/*
Ler vários números e informar quantos números entre 100 e 200 foram
digitados. Quando o valor 0 (zero) for lido, o algoritmo deverá cessar sua
execução.
 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
            int numero;
            int intervalo = 0;
            
            System.out.println("Digite o numero ou (0) para encerrar: ");
            numero = teclado.nextInt();
            
            while(numero != 0){
               if(numero > 100 && numero < 200){
                   intervalo++;
               }
                System.out.println("Digite o numero ou (0) para encerrar: ");
                numero = teclado.nextInt();
            }
            
            System.out.println("Estão no intevalo "+intervalo+" numeros");
    }    
}
