package br.ufpb.aps.custoProduto;


public class CalculadorCustoDecorator implements CalculadorCusto{

	protected CalculadorCusto custo;
	
	
	public CalculadorCustoDecorator (CalculadorCusto custo){
		this.custo = custo;
	}

	@Override
	public double getPreco() {
		return custo.getPreco();
	}

	@Override
	public String getTipo() {
		return custo.getTipo();
	}
	
}
