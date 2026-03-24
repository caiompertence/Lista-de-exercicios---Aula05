//Nome: Caio Martins Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int cont = 0;
        int limite;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n Contador de 1 a N\n");
        System.out.println("\n Digite N: ");
        limite = entrada.nextInt();

        if (limite == 0) {System.out.println("\n Valor inválido. N deve ser maior que zero.");

        }else {
        
        while (cont < limite){System.out.println("\n" + (cont + 1));
            cont ++;}
        System.out.println("\n Contagem concluída.");
    }
        
        entrada.close();
    }
}
