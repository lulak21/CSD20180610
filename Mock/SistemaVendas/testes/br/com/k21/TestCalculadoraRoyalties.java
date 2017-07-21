package br.com.k21;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.k21.dao.VendaRepository;
import br.com.k21.modelo.Venda;

public class TestCalculadoraRoyalties {
	
	private VendaRepository vendaRepository;

	@Before
	public void inicializaMocks(){
		vendaRepository = Mockito.mock(VendaRepository.class);

	}
	
	
	@Test
	public void teste_mes_sem_vendas() {
		
		int mes = 1;
		int ano = 2017;
		double esperado = 0;
		
		
		Mockito.when(vendaRepository.obterVendasPorMesEAno(ano, mes)).thenReturn(new ArrayList<Venda>());
		CalculadoraRoyalties calculadora = new CalculadoraRoyalties(vendaRepository);
		
		double retorno = calculadora.calcularRoyalties(mes,ano);
		
		assertEquals(esperado, retorno, 0);
	}
	

	@Test
	public void teste_mes_com_uma_venda() {
		
		int mes = 2;
		int ano = 2017;
		double esperado = 1900;
				
		ArrayList<Venda> listaVendas = new ArrayList<Venda>();
		listaVendas.add(new Venda(1, 1, mes, ano, 10000));
		
		Mockito.when(vendaRepository.obterVendasPorMesEAno(ano, mes)).thenReturn(listaVendas);
		CalculadoraRoyalties calculadora = new CalculadoraRoyalties(vendaRepository);
		
		double retorno = calculadora.calcularRoyalties(mes,ano);
		
		assertEquals(esperado, retorno, 0);
	}
	
	@Test
	public void teste_mes_com_duas_vendas() {
		
		int mes = 3;
		int ano = 2017;
		double esperado = 5660;
		

		
		ArrayList<Venda> listaVendas = new ArrayList<Venda>();
		listaVendas.add(new Venda(1, 1, mes, ano, 10000));
		listaVendas.add(new Venda(2, 2, mes, ano, 20000));
		
		Mockito.when(vendaRepository.obterVendasPorMesEAno(ano, mes)).thenReturn(listaVendas);
		CalculadoraRoyalties calculadora = new CalculadoraRoyalties(vendaRepository);
		
		double retorno = calculadora.calcularRoyalties(mes,ano);
		
		assertEquals(esperado, retorno, 0);
	}

	@Test(expected= RuntimeException.class)
	public void teste_mes_invalido() {
		
		int mes = 99;
		int ano = 2017;
		
		CalculadoraRoyalties calculadora = new CalculadoraRoyalties(vendaRepository);
		
		double retorno = calculadora.calcularRoyalties(mes,ano);
		
	}

	
}




