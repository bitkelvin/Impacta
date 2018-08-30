package br.com.seniorsolution.classes;

import java.util.Comparator;

public class OrdenacaoLogradouro implements Comparator<Endereco>{

	@Override
	public int compare(Endereco arg0, Endereco arg1) {
		// TODO Auto-generated method stub
		if(arg0.getLogradouro().compareTo(arg1.getLogradouro()) == 0){
			Integer n1 = arg0.getNumero();
			Integer n2 = arg1.getNumero();
			
			return n1.compareTo(n2);
		}
		
		return arg0.getLogradouro().compareTo(arg1.getLogradouro());
	}
	
}
