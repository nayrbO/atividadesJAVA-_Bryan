package ExerciciosJava;

import java.util.Scanner;

public class AntecessoreSucessor {
public static void main(String[] args) {

       Scanner teclado = new Scanner (System.in);
       
    System.out.println("Digite um número: ");   
    int numero = teclado.nextInt();
    
    int antecessor = numero - 1;
    
    System.out.println("O antecessor de "+numero+ "é: "+antecessor);
    
    int sucessor = numero + 1;
    
    System.out.println("O sucessor de "+numero+ "é: "+sucessor);
       
       
    }
    
}
