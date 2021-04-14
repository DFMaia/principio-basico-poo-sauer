public class Conta {

    private double saldo;
    private int agencia;
    private int numeroDaConta;
    private String titular;

    Conta(String titular, int agencia, int numeroDaConta){
        this.titular = titular;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca (double valor){
        if(valor > this.saldo){
            System.out.println("Você não tem saldo suficiente. Seu saldo é " + this.getSaldo());
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public boolean transfere(double valor, Conta contaDestino){
        if(valor <= this.saldo){
            this.saca(valor);
            contaDestino.deposita(valor);
            return true;
        }else{
            System.out.println("Você não tem saldo suficiente. Seu saldo é " + this.getSaldo());
            return false;
        }
    }

}