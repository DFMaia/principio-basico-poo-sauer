package Aula7;

public class LampadaTesteVetor {

    public static void main(String[] args) {

        Lampada lampada1 = new Lampada();
        lampada1.setCor("Amarelo");
        lampada1.setMarca("GE");
        lampada1.setPotencia(40);
        lampada1.setPreco(23.0);
        lampada1.setStatus(true);
        lampada1.setTipo("led");
        lampada1.setVoltagem(110);

        System.out.println(lampada1);

    }

}
