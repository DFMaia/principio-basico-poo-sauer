package Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LampadaTesteVetor {

    static List <Lampada> listaDeLampadas = new ArrayList<>();

    public static void quebraDeLinha(){
        System.out.println();
    }

    public static void menu (){
        System.out.println("1 - Cadastrar lâmpada." +
                "\n2 - Exibir todas as lâmpadas." +
                "\n3 - Exibir a quantidade de lâmpadas cadastradas." +
                "\n4 - Consultar quantidade de lâmpadas de uma determinada potência." +
                "\n5 - Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas." +
                "\n6 - Exibir a quantidade de lâmpadas acesas e apagadas.");
        quebraDeLinha();
    }

    public static void cadastrarLampada(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tipo da lâmpada. Incandescente, halógenas, LFC ou LED: ");
        String tipo = sc.nextLine();

        System.out.print("Informe a cor da lâmpada: ");
        String cor = sc.nextLine();

        System.out.print("Informe a marca da lâmpada: ");
        String marca = sc.nextLine();

        System.out.print("Informe a voltagem da lâmpada: ");
        int voltagem = sc.nextInt();

        System.out.print("Informe a potência da lâmpada: ");
        int potencia = sc.nextInt();

        System.out.print("Informe o status da lâmpada: ");
        boolean status = sc.nextBoolean();

        System.out.print("Informe o preço da lâmpada: ");
        double preco = sc.nextDouble();

        listaDeLampadas.add(new Lampada(tipo, cor, marca, voltagem, potencia, status, preco));

        System.out.println("LÂMPADA CADASTRADA COM SUCESSO!!!");

        quebraDeLinha();
    }

    public static void todasAsLampadas(){
        listaDeLampadas.stream().forEach( e -> System.out.println(e.toString()));
        quebraDeLinha();
    }

    public static void quantidadeLampadasCadastradas(){
        System.out.println("A quantidade de lâmpadas cadastradas é: " + listaDeLampadas.size());
        quebraDeLinha();
    }

    public static void consultaLampadaPotencia(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a potência que deseja pesquisar: ");
        int potencia = sc.nextInt();

        boolean existe = listaDeLampadas.stream()
                .anyMatch( e-> (e.getPotencia() == potencia));

        if(!existe){
            System.out.println("Não foi encontrado nenhuma lâmpada registrada" +
                    " em nossa base com essa potência: " + potencia);
        }else{
            listaDeLampadas.stream()
                    .filter( e -> e.getPotencia() == potencia)
                    .forEach(e -> System.out.println(e.toString()));
        }

        quebraDeLinha();
    }

    public static void precoMenorQueMedia(){
        double media = listaDeLampadas
                .stream()
                .collect
                (Collectors
                .averagingDouble((e) -> e.getPreco()));

        listaDeLampadas.stream()
                .filter(e -> e.getPreco() < media)
                .forEach(e -> System.out.println(e.toString()));

        quebraDeLinha();
    }

    public static void statusLampadas(){
        long lampadasApagadas = listaDeLampadas
                .stream()
                .filter(e-> e.getStatus() == false)
                .count();

        long lampadasAcesas = listaDeLampadas
                .stream()
                .filter(e -> e.getStatus() == true)
                .count();

        Map<Boolean, List<Lampada>> lampadasPorId = listaDeLampadas
                .stream()
                .collect(Collectors.groupingBy(e -> e.getStatus() == false));

        System.out.println("São " + lampadasApagadas + " lâmpadas apagadas.");
        System.out.println("São " + lampadasAcesas + " lâmpadas acesas.");
        System.out.println(lampadasPorId);
        quebraDeLinha();
    }

    public static void main(String[] args) {

        int op = 0;

        do{

            menu();

            System.out.print("Informe a opção que deseja: ");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            quebraDeLinha();

            if(op == 0){
                System.out.println("Encerrando o programa...");
                quebraDeLinha();
            }

            if(op < 0 || op > 6){
                System.out.println("Opção inexistente. Leia novamente o menu e selecione uma opção válida. ");
                quebraDeLinha();
            }

            switch (op){
                case 1:
                    System.out.println("Você selecionou a opção 1");
                    cadastrarLampada();
                    break;

                case 2:
                    System.out.println("Você selecionou a opção 2");
                    todasAsLampadas();
                    break;

                case 3:
                    System.out.println("Você selecionou a opção 3");
                    quantidadeLampadasCadastradas();
                    break;

                case 4:
                    System.out.println("Você selecionou a opção 4");
                    consultaLampadaPotencia();
                    break;

                case 5:
                    System.out.println("Você selecionou a opção 5");
                    precoMenorQueMedia();
                    break;

                case 6:
                    System.out.println("Você selecionou a opção 6");
                    statusLampadas();
                    break;
            }

        }while(op != 0);

    }

}
