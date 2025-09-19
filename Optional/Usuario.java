package Optional;


public class Usuario {
    private String nome;
    private int idd;
    private String sacola;

    public Usuario (String nome, int idd, String sacola){
        this.nome = nome;
        this.idd = idd;
        this.sacola = sacola;

    }

    public String getnome(){
        return nome;
    }

    public int getidd() {
        return idd;
    }

    public String getsacola () {
        return sacola;
    }
}
