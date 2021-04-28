package Aula6;

public class MediaAluno {

    private int [] notasAluno = new int[4];
    private int indexDisponivel = 0;
    private double notasSomadas;

    public boolean adicionaNotas(int nota){
        if(indexDisponivel >= notasAluno.length || (nota < 0 && nota > 100)){
            System.out.println("Não foi possível inserir a nota.");
            return false;
        } else{
            notasAluno[indexDisponivel] = nota;
            indexDisponivel++;
            return true;
        }
    }

    public double mediaDoAluno(){
        for(int i = 0; i < notasAluno.length; i++){
            notasSomadas += notasAluno[i];
        }
        double resultado = notasSomadas / notasAluno.length;
        return resultado;
    }

}
