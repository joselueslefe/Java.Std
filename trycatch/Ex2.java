package trycatch;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int n2 = scanner.nextInt();


        try {
            int r = n1/n2;
            System.out.println("Resultado: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Digite valores diferentes de zero para divisão.");
        }

    }
}
