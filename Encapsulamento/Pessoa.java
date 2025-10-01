package Encapsulamento;

public class Pessoa {
    private String nome;
    private int idd;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        if (idd <18) {
            System.out.println("Você é de menor e não poderá ser inscrito.");
        } else {
            this.idd = idd;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
