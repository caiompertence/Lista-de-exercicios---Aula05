//Nome: Caio Martins Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        int soma = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n Digite um numero (0 para encerrar): ");
        numero = entrada.nextInt();
        soma += numero;
        
        while(numero != 0){System.out.println("\n Digite um número (0 para encerrar): ");
        numero = entrada.nextInt();
        soma += numero;}

        System.out.println("\n Soma total = " + soma);

        entrada.close();
        }
    }

