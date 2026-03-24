//Nome: Caio Martins Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int numA;
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("\n Par ou ímpar\n");
       System.out.println("\n Digite um número inteiro: ");
       numA = entrada.nextInt();

       if (numA % 2 == 0){System.out.println("\n O número é par.");

       } else {System.out.println("\n O número é ímpar.");}
    entrada.close();
    }
}
