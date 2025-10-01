package Encapsulamento;

public class TestPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.setNome("José");
        p.setIdd(35);
        p.setEmail("jose@hotmail.com");

        if (p.getIdd() >=18) {
            System.out.println("Parabéns!" + p.getNome() + ".");
            System.out.println("============================");
            System.out.println("Seja bem-vindo!");
        } else {
            p.getIdd();
        }
    }
}
