package com.regras;

public class Conta implements ContaInterface {
	// Metodos
	private String numeroTitular;
	private String numeroConta;
	private String numeroAgencia;
	private double saldo;

	public Conta(String numeroConta,String numeroAgencia, double saldo) {
		// TODO Auto-generated constructor stub
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
	}

	@Override
	public String contultarDados() {
		// TODO Auto-generated method stub
		return "Nome do titular:" + this.numeroTitular + "\nAgência:" + this.numeroAgencia + "\nConta:" + this.numeroConta + ".\n";
	}

	public String getNumeroTitular() {
		return numeroTitular;
	}

	public void setNumeroTitular(String numeroTitular) {
		this.numeroTitular = numeroTitular;
	}

	@Override
	public double consultarSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	@Override
	public void depositarValor(double valor) {
		// TODO Auto-generated method stub
		this.saldo = this.saldo + valor;

	}

	@Override
	public double sacarValor(double valor) {
		// TODO Auto-generated method stub
		if(this.saldo>=saldo) {
			this.saldo -= valor; 
			return this.saldo;
		}
		else
			return this.saldo;

	}

}
