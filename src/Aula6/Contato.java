package Aula6;

public class Contato {

    private String nome;
    private String email;

    Contato(String nome, String email){
        this.email = email;
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
}
