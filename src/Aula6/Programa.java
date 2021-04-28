package Aula6;

public class Programa {

    public static void saltarDuasLinhas(){
        System.out.println("\n");
    }

    public static void main(String[] args) {

        MaiorNumero n = new MaiorNumero();
        System.out.println(n.maiorNumero(25,32));

        NumeroDecrescente n1 = new NumeroDecrescente();
        n1.numeroDecrescente(32.2);

        saltarDuasLinhas();

        NumerosImpares n2 = new NumerosImpares();
        n2.numerosImparesZeroTrinta();

        saltarDuasLinhas();

        TrocaNumero n3 = new TrocaNumero();
        n3.trocaNumeros(321.36, 84567.365);

        saltarDuasLinhas();

        CompraNumero n4 = new CompraNumero();
        n4.comparaNumeros(4.3, 4.3);

        saltarDuasLinhas();

        MediaAluno n5 = new MediaAluno();
        n5.adicionaNotas(20);
        n5.adicionaNotas(15);
        n5.adicionaNotas(9);
        n5.adicionaNotas(18);
        n5.adicionaNotas(23);
        System.out.println("A média do aluno é: " +n5.mediaDoAluno());

        saltarDuasLinhas();

        Agenda a = new Agenda();
        a.adicionaContato("Diego", "diego@diego.com");
        a.adicionaContato("Iago", "iago@iago.com");
        a.adicionaContato("Heitor", "heitor@heitor.com");
        a.adicionaContato("Sauer", "sauer@sauer.com");
        a.adicionaContato("Sauer", "sauer@sauer.com");

        a.buscaPorNome("Diego");
        a.excluirContato("Diego");

        saltarDuasLinhas();

        //Arrays.stream(a.getContato()).forEach((e) -> System.out.println(e.getNome() + " e " + e.getEmail()));



    }

}
