package Aula7;

public class DataTeste {

    public static void main(String[] args) {

        Data data = new Data();
        System.out.println(data.validaData(29, 05, 2021));
        System.out.println(data.anoBissexto());
        data.dataFormatada();

    }

}
