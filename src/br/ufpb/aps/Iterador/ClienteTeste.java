package br.ufpb.aps.Iterador;

public class ClienteTeste {
	public static void main(String[] args){

		ListaEncadeada listaEncadeadaConcreta = new ListaEncadeadaConcreto();

		Cliente cliente = new Cliente(listaEncadeadaConcreta);
		cliente.printItem();
	}
}