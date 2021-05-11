package Aula9;

public class Funcionario {

    private String nome;
    private double salario;
    private String cpf;
    private int turno;

    public double getBonificacao(){
        return this.getSalario() * 0.05;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", cpf='" + cpf + '\'' +
                ", turno=" + turno +
                '}';
    }
}
