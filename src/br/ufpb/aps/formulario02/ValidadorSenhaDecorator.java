package br.ufpb.aps.formulario02;

public class ValidadorSenhaDecorator {

	public ValidadorSenhaDecorator(Validador componente){
		super(componente);
	}

	public void validar(String valor) throws ValorIncompativelException{
		super.validar(valor);

		char n = valor.charAt(0);

		for(int i = 1; i<valor.length();i++){
			if(valor.indexOf("@") < 0)
				throw new ValorIncompativelException("Senha invalido"+valor);
		}
	}

}
