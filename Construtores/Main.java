package Construtores;

public class Main {
    public static void main(String[] args) {

        Usuario u = new Usuario("Carlos",21, "Engenheiro de Software Pleno");
        Usuario u2 = new Usuario("Pedro", 25,"Engenheiro de Software PLeno");
        Usuario u3 = new Usuario("Manoel Vinicius", 45,"Engenheiro de Software junior");
        Usuario u4 = new Usuario("Gabriel Fernando", 26,"Engenheiro de Software junior");

        System.out.println("Usuário 1: " + u.nome );
        System.out.println("idade: " + u.idd );
        System.out.println("Cargo: " + u.cargo );

        System.out.println("_______________________________");

        System.out.println("Usuário 2: " + u2.nome );
        System.out.println("idade: " + u2.idd );
        System.out.println("Cargo: " + u2.cargo );

        System.out.println("_______________________________");

        System.out.println("Usuário 3: " + u3.nome );
        System.out.println("idade: " + u3.idd );
        System.out.println("Cargo: " + u3.cargo );

        System.out.println("_______________________________");

        System.out.println("Usuário 4: " + u4.nome );
        System.out.println("idade: " + u4.idd );
        System.out.println("Cargo: " + u4.cargo );

    }
}
