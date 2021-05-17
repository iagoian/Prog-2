package ooavc;

public class TestaContaCliente {
	public static void main(String[] args) {
		Conta2 c1 = new Conta2(001,null,100,100);
		//c1.cliente = new Cliente();
		c1.numero = 001;
		c1.cliente.nome = "Mateus";
		System.out.println(c1.numero);
		System.out.println(c1.cliente.nome);
		
	}
}