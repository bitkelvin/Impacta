package br.com.seniorsolution.classes;

public class CursoGraduacao extends Curso {
	private int numSemestres;
	
	public CursoGraduacao(int codigo, String descricao, int cargaHoraria, int numSemestres) throws IllegalAccessException {
		super(codigo, descricao, cargaHoraria);
		// TODO Auto-generated constructor stub
		this.setNumSemestres(numSemestres);
	}

	public int getNumSemestres() {
		return numSemestres;
	}

	public void setNumSemestres(int numSemestres) {
		this.numSemestres = numSemestres;
	}

	@Override
	public String exibir() {
		// TODO Auto-generated method stub
		String resultado = super.exibir() + 
				"\nNumero de Semestres: " + this.getNumSemestres();
		return resultado;
	}
	
	
		
}
