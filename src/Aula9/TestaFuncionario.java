package Aula9;

public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario nico = new Funcionario();
        nico.setNome("Nico Steppat");
        nico.setCpf("282.978.860-50");
        nico.setSalario(2500.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

        Vendedor sauer = new Vendedor("generico", 5000.00);
        sauer.getBonificacaoVendedor();



    }

}
