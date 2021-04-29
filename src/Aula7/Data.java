package Aula7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public boolean validaData(int dia, int mes, int ano){
        if(dia <= 0){
            System.out.println("Dia não pode ser menor ou igual a zero.");
            return false;
        }else if(mes <= 0 || mes >12){
            System.out.println("Mês não pode ser menor ou igual a zero e não pode ser maior que doze");
            return false;
        }else if(ano < 1970){
            System.out.println("Ano não pode ser menor que 1970");
        } else{
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            System.out.println("Data registrada com sucesso!");
        }
            return true;

    }

    public boolean anoBissexto(){
        LocalDate data = LocalDate.of(this.ano, this.mes, this.dia);
        if(data.isLeapYear() == true){
            System.out.println("O ano é bissexto");
        }

        System.out.println("Ano não é bissexto.");
        return false;
    }

    public void dataFormatada(){
        LocalDate data = LocalDate.of(this.ano, this.mes, this.dia);

        List <String> meses = Arrays.asList("janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro");

        String mes = meses.get(this.mes - 1);
        System.out.println(this.dia + "/" + mes + "/" + this.ano);

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
}
