package ooavc;

public class TestaConta3 {
	public static void main(String[] args) {
		Conta c1; // declara��o
		c1 = new Conta(); //Instancia��o
		c1.limite = 100; //Inicializa��o
		
		Conta c2;
		c2 = c1; // "=" operador de atribui��o
		c2.limite = 200;// sobre-escrevendo a area de memoria
		
		System.out.println(c1.limite);
	}
}
