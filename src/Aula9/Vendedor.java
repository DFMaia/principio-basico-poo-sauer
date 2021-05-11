package Aula9;


public class Vendedor extends Funcionario{

    private String especialidade;

    Vendedor(String especialidade, double salario){
        setEspecialidade(especialidade);
        super.setSalario(salario);
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade.toLowerCase();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void getBonificacaoVendedor(){
        if(this.especialidade.equals("roupa")){
            System.out.println(getBonificacao_vendedor_roupa());
        } else if(this.especialidade.equals("calcado") || this.especialidade.equals("calçado")){
            System.out.println(getBonificacao_vendedor_calcado());
        } else if(this.especialidade.equals("generico") || this.especialidade.equals("genérico")){
            System.out.println(getBonificacao_vendedor_generico());
        } else {
            System.out.println("A especialidade que você definiu para o funcionário não existe.");
            System.out.println("Portanto o funcionário nõ terá bonificação.");
            System.out.println("Salário é de " + super.getSalario());
        }
    }

    private double getBonificacao_vendedor_roupa(){
        return super.getSalario() * 0.05;
    }

    private double getBonificacao_vendedor_calcado(){
        return super.getSalario() * 0.06;
    }

    private double getBonificacao_vendedor_generico(){
        return super.getSalario() * 0.07;
    }
}
