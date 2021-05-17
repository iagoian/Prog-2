package ooavc;

//classe//
public class Conta {
	//atributos//
	int numero;
	String nome;
	double saldo;
	double limite;
	
	//metodos//---//parâmetro ou arumentos//
	void realizarSaque(double valor) {
		double saldoAlterado = saldo-valor; //formato fordhamis//
		saldo = saldoAlterado;
	}
	
	public int getNumero() {
		return numero;
	}
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}

	public void setNumero(int i) {
		// TODO Auto-generated method stub
		
	}

	public boolean sacar1(double valorSaque) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setNumero1(int i) {
		// TODO Auto-generated method stub
		
	}

	public boolean sacar(double valorSaque) {
		// TODO Auto-generated method stub
		return false;
	}
}
