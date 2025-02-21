package ExerciciosJava;

import java.util.Scanner;

public class AlugueldeCarro {

public static void main(String[] args) {

    
    Scanner teclado = new Scanner(System.in);
        
    System.out.println("Quantos kilometros foram percorridos com o veiculo?");
    double km = teclado.nextDouble();
    
    System.out.println("Por quantos dias o veiculo foi alugado?");
    double dias = teclado.nextDouble();
    
    double valorkm = (km*0.20);
    double valordias = (dias*90);
    double valoraluguel = valorkm+valordias;
    
    System.out.println("O valor total do aluguel do carro, contando com as taxas de uso foi: "+valoraluguel);
            
    
    
    }
    
}
