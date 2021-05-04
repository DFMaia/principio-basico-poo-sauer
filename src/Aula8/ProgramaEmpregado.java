package Aula8;

public class ProgramaEmpregado {

    public static void main(String[] args) {

        Empregado empregado1 = new Empregado();
        empregado1.setPrimeiroNome("João");
        empregado1.setSegundoNome("Silva");
        empregado1.setSalarioMensal(-3500.00);
        empregado1.setSalarioMensal(3500.00);
        System.out.println("O salário anual é de: " + empregado1.salarioAnual());

        Empregado empregado2 = new Empregado();
        empregado2.setPrimeiroNome("João");
        empregado2.setSegundoNome("Silva");
        empregado2.setSalarioMensal(-4500.00);
        empregado2.setSalarioMensal(4500.00);
        System.out.println("O salário anual é de: " + empregado2.salarioAnual());

    }

}
