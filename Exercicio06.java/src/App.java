//Nome: Caio Martins Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        int resultado;
        int multiplicador = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n Tabuada");
        System.out.println("Digite o número: \n");
        numero = entrada.nextInt();

        System.out.println();
        
        while(multiplicador <= 10){
            resultado = numero * multiplicador;
            System.out.print(" " + numero);
            System.out.print(" x " + multiplicador);
            System.out.print(" = " + resultado);
            System.out.println();
            multiplicador ++;}
            
        entrada.close();    
    }
}
