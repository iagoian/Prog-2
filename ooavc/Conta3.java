package ooavc;

public class Conta3 {
	static int contadorContas = 0;
	int numero;
	//String nome;
	Cliente cliente;
	double saldo;
	double limite;
	
	public Conta3(int numero, String nome, double saldo, double limite) {
		this.numero = numero;
		this.cliente = new Cliente();
		this.cliente.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
		contadorContas++;
	}
	
	public int getContadorContas() {
		return Conta3.contadorContas;
	}
	
	boolean sacar(double valor) {
		//double saldoAlterado = saldo - valor;
		//saldo = saldoAlterado;
		if(valor > this.saldo + this.limite) {
			return false;
		}else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}
}