package br.com.k21;

import java.util.List;

import br.com.k21.dao.VendaRepository;
import br.com.k21.modelo.Venda;

public class CalculadoraRoyalties {

	private VendaRepository vendaRepository;
	
	public CalculadoraRoyalties(VendaRepository vendaRepository) {
		super();
		this.vendaRepository = vendaRepository;
	}


	public double calcularRoyalties(int mes, int ano) {
		if(mes > 12){
			throw new RuntimeException("Mes invalido");
		}
		
		List<Venda> listaVendas = vendaRepository.obterVendasPorMesEAno(ano, mes);
	
		double totalVendas = 0;
		for (Venda venda : listaVendas) {
			totalVendas =  totalVendas + (venda.getValor() - CalculadoraComissao.calcular(venda.getValor()));
		}
		
		
				
		return (totalVendas * 0.2);
	}
	
	 

}
