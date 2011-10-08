package br.ufpb.aps.custoProduto;

public class Produto implements CalculadorCusto {

	private String nome;
	private double preco;

	public double getPreco(){
		return this.preco;
	}

	@Override
	public String getTipo() {
		return this.nome;
	}
	
	public void setTipo(String nome){
		this.nome = nome;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}
	
}
