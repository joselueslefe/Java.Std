//Estruturas de repetição (while e for)

public class EstruturasRepeticao {
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
    }
}
