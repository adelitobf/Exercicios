package br.ufpb.aps.Iterador;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class IteradorConcreto implements Iterador {

	private LinkedList objects;

	public IteradorConcreto(LinkedList list){
		objects = new LinkedList();
		objects.addAll(list);
	}

	public boolean temProximo(){
		boolean temProximo = false;
		try{
			objects.getFirst();
			temProximo = true;
		}catch(NoSuchElementException e){
			temProximo = false;
		}
		return temProximo;
	}


	public Object proximo(){
		Object proximo = null;
		try{
			proximo = objects.removeFirst();
		}catch(NoSuchElementException e){
			proximo = null;
		}
		return proximo;
	}

}
