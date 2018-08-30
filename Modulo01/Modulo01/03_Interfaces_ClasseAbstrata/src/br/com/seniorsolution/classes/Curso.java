package br.com.seniorsolution.classes;

public abstract class Curso {
	private int codigo;
	private String descricao;
	private int cargaHoraria;
	
	public Curso(int codigo, String descricao, int cargaHoraria) throws IllegalAccessException{
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		
		try {
			this.setCargaHoraria(cargaHoraria);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.initCause(new NumberFormatException("A carga horária deve ser um numero positivo"));
			throw e;
		}
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) throws IllegalAccessException {
		if(cargaHoraria <= 0){
			throw new IllegalAccessException("Carga horária inválida");
		}
		
		this.cargaHoraria = cargaHoraria;
	}
	
	public String exibir(){
		String resultado = "Código: " + this.getCodigo() +
							"\nDescrição: " + this.getDescricao() + 
							"\nCarga Horária: " + this.getCargaHoraria();
		
		return resultado;
	}
}
