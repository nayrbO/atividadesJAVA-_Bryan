package ExerciciosJava;

import java.util.Scanner;

public class DescontonoProduto {

public static void main(String[] args) {
  
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Qual é o valor do produto?");
    double produto = teclado.nextDouble();
    double percentual = 5;
    
    double desconto = produto * (percentual/100);
    double valordesconto = produto - desconto;
    
    System.out.println("O valor do produto com desconto é: "+valordesconto);
    
    }
    
}
