package ExerciciosJava;

import java.util.Scanner;

public class CalculandoDelta {

public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual é o valor de A? ");
        double a = teclado.nextDouble();
        
        System.out.println("Qual é o valor de B? ");
        double b = teclado.nextDouble();
    
        System.out.println("Qual é o valor de C? ");
        double c = teclado.nextDouble();
        
        double delta = Math.pow(b, 2) -4*a*c;    
        
        System.out.println("O valor de delta é: "+delta);
    
    }

}
