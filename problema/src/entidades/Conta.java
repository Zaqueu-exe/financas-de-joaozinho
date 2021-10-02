package entidades;

import excecao.SaldoInsuficiente;
import excecao.ValorNegativo;

public class Conta {
    private int numeroConta;
    private int agencia;
    private double saldo;
    private String titular;

    public Conta(int numeroConta, int agencia, double saldo, String titular) {
        if (saldo < 0) {
            throw new ValorNegativo("Valor inserido é menor que 0");
        } else {
            this.numeroConta = numeroConta;
            this.agencia = agencia;
            this.saldo = saldo;
            this.titular = titular;
        }
    }
    public boolean sacar(double valor){
        if(this.saldo - valor > 0){
            this.saldo -= valor;
            return true;
        }
        throw new SaldoInsuficiente("Saldo insuficiente para realizar essa operação");
    }
    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        throw new ValorNegativo("Valor inserido é menor que 0");
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "\n" + "Numero da conta: " + numeroConta + "\n" + "Agencia: " + agencia + "\n"
                + "Saldo: " + saldo + "\n";
    }

}
