public class Condicional {
    public static void main(String[] args) {
       int n1 = 18;

       if (n1 == 189) {
            System.out.println("Você acabou de fazer 18 anos e está aprovado!!");
            System.out.println("Obrigado pela preferência! :)");
        } else {
           System.out.println("Você não vai poder ir! Obrigado pela preferência novamente!");
       }


       //Sintaxe com duas possibilidades:

        int n2 = 100;

        if (n2 == 99) {
            System.out.println("boa nota!");
        } else if (n2 == 100) {
            System.out.println("Você atingiu a pontuação desejada. Parabéns!!!");
        } else {
            System.out.println("Você precisa melhorar!");
        }

    }
}
