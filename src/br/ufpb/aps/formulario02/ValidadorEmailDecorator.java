package br.ufpb.aps.formulario02;

public class ValidadorEmailDecorator extends ValidadorDecorator{

	public ValidadorEmailDecorator(Validador componente){
		super(componente);
	}

	public boolean validar(String valor) throws ValorIncompativelException{
		super.validar(valor);

		if(valor.indexOf("@") < 0)
			throw new ValorIncompativelException("Email invalido");
		return true;
	}

}