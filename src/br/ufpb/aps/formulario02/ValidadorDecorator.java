package br.ufpb.aps.formulario02;

public class ValidadorDecorator implements Validador{
	
	private Validador componente;
	
	public ValidadorDecorator (Validador componente){
		this.componente = componente;
	}
	
	
	public boolean validar(String valor) throws ValorIncompativelException{
		return this.componente.validar(valor);
	}
}
