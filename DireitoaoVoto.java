package ExerciciosJava;

import java.util.Scanner;

public class DireitoaoVoto {

 public static void main(String[] args) {
  
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("Qual seu nome?");
     String nome = teclado.nextLine();
     
     System.out.println("Em que ano você nasceu?");
     int ano = teclado.nextInt();
        
     int idade = (2025-ano); 
    
 
     
 
    if (idade < 16) {
            System.out.println("Você não pode votar! "+nome);    
            
     
    }else{
        System.out.println("Você pode votar "+nome);
        
    }
 }   
}
