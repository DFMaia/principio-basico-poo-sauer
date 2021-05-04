package Aula8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Data {

    /**
     * PROFESSOR, NÃO FAZ SENTIDO A GENTE COLOCAR SET NOS ATRIBUTOS SE O SENHOR QUER
     * QUE A DATA SEJA A FORNECIDA PELO SISTEMA OPERACIONAL.
     * POR ESSA RAZÃO QUE FIZ SOMENTE OS GET
     */

    private int dia;
    private int mes;
    private int ano;

    public String dataAtualFormatada(){
        LocalDate dataHoje = LocalDate.now();
        DateTimeFormatter dataHojeFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return dataHojeFormatada.format(dataHoje);
    }

    public LocalDate dataAtual(){
        LocalDate dataHoje = LocalDate.now();
        this.dia = dataHoje.getDayOfMonth();
        this.mes = dataHoje.getMonthValue();
        this.ano = dataHoje.getYear();
        return dataHoje;
    }

    public LocalDate dataAmanha(){
        LocalDate dataHoje = LocalDate.now();
        return dataHoje.plusDays(1);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
