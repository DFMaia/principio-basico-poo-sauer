package Aula6;

public class Agenda {

    private Contato contato [] = new Contato[4];
    private int indexDisponivel = 0;

    public boolean adicionaContato(String nome, String email){
        if(indexDisponivel >= contato.length){
            System.out.println("Não há espaço para inserir");
            return false;
        }else{
            contato[indexDisponivel] = new Contato(nome, email);
            indexDisponivel++;
            return true;
        }
    }

    public boolean excluirContato(String nome){
        for(int i = 0; i < contato.length; i++){
            if(contato[i].getNome() == nome){
                contato[i] = null;
                System.out.println("O contato foi excluído com sucesso.");
                return true;
            }
        }
        System.out.println("O contato não existe e portanto não pode se excluído");
        return false;
    }

    public boolean buscaPorNome(String nome){
        for(int i = 0; i < contato.length; i++){
            if(contato[i].getNome() == nome){
                System.out.println("O nome " + nome + " tem o e-mail " + contato[i].getEmail());
                System.out.println("Está na posição " + i);
                return true;
            }
        }
        System.out.println("Não tem ninguém com esse nome na agenda");
        return false;
    }
}
