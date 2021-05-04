package Aula8;

public class ProgramaData {

    public static void main(String[] args) {

        Data diaDeHoje = new Data();
        System.out.println("Dia de hoje sem formatação " + diaDeHoje.dataAtual());
        System.out.println("Dia de hoje com formatação em barra" + diaDeHoje.dataAtualFormatada());
        System.out.println("Data de amanhã " + diaDeHoje.dataAmanha());
        System.out.println("O dia do mês é: " + diaDeHoje.getDia());
        System.out.println("O mês é: " + diaDeHoje.getMes());
        System.out.println("O ano é " + diaDeHoje.getAno());

    }

}
