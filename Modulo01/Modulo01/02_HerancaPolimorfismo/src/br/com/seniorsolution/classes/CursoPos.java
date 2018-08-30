package br.com.seniorsolution.classes;

public class CursoPos extends Curso {
	private int numModulos;
	
	public CursoPos(int codigo, String descricao, int cargaHoraria, int numModulos) throws IllegalAccessException {
		super(codigo, descricao, cargaHoraria);
		// TODO Auto-generated constructor stub
		this.setNumModulos(numModulos);
	}

	public int getNumModulos() {
		return numModulos;
	}

	public void setNumModulos(int numModulos) {
		this.numModulos = numModulos;
	}

	@Override
	public String exibir() {
		// TODO Auto-generated method stub
		String resultado = super.exibir() +
				"\nNumero de módulos: " + this.getNumModulos();
		
		
		return resultado;
	}
}
