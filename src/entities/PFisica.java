package entities;

public class PFisica extends Pessoa {

	private double gastosSaude;

	public PFisica() {
		super();
	}

	public PFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		
		double imposto = 0.0;
		if(getRendaAnual() < 20000) {
			imposto = getRendaAnual() * 0.15;
		}else {
			imposto = (getRendaAnual() * 0.25) - (gastosSaude * 0.50);	
		}
		return imposto;
	}

}
