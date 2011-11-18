package br.ufpb.aps.Iterador;

import java.util.LinkedList;


public class ListaEncadeadaConcreto implements ListaEncadeada {

	LinkedList items;

	public ListaEncadeadaConcreto(){
		items = new LinkedList();
		add("Item 1");
		add("Item 2");
		add("Item 3");
	}

	public void add(Object o) {
		Item item = new Item(o);
		items.add(item);
	}

	public Iterador getIterador(){
		return new IteradorConcreto(items);
	}
}
