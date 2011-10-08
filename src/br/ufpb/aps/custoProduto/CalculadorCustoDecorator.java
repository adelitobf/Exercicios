package br.ufpb.aps.custoProduto;

public abstract class CalculadorCustoDecorator implements CalculadorCusto{

	protected CalculadorCusto custo;
	
	
	public CalculadorCustoDecorator (CalculadorCusto custo){
		this.custo = custo;
	}

	@Override
	public double getPreco() {
		return this.custo.getPreco();
	}

	@Override
	public String getTipo() {
		return this.custo.getTipo();
	}
	
}
