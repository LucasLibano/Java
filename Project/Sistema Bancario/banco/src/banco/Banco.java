package banco;

public class Banco {

    private int numero;
    private String titular;
    private double saldo;
    private double taxa = 5;

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public double calcularTaxa(){
        return saldo - (saldo * taxa / 100);
    }
}


