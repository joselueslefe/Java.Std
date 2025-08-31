import java.util.Scanner;

public class LeitorScanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = 0;

        while (numero <= 10) {
            System.out.print("Digite um número maior que 10: ");
            numero = leitor.nextInt();

            if (numero <= 10) {
                System.out.println("Esse número não serve! Tente de novo.");
            }
        }

        System.out.println("Boa! Você digitou " + numero + ", que é maior que 10!");

        leitor.close();

         }
    }
