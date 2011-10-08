package br.ufpb.aps.custoProduto;

public class CustoFuncionamentoDecorator extends CalculadorCustoDecorator {

	private String tipo;
	private double precoFuncionamento;
	
	public CustoFuncionamentoDecorator(CalculadorCusto custo) {
		super(custo);
	}
	
	@Override
	public double getPreco() {
		return custo.getPreco()+precoFuncionamento;
	}

	public void setPreco(double precoIngrediente){
		this.precoFuncionamento = precoIngrediente;
	}

	public String getTipo() {
		return custo.getTipo()+", "+tipo;
	}

	public void setTipo(String tipo){
		this.tipo= tipo;
	}

}
