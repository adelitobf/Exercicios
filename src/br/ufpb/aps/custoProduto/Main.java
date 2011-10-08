package br.ufpb.aps.custoProduto;

public class Main {
	public static void main(String[] args){

		Produto file = new Produto();
		file.setPreco(1.0);
		file.setTipo("Picanha");


		CustoAquisicaoDecorator custoBase = new CustoAquisicaoDecorator (file);
		custoBase.setTipo("algum_Imposto");
		custoBase.setPreco(1);

		CustoFuncionamentoDecorator funcionamento = new CustoFuncionamentoDecorator(custoBase); 
		funcionamento.setTipo("Estoque");
		funcionamento.setPreco(1);

		CustoIngredienteDecorator sal = new CustoIngredienteDecorator(funcionamento);
		sal.setTipo("Sal");
		sal.setPreco(1);

		CustoIngredienteDecorator oleo = new CustoIngredienteDecorator(sal);
		oleo.setTipo("Oleo");
		oleo.setPreco(1);

		CustoIngredienteDecorator cebola = new CustoIngredienteDecorator(oleo);
		cebola.setTipo("Cebola");
		cebola.setPreco(1);

		CustoIngredienteDecorator tomate = new CustoIngredienteDecorator(cebola);
		tomate.setTipo("Tomate");
		tomate.setPreco(1);

		
		imprimir(tomate);
	}

	private static void imprimir(CalculadorCusto  calculador){
		System.out.println("O montante do Produto -  "+calculador.getTipo()+" tem o valdor de: "+calculador.getPreco());
	}
}