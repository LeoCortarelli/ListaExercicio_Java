/*
Criar um algoritmo que deixe escolher qual a tabuada de multiplicar que se
deseja imprimir todos os valores de 1 a 10.
 */
package listadeexercicios;

import java.util.Scanner;


public class Exercicio20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
            int num;
            int result;
            int cont = 0;
            
            System.out.println("Digite o numero: ");
            num = teclado.nextInt();
            
            while(cont <= 10){
                result = num * cont;
                
               System.out.println(""+cont+"x"+num+"="+result); 
               cont++;
            }
    }    
}
