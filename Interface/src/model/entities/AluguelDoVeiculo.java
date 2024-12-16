package model.entities;

import java.time.LocalDateTime;

public class AluguelDoVeiculo { // CarRental

	private LocalDateTime dataDeEntrada;
	private LocalDateTime dataDeSaida;
	private Veiculo veiculo;
	private Fatura fatura; 
	
	public AluguelDoVeiculo(){
	}

	public AluguelDoVeiculo(LocalDateTime dataDeEntrada, LocalDateTime dataDeSaida, Veiculo veiculo) {
		this.dataDeEntrada = dataDeEntrada;
		this.dataDeSaida = dataDeSaida;
		this.veiculo = veiculo;
	}


	public LocalDateTime getDataDeEntrada() {
		return dataDeEntrada;
	}

	public void setDataDeEntrada(LocalDateTime dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public void setDataDeSaiada(LocalDateTime dataDeSaida) {
		this.dataDeSaida = dataDeSaida;
	}

	public LocalDateTime getDataDeSaiada() {
		return dataDeSaida;
	}
	
	
}
