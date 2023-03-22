/*
Chico tem 1.50m de altura e cresce 2cm por ano, enquanto Juca tem 1,10m
e cresce 3cm por ano. Construir um algoritmo que calcule e imprima quantos
anos serão necessários para que Juca seja maior que Chico.
 */
package listadeexercicios;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
            double chico;
            double juca;
            int anos = 0;
            
            chico = 1.50;
            juca = 1.10;
            while(juca < chico){
                chico = chico + 0.2;
                juca = juca + 0.3;
                anos++;
            }
            
            System.out.println("A quantidade de anos e "+anos);
    }    
}
