package ExerciciosJava;

import java.util.Scanner;

public class ConversordeMedidas {
public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite a distância em metros");
    double metros = teclado.nextDouble();
    
    double kilometros = metros/1000;
    System.out.println("A distancia em metros convertida em kilometros é: "+kilometros);        
    
    double centimetros = metros*100;            
    System.out.println("A distancia em metros convertida em centimentros é: "+centimetros);
    
    }
    
}
