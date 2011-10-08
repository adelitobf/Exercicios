package br.ufpb.aps.formulario02;

public interface Validador {

	public boolean  validar(String valor) throws ValorIncompativelException;
	
}