package Aula6;

public class MaiorNumero {

    public double maiorNumero(int primeiroNumero, int segundoNumero){

        if(primeiroNumero > segundoNumero){
            return primeiroNumero;
        }else if(segundoNumero > primeiroNumero){
            return segundoNumero;
        }else{
            //Se os valores forem iguais
            return primeiroNumero;
        }

    }

}
