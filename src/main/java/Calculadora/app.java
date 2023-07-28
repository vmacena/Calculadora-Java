package Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valor1;
        Double valor2;
        String operacao;
        boolean continuar;

        do {
            System.out.println("Digite o primeiro valor: ");
            valor1 = scanner.nextDouble();

            System.out.println("Digite a Operação: \n | + , -, / ou * ");
            operacao = scanner.next();

            System.out.println("Digite o segundo valor: ");
            valor2 = scanner.nextDouble();

            System.out.println("Resultado: " + calculo(valor1, valor2, operacao));

            continuar = VerificarNovaOp();
        }while (continuar);

    }
    public static boolean VerificarNovaOp(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja fazer outra operação? \n (S ou N) ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
    public static Double calculo(Double valor1, Double valor2, String operacao){
        Double calculo = 0.0;

        switch (operacao){
            case "+":
                calculo = valor1 + valor2;
                break;
            case "-":
                calculo = valor1 - valor2;
                break;
            case "/":
                calculo = valor1 / valor2;
                break;
            case "*":
                calculo = valor1 * valor2;
                break;
            default:
                System.out.println("Operação inválida. \n");
        }
        return calculo;
    }
}
