package ExerciciosJava;

import java.util.Scanner;

public class SalariodoCupincha {

public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Quantos dias você trabalhou Cupincha?");
    double dias = teclado.nextDouble();
    
    double valorsalario = (25*8);
    double valorfinal = (valorsalario*dias);
    
    System.out.println("Seu salário desse mês é: "+valorfinal);
    
     }



    
}
