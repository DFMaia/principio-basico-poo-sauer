package Aula6;

public class CompraNumero {

    public void comparaNumeros(double numA, double numB){
        if(numA > numB){
            System.out.println(numA + " é maior que " + numB);
        }else if(numB > numA){
            System.out.println(numB + " é maior que " + numA);
        }else {
            System.out.println("Números são iguais");
        }
    }

}
