package ExerciciosJava;

import java.util.Scanner;

public class PintandoaParede {

    public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);   
        
        System.out.println("Qual é a altura da parede? "); 
        double altura = teclado.nextDouble();
        
        System.out.println("Qual é a largura da parede");
        double largura = teclado.nextDouble();
        
        double media = altura*largura;
        double total = media/2;
        
        System.out.println("O total de litros de tinta necessários são: "+total);
                
        
    }
    
}
