package ExerciciosJava;

import java.util.Scanner;

public class DobroeTerca {
public static void main(String[] args) {
        
    Scanner teclado = new Scanner (System.in);
    
    System.out.println("Digite um número: ");
    double numero = teclado.nextDouble();
    
    double dobro = numero*2;
    System.out.println("O dobro de "+numero+ "é: "+dobro);
    
    double terca = numero/3;
    System.out.println("A terca de "+numero+ "é: "+terca);
    
    
    
    }
   
}
