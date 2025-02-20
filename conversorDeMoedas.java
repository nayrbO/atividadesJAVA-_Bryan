package ExerciciosJava;

import java.util.Scanner;

public class conversorDeMoedas {

public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Quantos reais você tem? ");
    double reais = teclado.nextDouble();
    
    double dolares = 5.45;
    double total = reais/dolares;
    
    System.out.println("Os reais que você tem convertido em dolares são: "+total); 
    
    }
    
}
