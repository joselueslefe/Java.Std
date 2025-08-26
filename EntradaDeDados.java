//O Scanner é uma ferramenta do Java usada para ler dados que o usuário digita no teclado.

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int i = entrada.nextInt();

        System.out.println("Agora digite seu nome: ");
        String n = entrada.nextLine();
        String n2 = entrada.nextLine();

        System.out.println("Digite agora o nome da cidade que tu mora: ");
        String c = entrada.next();
    }
}
