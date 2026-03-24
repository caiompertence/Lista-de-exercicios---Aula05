//Nome: Caio Martins Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double numA;
        double numB;
        int codigo;
        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n Calculadora com switch/case\n");
        
        System.out.println("\nDigite o primeiro número: ");
        numA = entrada.nextDouble();
        System.out.println("\n Digite o segundo número: ");
        numB = entrada.nextDouble();
        
        System.out.println("\n Operações: 1-Soma 2-Subtração 3-Multiplicação 4-Divisão\n");
        
        System.out.println("\n Informe a operação desejada (código): \n");
        codigo = entrada.nextInt();

        switch (codigo) {
            case 1:
                soma = numA + numB;
                System.out.println("\n Resultado: " + soma);
                break;

            case 2:
                subtracao = numA - numB;
                System.out.println("\n Resultado: " + subtracao);
                break;

            case 3:
                multiplicacao = numA * numB;
                System.out.println("\n Resultado: " + multiplicacao);
                break;
                
            case 4:
                if (numB == 0 ){System.out.println("\n Erro. Divisão por 0 não é permitida!");
                    
                }else {divisao = numA / numB; 
                    System.out.println("\n Resultado = " + divisao);}
                break;
        }
    entrada.close();
    }
}