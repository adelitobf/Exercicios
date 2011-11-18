package br.ufpb.aps.Iterador;

public class Cliente {

	ListaEncadeada listaEncadeadaConcreta;

	public Cliente(ListaEncadeada listaEncadeadaConcreta){
		this.listaEncadeadaConcreta = listaEncadeadaConcreta;
	}

	public void printItem(){

		Iterador listaEncadeadaIterador = listaEncadeadaConcreta.getIterador();

		System.out.println("Items\n----\n");
		printItem(listaEncadeadaIterador);

	}

	private void printItem(Iterador iterador){
		while (iterador.temProximo()){
			Item item = (Item) iterador.proximo();
			System.out.println(item.getObject());
		}
	}
}
