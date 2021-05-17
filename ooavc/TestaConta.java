package ooavc;

public class TestaConta {

	public static void main(String[] args) {
		//opera��o de delara��o
		//S� criou a referencia, o ponteiro
		Conta c1;
		
		//opera��o de instancia��o
		//agora eu criei concretamente a
		//estrutura de uma conta em memoria
		//c1 = new Conta();
		
		//fazendo declara��o e instancia��o
		//na mesma linha
		
		Conta c1 = new ContaPoupanca();
		c1.setNumero(001);
		System.out.println();
		//opera��o de inicializa��o dos atributos
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
			System.out.println("Voc� sacou R$"+valorSaque+ "e seu saldo atual e:"+c1.);
		} else {
			System.out.println("Saque n�o autorizado,valor acima do poss�vel");
		}
		
		
		System.out.println("Saldo atual:"+c1.limite);
		
	}

}
