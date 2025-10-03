package trycatch;

import java.util.Scanner;

public class AbrindoCaixa {
    public static void Ex1 (String[] args) {
        Scanner n = new Scanner(System.in);

        try {
            System.out.println("Divisão matemática");
            System.out.println("========================");


            System.out.println("Digite o primeiro valor: ");
            int num1 = n.nextInt();

            System.out.println("Digite o segundo valor: ");
            int num2 = n.nextInt();

            if (num1 == 0 && num2== 0){
                System.out.println("Erro: Divisão indeterminada (0 por 0) .");
            } else if (num1 == 0){
                System.out.println("Erro: O primeiro valor não pode ser zero.");
            } else if (num2 == 0) {
                System.out.println("Erro: O segundo valor não pode ser zero");
            }else {
                int r = num1/num2;
                System.out.println("Resultado: " + r);
            }
        } catch (ArithmeticException e) {
            System.out.println("Digite valores diferentes de zero");
        }

    }
}
