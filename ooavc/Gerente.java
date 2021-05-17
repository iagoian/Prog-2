package ooavc;

public class Gerente extends Funcionario{
	
	int senha;
	
	public boolean verificar(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso não autorizado");
			return false;
		}
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	//v3 do bonus: percent 15% fixo sobre o salario
	//somente do gerente
	double getBonus() {
		return this.salario * 0.15;
	}
}
