package entities;

public class PJuridica extends Pessoa{

	private int qtdFuncionario;
	
	public PJuridica() {
		super();
	}
	
	public PJuridica(String nome, double rendaAnual, int qtdFuncionario) {
		super(nome, rendaAnual);
		this.qtdFuncionario = qtdFuncionario;
	}
	
	public int getQtdFuncionario() {
		return qtdFuncionario;
	}
	public void setQtdFuncionario(int qtdFuncionario) {
		this.qtdFuncionario = qtdFuncionario;
	}
	
	
	
	@Override
	public double imposto() {
		
		double imposto = 0.0;
		
		if(qtdFuncionario > 10) {
			imposto = getRendaAnual() * 0.14;			
		}else {
			imposto = getRendaAnual() * 0.16;
		}		
		return imposto;
	}

}
