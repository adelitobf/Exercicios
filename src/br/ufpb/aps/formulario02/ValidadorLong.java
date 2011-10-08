package br.ufpb.aps.formulario02;

public class ValidadorLong {

	private int min;
	private int max;
	
	public ValidadorLong(int min, int max){
		this.min = min;
		this.max = max;
	}

	public void validar(String valor) throws ValorIncompativelException{
		try{
			long aux = Long.parseLong(valor);
			if (aux < min)
					throw new ValorIncompativelException("Valor eh menor que "+min);
			if(aux > max)
					throw new ValorIncompativelException("Valor eh menor que "+max);
		}catch(NumberFormatException e){
			throw new ValorIncompativelException("Valor nao eh um inteiro");
		}
	}



}
