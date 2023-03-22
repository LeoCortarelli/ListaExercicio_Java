/*
Imprimir todos os números de 100 at 0.
 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        double resto;
            
            for(int cont = 0; cont < 101; cont++){
                resto = cont % 2;
                
                if(resto == 0){
                    System.out.println(cont);
                }
            }
    }    
}
