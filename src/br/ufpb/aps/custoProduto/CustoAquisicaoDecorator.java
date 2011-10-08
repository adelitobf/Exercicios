package br.ufpb.aps.custoProduto;

public class CustoAquisicaoDecorator extends CalculadorCustoDecorator {
	
	private String tipo;
	private double precoAquisicao;
	
	public CustoAquisicaoDecorator(CalculadorCusto custo){
		super(custo);
	}
	
	@Override
	public double getPreco() {
		return custo.getPreco()+precoAquisicao;
	}

	public void setPreco(double precoAquisicao){
		this.precoAquisicao = precoAquisicao;
	}

	public String getTipo() {
		return custo.getTipo()+", "+tipo;
	}

	public void setTipo(String tipo){
		this.tipo= tipo;
	}
	
}
