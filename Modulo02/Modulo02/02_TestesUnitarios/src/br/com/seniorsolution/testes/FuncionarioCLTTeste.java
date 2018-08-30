package br.com.seniorsolution.testes;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Test;

import br.com.seniorsolution.classesnovas.FuncionarioCLT;
import br.com.seniorsolution.enumeracoes.Sexo;

public class FuncionarioCLTTeste {

	@Test
	public void verificarSoma(){
		int valor1 = 5;
		int valor2 = 3;
		int soma = valor1 + valor2;
		Assert.assertEquals(8, soma);		
	}
	
	@Test
	public void test() {
		try {
			FuncionarioCLT funcionario = 
				new FuncionarioCLT(
					"Jair", 
					45, 
					Sexo.MASCULINO, 
					"11122233345", 
					"Gerente", 11850.35);
			
			
			DecimalFormat fmt = new DecimalFormat("0.00");
			//NumberFormat fmt = NumberFormat.getInstance();
			fmt.setMaximumFractionDigits(2);
			fmt.setRoundingMode(RoundingMode.UP);
			
			double valorCalculado = Double.parseDouble(
					fmt.format(funcionario.getImpostoRenda())
						.replace(",","."));
					
			
			Assert.assertEquals(2389.49, valorCalculado, 0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
