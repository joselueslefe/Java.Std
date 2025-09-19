package Optional;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Miguel",21,null);
        Usuario user2 = new Usuario("Rogério",24,"Anél");
        Usuario user3 = new Usuario("Paulo",64,"Telefone");
        Usuario user4 = new Usuario("José",22,"Kit de DEV");


        System.out.println("Usuário 1: ");
        System.out.println("Nome: " + user1.getnome());
        System.out.println("Idade: " + user1.getidd());
        System.out.println("Sacola: " + user1.getsacola());

        if (user1.getsacola() != null){
            System.out.println(user1.getsacola());
        } else {
            System.out.println("Sacola está vazia!");
        }

        System.out.println("____________________________________________");

        System.out.println("Usuário 2: ");
        System.out.println("Nome: " + user2.getnome());
        System.out.println("Idade: " + user2.getidd());
        System.out.println("Sacola: " + user2.getsacola());

        if (user2.getsacola() != null){
            System.out.println(user1.getsacola());
        } else {
            System.out.println("Sacola está vazia!");
        }

        System.out.println("___________________________________________");

        System.out.println("Usuário 3: ");
        System.out.println("Nome: " + user3.getnome());
        System.out.println("Idade: " +user3.getidd());
        System.out.println("Sacola: " + user3.getsacola());

        if (user3.getsacola() != null){
            System.out.println(user1.getsacola());
        } else {
            System.out.println("Sacola está vazia!");
        }

        System.out.println("_____________________________________________");

        System.out.println("Usuário 4: ");
        System.out.println("Nome: " + user4.getnome());
        System.out.println("Idade: " + user4.getidd());
        System.out.println("Sacola: " + user4.getsacola());

        if (user4.getsacola() != null){
            System.out.println(user1.getsacola());
        } else {
            System.out.println("Sacola está vazia!");
        }
    }
}
