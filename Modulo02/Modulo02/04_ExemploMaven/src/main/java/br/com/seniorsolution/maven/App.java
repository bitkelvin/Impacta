package br.com.seniorsolution.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Calculo c = new Calculo();
		int a = 10, b = 20;
        System.out.println( "Soma: " + c.calcularSoma(a,b) );
    }
}
