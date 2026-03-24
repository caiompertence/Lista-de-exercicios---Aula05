//Nome: Caio Martins Pertence
//Matrícula: 126193573

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int nota;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n Validação de nota com conceito\n");
        System.out.println("\n Digite a nota do aluno (0 a 100): ");
        nota = entrada.nextInt();

        while (nota < 0 || nota > 100){System.out.println("\n Nota inválida. Tente novamente. ");
            break;
        }

        if(nota >= 90 && nota < 101){System.out.println("\n Conceito: A.");
        }else

        if(nota >= 75 && nota < 90){System.out.println("\n Conceito: B. ");
        }else

        if(nota >= 60 && nota < 75){System.out.println("\n Conceito: C. ");
        }else

        if(nota < 60 && nota > 0){System.out.println("\n Conceito D (Reprovado).");
        }
    
    entrada.close();
    }
}
