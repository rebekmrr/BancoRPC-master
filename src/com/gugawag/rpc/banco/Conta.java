package com.gugawag.rpc.banco;

public class Conta {
    private String numero;
    private double saldo;
    
    public Conta(String numero, Double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	

    public double getSaldo() {
        return saldo;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean contains(String numero2) {
        return false;
    }

}
