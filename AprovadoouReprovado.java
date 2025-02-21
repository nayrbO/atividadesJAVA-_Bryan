package ExerciciosJava;

import java.util.Scanner;

public class AprovadoouReprovado {

    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);


        System.out.println("Qual é seu nome?");
        String nome = teclado.nextLine();
        
        System.out.println("Qual sua nota em português? ");
        double nota = teclado.nextDouble();
        
        System.out.println("Qual sua nota em matemática? ");
        double nota2 = teclado.nextDouble();
        
        double media = (nota+nota2) /2;
        
        if(media < 7){
            System.out.println("Você foi reprovado!" +nome+ media);
            
        }else{
        
            System.out.println("Você foi aprovado " +nome+ " parabéns!" +media);    
        }
        
    }
    
}
