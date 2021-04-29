package Aula7;

public class Lampada {

    private String tipo;
    private String cor;
    private String marca;
    private int voltagem;
    private int potencia;
    private boolean status;
    private double preco;

    Lampada(String tipo, String cor, String marca, int voltagem, int potencia, boolean status, double preco){
        this.tipo = tipo;
        this.cor = cor;
        this.marca = marca;
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.status = status;
        this.preco = preco;
    }

    public void acender(){
        this.status = true;
    }

    public void apagar(){
        this.status = false;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean getStatus() {
        return status;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", voltagem=" + voltagem +
                ", potencia=" + potencia +
                ", status=" + status +
                ", preco=" + preco +
                '}';
    }
}
