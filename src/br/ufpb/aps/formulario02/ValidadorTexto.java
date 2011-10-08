package br.ufpb.aps.formulario02;

public class ValidadorTexto implements Validador{

	private int max;

	public ValidadorTexto(){
		this.max = 30;
	}

	@Override
	public boolean validar(String valor) throws ValorIncompativelException{

		if (valor.length() > max){
			throw new ValorIncompativelException("O tamanho maximo do valor eh "+max);
		}
		for(int i=0; i < valor.length();i++){
			if(Character.isDigit(valor.charAt(i))){
				throw new ValorIncompativelException("O campo nao pode ter numero");
			}
		}
		return true;
	}
}