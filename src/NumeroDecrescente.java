public class NumeroDecrescente {

    public void numeroDecrescente(double numero){
        //O usuário poderá inserir um número double, mas o processamento acontecerá como o número fosse int.
        int numeroVerificado = (int) numero;

        if(numeroVerificado < 0){
            System.out.println("O número não pode ser menor que zero");
        }else{
            for(int i = numeroVerificado; i >= 0; i--){
                System.out.print(i + " ");
            }
        }
    }

}
