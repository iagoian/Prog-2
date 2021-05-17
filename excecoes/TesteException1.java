package excecoes;

public class TesteException1 {
	public static void main(String[] args) {
		System.out.println("In�cio do m�todo main");
		metodo1();
		System.out.println("Fim do m�todo main");
	}

	private static void metodo1() {
		System.out.println("Inicio do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}

	private static void metodo2() {
		System.out.println("Inicio do m�todo 2");
		
		int array[];
		array = new int[10];
		
		try {
			for(int i = 0; i < 20; i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch (Exception e) {
			System.out.println("Erro pego (catched): "+e);
		}
		
		System.out.println("Fim do m�todo 2");
		
	}
	
}