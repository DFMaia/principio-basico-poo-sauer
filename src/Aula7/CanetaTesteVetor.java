package Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CanetaTesteVetor {

    static List <Caneta> listaDeCanetas = new ArrayList<>();

    static void quebraLinha(){
        System.out.println();
    }

    public static void menu(){
        System.out.println(
                "1 - Cadastrar caneta." +
                        "\n2 - Exibir todas as canetas" +
                        "\n3 - Exibir quantidade de canetas." +
                        "\n4 - Consultar quantidade de canetas de uma determinada cor." +
                        "\n0 - Sair.\n");
    }

    public static void cadastrarCaneta(){

        if(listaDeCanetas.size() == 5){
            System.out.println("***O limite máximo de canetas registradas foi atingido***");
            quebraLinha();
        }else{

            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe a marca da caneta: ");
            String marca = scanner.nextLine();

            System.out.print("Informe a cor da caneta: ");
            String cor = scanner.nextLine();

            System.out.print("Informe o tamanho da caneta: ");
            String tamanho = scanner.nextLine();

            listaDeCanetas.add(new Caneta(marca, cor, tamanho));

            System.out.println("Caneta registrada com sucesso.");
            quebraLinha();

        }


    }

    public static void todasAsCanetas(){
        if(listaDeCanetas.size() == 0){
            System.out.println("Não há canetas registradas");
        }else{
            listaDeCanetas.stream().forEach(e -> System.out.println(e.toString()));
        }

        quebraLinha();
    }

    public static void quantidadeDeCanetas(){
        System.out.println("A quantidade de canetas é: " + listaDeCanetas.size());
        quebraLinha();
    }

    public static void consultaCanetaCor(){
        System.out.print("Informe a cor: ");
        Scanner sc = new Scanner(System.in);
        String cor = sc.nextLine();

        boolean listaPossui = listaDeCanetas.stream().anyMatch( e-> (e.getCor().equals(cor)));

        if(!listaPossui){
            System.out.println("Não existe nenhuma caneta registrada com essa cor.");
        }else{
            listaDeCanetas.stream().filter(e -> e.getCor().equals(cor)).forEach(e -> System.out.println(e));
        }
    }



    public static void main(String[] args) {


        int optional = 0;

        do{
            menu();

            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a opção que deseja: ");
            optional = sc.nextInt();
            quebraLinha();

            if(optional == 0){
                System.out.println("Finalizando o programa...");
            }

            if(optional < 0 || optional > 4){
                System.out.println("***Opção inexistente. Leia atentamente o menu e tente de novo.***\n");
            }

            switch (optional){
                case 1:
                    System.out.println("Opção 1");
                    cadastrarCaneta();
                    break;

                case 2:
                    System.out.println("Opção 2");
                    todasAsCanetas();
                    break;

                case 3:
                    System.out.println("Opção 3");
                    quantidadeDeCanetas();
                    break;

                case 4:
                    System.out.println("Opção 4");
                    consultaCanetaCor();
                    break;
            }

        }while(optional < 0 || optional > 0);

    }

}
