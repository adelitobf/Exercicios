package br.ufpb.aps.custoProduto;

public class CustoFuncionamentoDecorator extends CalculadorCustoDecorator {

	private String tipo;
	private double precoFuncionamento;
	
	public CustoFuncionamentoDecorator(CalculadorCusto custo) {
		super(custo);
	}
	
	@Override
	public double getPreco() {
		return precoFuncionamento+custo.getPreco();
	}

	public void setPreco(double precoIngrediente){
		this.precoFuncionamento = precoIngrediente;
	}

	public String getTipo() {
		return tipo+", "+custo.getTipo();
	}

	public void setTipo(String tipo){
		this.tipo= tipo;
	}

}
