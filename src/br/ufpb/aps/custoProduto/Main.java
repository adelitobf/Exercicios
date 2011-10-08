package br.ufpb.aps.custoProduto;

public class Main {
	public static void main(String[] args){

		Produto file = new Produto("File");

		CustoAquisicaoDecorator custoBase = new CustoAquisicaoDecorator (file);
		custoBase.setTipo("CustoBaseDoFile");
		custoBase.setPreco(3.5);

		CustoFuncionamentoDecorator func = new CustoFuncionamentoDecorator(custoBase); 
		func.setTipo("Estoque");
		func.setPreco(3.0);

		CustoIngredienteDecorator sal = new CustoIngredienteDecorator(func);
		sal.setTipo("Sal");
		sal.setPreco(0.30);

		CustoIngredienteDecorator oleo = new CustoIngredienteDecorator(sal);
		oleo.setTipo("Oleo");
		oleo.setPreco(5.0);

		CustoIngredienteDecorator cebola = new CustoIngredienteDecorator(oleo);
		cebola.setTipo("Cebola");
		cebola.setPreco(0.75);
		
		CustoIngredienteDecorator tomate = new CustoIngredienteDecorator(cebola);
		tomate.setTipo("Tomate");
		tomate.setPreco(10.2);
		
		imprimirValor(tomate);
	}

	private static void imprimirValor(CalculadorCusto  calc){
		System.out.println("Prato: "+calc.getTipo()+" \nValor: "+calc.getPreco());
	}
}