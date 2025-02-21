package ExerciciosJava;

import java.util.Scanner;

public class MultaExcessoVelocidade {

public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Qual a velocidade percorrida pelo veiculo?");
    double velocidade = teclado.nextDouble();
    
    if (velocidade > 80) {
    double multa = (5);    
    double excesso = (velocidade - 80);
    double valormulta = (excesso*multa);
    
        System.out.println("Você foi multado em: "+valormulta);
        
    }else{
    
        System.out.println("Você não foi multado!");     
    
    }
}
}
