//Nome: Caio Martins Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int ladoA;
        int ladoB;
        int ladoC;
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("\n Classificação de triângulos\n");
        
        System.out.println("\n Lado A: ");
        ladoA = entrada.nextInt();
        
        System.out.println("\n Lado B: ");
        ladoB = entrada.nextInt();
        
        System.out.println("\n Lado C: ");
        ladoC = entrada.nextInt();

        
        if (ladoA == ladoB && ladoA == ladoC){System.out.println("\n Triângulo Equilátero.\n");}else

        if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){System.out.println("\n Triângulo Escaleno.\n");

        }else

        if (ladoA == ladoB && ladoA != ladoC){System.out.println("\n Triângulo Isóceles.\n");

        }else

        if (ladoA == ladoC && ladoA != ladoB){System.out.println("\n Triângulo Isóceles.\n");

        }else

        if (ladoB == ladoC && ladoB != ladoA){System.out.println("\n Triângulo Isóceles.");

        }

        entrada.close();
    }
}
