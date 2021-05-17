package ooavc;

public class TestaConta3 {
	public static void main(String[] args) {
		Conta c1; // declaração
		c1 = new Conta(); //Instanciação
		c1.limite = 100; //Inicialização
		
		Conta c2;
		c2 = c1; // "=" operador de atribuição
		c2.limite = 200;// sobre-escrevendo a area de memoria
		
		System.out.println(c1.limite);
	}
}
