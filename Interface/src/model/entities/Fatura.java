package model.entities;

public class Fatura { // invoice
	
	private Double pagamentoBasico;
	private Double taxa;
	private AluguelDoVeiculo aluguel; 
	
	public Fatura() {
	}

	public Fatura(Double pagamentoBasicoDouble, Double taxa) {
		this.pagamentoBasico = pagamentoBasicoDouble;
		this.taxa = taxa;
	}

	public Double getPagamentoBasicoDouble() {
		return pagamentoBasico;
	}

	public void setPagamentoBasicoDouble(Double pagamentoBasicoDouble) {
		this.pagamentoBasico = pagamentoBasicoDouble;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public AluguelDoVeiculo getAluguel() {
		return aluguel;
	}

	public void setAluguel(AluguelDoVeiculo aluguel) {
		this.aluguel = aluguel;
	}
	
	public Double pagamentoTotal() {
		
		return this.pagamentoBasico + this.taxa;
	}

}
