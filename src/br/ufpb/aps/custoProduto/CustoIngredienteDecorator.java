package br.ufpb.aps.custoProduto;

public class CustoIngredienteDecorator extends CalculadorCustoDecorator{

	private String tipo;
	private double precoIngrediente;
	
	public CustoIngredienteDecorator(CalculadorCusto custo) {
		super (custo);
		
	}
	
	@Override
	public double getPreco() {
		return custo.getPreco()+precoIngrediente;
	}

	public void setPreco(double precoIngrediente){
		this.precoIngrediente = precoIngrediente;
	}

	public String getTipo() {
		return custo.getTipo()+", "+tipo;
	}

	public void setTipo(String tipo){
		this.tipo= tipo;
	}

}
