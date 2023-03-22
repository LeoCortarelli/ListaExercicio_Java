/*
Ler nome, endereço e telefone e imprimi-los. Utilizar String para
desenvolvimento do exercício.
 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        String nome;
        String endereco;
        String telefone;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o seu NOME: ");
        nome = teclado.nextLine();
        
        System.out.println("Digite o seu ENDEREÇO: ");
        endereco = teclado.nextLine();
        
        System.out.println("Digite o seu TELEFONE: ");
        telefone = teclado.nextLine();
        
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Telefone: "+telefone);
        
    }
}
