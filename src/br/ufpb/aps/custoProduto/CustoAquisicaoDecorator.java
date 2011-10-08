package br.ufpb.aps.custoProduto;

public class CustoAquisicaoDecorator extends CalculadorCustoDecorator {
	
	private String tipo;
	private double precoAquisicao;
	
	public CustoAquisicaoDecorator(CalculadorCusto custo){
		super(custo);
	}
	
	@Override
	public double getPreco() {
		return precoAquisicao+custo.getPreco();
	}

	public void setPreco(double precoAquisicao){
		this.precoAquisicao = precoAquisicao;
	}

	public String getTipo() {
		return tipo+", "+custo.getTipo();
	}

	public void setTipo(String tipo){
		this.tipo= tipo;
	}
	
}
