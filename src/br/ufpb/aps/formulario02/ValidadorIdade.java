package br.ufpb.aps.formulario02;

public class ValidadorIdade  implements Validador{

	private int min;
	private int max;

	public ValidadorIdade(){
		this.min = 0;
		this.max = 150;
	}

	@Override
	public boolean validar(String dado) throws ValorIncompativelException {

		try{
			int dadoValidar = Integer.parseInt(dado);

			if(dadoValidar < min){
				throw new ValorIncompativelException ("valor menor que "+min);

			}if(dadoValidar > max){
				throw new ValorIncompativelException ("valor maior que "+max);
			}
		}catch(NumberFormatException e){
			throw new ValorIncompativelException ("valor nao eh um inteiro");
		}
		return true;
	}
}

