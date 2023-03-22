package listadeexercicios;
/*
Fazer um algoritmo que calcule a média aritmética das 3 notas de um aluno
e mostre, além do valor da média do aluno, uma mensagem de "Aprovado",
caso a média seja igual ou superior a 7, ou a mensagem "Reprovado", caso
contrário.
 */
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double media;
        
        System.out.println("Digite a primeira nota do aluno: ");
        n1 = teclado.nextDouble();
        
        System.out.println("Digite a segunda nota do aluno: ");
        n2 = teclado.nextDouble();
        
        System.out.println("Digite a terceira nota do aluno: ");
        n3 = teclado.nextDouble();
        
        media = (n1 + n2 + n3) / 3;
        
        if(media >= 7){
            System.out.println("Sua media é "+media);
            System.out.println("APROVADO");
        }else{
           System.out.println("Sua media é "+media);
           System.out.println("Reprovado"); 
        }
    }
}
