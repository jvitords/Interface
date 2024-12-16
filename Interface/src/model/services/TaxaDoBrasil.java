package model.services;

public class TaxaDoBrasil implements TaxaDeServico{

	public Double taxaDeServico(Double valor) { // está implementando a interface da "TaxaDeServico"
		if(valor > 100) {
			return valor * 0.15;
		}
		else {
			return valor * 0.20;
		}
	}
}
