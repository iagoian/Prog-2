package ooavc;

public class TestaConta {

	public static void main(String[] args) {
		//operação de delaração
		//Só criou a referencia, o ponteiro
		Conta c1;
		
		//operação de instanciação
		//agora eu criei concretamente a
		//estrutura de uma conta em memoria
		//c1 = new Conta();
		
		//fazendo declaração e instanciação
		//na mesma linha
		
		Conta c1 = new ContaPoupanca();
		c1.setNumero(001);
		System.out.println();
		//operação de inicialização dos atributos
		c1.numero = 001;
		c1.nome = "Matheus";
		c1.saldo = 1000.0;
		c1.limite = 100.0;
		
		System.out.println("Nro da conta:"+c1.numero);
		System.out.println("Titula:"+c1.nome);
		System.out.println("Saldo atual:"+c1.saldo);
		System.out.println("Limite:"+c1.limite);
		
		double valorSaque = 200;
		boolean resultado = c1.sacar(valorSaque);
		//if (c1.sacar(valorSaque)) fasttrack
		if(resultado) {
			System.out.println("Você sacou R$"+valorSaque+ "e seu saldo atual e:"+c1.);
		} else {
			System.out.println("Saque não autorizado,valor acima do possível");
		}
		
		
		System.out.println("Saldo atual:"+c1.limite);
		
	}

}
