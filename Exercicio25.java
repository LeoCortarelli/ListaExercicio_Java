/*

 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
        String name;
        
        System.out.println("Digite o nome: ");
        name = teclado.nextLine();
    
        while(name != "fim" || name != "FIM"){
          System.out.println("Digite o nome: ");
          name = teclado.nextLine();
          break;
        }
    }
}
