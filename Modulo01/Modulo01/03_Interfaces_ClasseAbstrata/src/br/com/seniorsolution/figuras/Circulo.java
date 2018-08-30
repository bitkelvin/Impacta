package br.com.seniorsolution.figuras;

public class Circulo extends Figura {
	
	private double raio;

	public Circulo(double raio) {
		this.setRaio(raio);
	}



	public double getRaio() {
		return raio;
	}



	public void setRaio(double raio) {
		this.raio = raio;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.getRaio(), 2);
	}

}
