package br.com.k21;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.dbunit.DBTestCase;
import org.junit.Test;

import br.com.k21.Vendedor;
import br.com.k21.dao.VendaDAO;
import br.com.k21.dao.VendedorDAO;
import br.com.k21.infra.BaseDBTest;

public class VendaDAOTest extends BaseDBTest {

	@Test
	public void testeVendedorSemVendas() {
		// Arrange
		int idVendedor = 3;
		int ano = 2016;		
		double valorTotalVendasEsperado = 0;
		double valorTotalRetornado;
		
		// act
		VendaDAO.setEntityManager(emf.createEntityManager());
		valorTotalRetornado = VendaDAO.buscarTotalDeVendasPorVendedorEAno(idVendedor, ano);
		
		// asserts
		assertEquals(valorTotalVendasEsperado, valorTotalRetornado);		
	}
	
	@Test
	public void testeVendedorCincoRetorna145() {
		int idVendedor = 5;
		int ano = 2016;		
		double valorTotalVendasEsperado = 145;
		double valorTotalRetornado;
		
		// act
		VendaDAO.setEntityManager(emf.createEntityManager());
		valorTotalRetornado = VendaDAO.buscarTotalDeVendasPorVendedorEAno(idVendedor, ano);
		
		// asserts
		assertEquals(valorTotalVendasEsperado, valorTotalRetornado);		
	}
}
