package ooavc;

public class ControleBonus {

	private double totalBonus = 0;
	
	public void setTotalBonus(Funcionario funcionario) {
		totalBonus += funcionario.getBonus();
	}
	
	public double getTotalBonus() {
		return this.totalBonus;
	}

}