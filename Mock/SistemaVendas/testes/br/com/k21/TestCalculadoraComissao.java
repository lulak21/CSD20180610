package br.com.k21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadoraComissao {
	@Test
	public void testCalcularComissao5000() {
		double valorVenda = 5000;
		
		double valorEsperado = 250;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(valorEsperado, resultado, 0);
	}
	@Test
	public void testCalcularComissao10000() {
		double valorVenda = 10000;
		
		double valorEsperado = 500;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(valorEsperado, resultado, 0);
	}
	@Test
	public void testCalcularComissao10000c1(){
		double valorVenda = 10000.01;
		
		double valorEsperado = 600.00;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void testCalcularComissao55reais59centavos(){
		double valorVenda = 55.59;
		
		double valorEsperado = 2.77;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(valorEsperado, resultado, 0);
	}
	
	
	@Test
	public void testCalcularComissao15000Mil(){
		double valorVenda = 15000;
		
		double valorEsperado = 900;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(valorEsperado, resultado, 0);
	}	
}
