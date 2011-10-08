package br.ufpb.aps.formulario02;

public class ValidadorEmail implements Validador {

	private String arroba;

	public ValidadorEmail(){
		this.arroba = "@";
	}

	@Override
	public boolean validar(String dadoValidar) throws ValorIncompativelException {
		//Verifica se existe o caracter "@" na String passada

		if(!dadoValidar.contains(arroba)){
			throw new ValorIncompativelException("Email invalido");
		}if(dadoValidar.startsWith(arroba)){
			throw new ValorIncompativelException("Email invalido");
		}if (dadoValidar.endsWith(arroba)){
			throw new ValorIncompativelException("Email invalido");
		}
		return true;
	}
}
