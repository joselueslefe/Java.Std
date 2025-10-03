package trycatch;

import java.util.Scanner;

public class ex3 {
    public static void ex3(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro: ");
        int n2 = scanner.nextInt();

        int r = n1 / n2 ;

        System.out.println("Resultado: " + r);
    }
}
