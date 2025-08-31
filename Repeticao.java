//Estruturas de repetição (while e for)

public class Repeticao {
    public static void main(String[] args) {
        //while — repete enquanto uma condição for verdadeira

        int contador = 1;
        while (contador<=10) {
            System.out.println("contando: "+contador);
            contador++;
        }
        //O que está acontecendo?
        //
        //Começamos com contador = 1
        //
        //Enquanto contador <= 5, ele imprime o número
        //
        //Depois de imprimir, contador++ soma 1
        //
        //Dica: ++ significa "soma 1".
        //(É igual a fazer contador = contador + 1;)

        //for — repete por um número definido de vezes

        for (int n = 1; n <=10; n++){
            System.out.println("Repetição de número: "+n);
        }
        System.out.println("STOP!!!");
        //O que isso significa?
        //
        //int i = 1 → Começa no 1
        //
        //i <= 5 → Enquanto for menor ou igual a 5
        //
        //i++ → Soma 1 a cada volta
        //Como memorizar
        //
        //while = repete enquanto a condição for verdadeira
        //for = repete um número fixo de vezes


        int tentativas = 0;
        boolean saiuDoLabirinto = false;

        do {
            System.out.println("Tentando sair do labirinto...");
            tentativas++;

            if (tentativas == 3) {
                saiuDoLabirinto = true;
            }

        } while (!saiuDoLabirinto);

        System.out.println("Saí depois de " + tentativas + " tentativas!");
        //desafios:

        for (int n = 20; n>=1; n--){
            System.out.println("Contando: " + n);
        }
        System.out.println("Lançamento!");
    }
}
