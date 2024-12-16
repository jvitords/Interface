package model.services;

import java.time.Duration;

import model.entities.AluguelDoVeiculo;
import model.entities.Fatura;

public class ServicoDeAluguel {

	private Double precoPorHora;
	private Double precoPorDia;
	private TaxaDeServico taxaDeServico; // Está chamando a interface "TaxaDeServico" aqui nessa classe, e na classe "Program" nós podemos chamar uma classe filha dessa interfgace 
	
	public ServicoDeAluguel(Double precoPorHora, Double precoPorDia, TaxaDeServico taxaDeServico) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.taxaDeServico = taxaDeServico;
	}
	
	public void gerarFatura(AluguelDoVeiculo aluguelDoVeiculo) {
		
		double minutos = Duration.between(aluguelDoVeiculo.getDataDeEntrada(), aluguelDoVeiculo.getDataDeSaiada()).toMinutes();
		double horas = minutos / 60.0;
		
		double pagamentoBasico;
		if(horas <= 12.0) {
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		}
		else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24.0);
		}
		
		double taxa = taxaDeServico.taxaDeServico(pagamentoBasico);
		
		aluguelDoVeiculo.setFatura(new Fatura(pagamentoBasico, taxa));
	}

	public Double getPrecoPorHora() {
		return precoPorHora;
	}

	public void setPrecoPorHora(Double precoPorHora) {
		this.precoPorHora = precoPorHora;
	}

	public Double getPrecoPorDia() {
		return precoPorDia;
	}

	public void setPrecoPorDia(Double precoPorDia) {
		this.precoPorDia = precoPorDia;
	}

	public TaxaDeServico getTaxaDeServico() {
		return this.taxaDeServico;
	}

	public void setTaxaDeServico(TaxaDoBrasil taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}
	
	
}
