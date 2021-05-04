package Aula8;

public class Empregado {

    private String primeiroNome;
    private String segundoNome;
    private double salarioMensal;

    public double salarioAnual(){
        return this.salarioMensal * 12;
    }

    public double salarioDezPorcento(){
        return this.salarioMensal * 0.10;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal < 0){
            System.out.println("O salário do empregado será de 0.0");
            this.salarioMensal = 0.0;
        }
        this.salarioMensal = salarioMensal;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }


    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", segundoNome='" + segundoNome + '\'' +
                ", salarioMensal=" + salarioMensal +
                '}';
    }

}
