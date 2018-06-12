package br.com.k21;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.k21.dao.VendaRepository;
import br.com.k21.modelo.Venda;

public class TestCalculadoraRoyalties {
	
	@Test
	public void teste_mes_sem_vendas() {
		
		int mes = 1;
		int ano = 2017;
		double esperado = 0;
			
		CalculadoraRoyalties calculadora = new CalculadoraRoyalties();
		
		double retorno = calculadora.calcularRoyalties(mes,ano);
		
		assertEquals(esperado, retorno, 0);
	}	
}




