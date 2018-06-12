package br.com.k21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadoraComissao {
	@Test
	public void teste_calcular_venda_5000_retorna_250() {
		double valorVenda = 5000;
		
		double valorEsperado = 250;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(valorEsperado, resultado, 0);
	}
	@Test
	public void teste_calcular_venda_10000_retorna_500() {
		double valorVenda = 10000;
		
		double valorEsperado = 500;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(valorEsperado, resultado, 0);
	}
	@Test
	public void teste_calcular_venda_10000_e_1_centavos_retorna_600(){
		double valorVenda = 10000.01;
		
		double valorEsperado = 600.00;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void teste_calcular_comissao_55_e_59centavos_retorna_2_e_77(){
		double valorVenda = 55.59;
		
		double valorEsperado = 2.77;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(valorEsperado, resultado, 0);
	}
	
	
	@Test
	public void teste_calcular_venda_10001_retorna_660_e_06(){
		double valorVenda = 10001;
		
		double valorEsperado = 660.06;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(valorEsperado, resultado, 0);
	}	
}
