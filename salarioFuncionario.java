package ExerciciosJava;

import java.util.Scanner;

public class SalarioFuncionario {

public static void main(String [] args) {
    Scanner teclado = new Scanner (System.in);

    System.out.println("Digite o nome do funcionario: ");
    String nome = teclado.nextLine();
    
    System.out.println("Digite o salário de "+nome);
    int salario = teclado.nextInt();
    System.out.println("O salário do funcionario "+nome+ "é: "+salario);

} 
}
