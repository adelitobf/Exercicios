package br.ufpb.aps.custoProduto;

public class Produto implements CalculadorCusto {

	private String nome;

	public Produto(String nome) {
		this.nome=nome;
	}


	public double getPreco(){
		return 15.0f;
	}

	@Override
	public String getTipo() {
		return this.nome;
	}
}
