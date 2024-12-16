package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.AluguelDoVeiculo;
import model.entities.Veiculo;
import model.services.ServicoDeAluguel;
import model.services.TaxaDoBrasil;

public class Program {

	public static void main(String[] args) {

		Scanner digitar = new Scanner(System.in);
		DateTimeFormatter formatoDaData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("===== Cadastro do veiculo =====");
		String modeloDoVeiculo = "Celta";
		//System.out.print("Modelo: " + modeloDoVeiculo);
		
		String digitarDataDeEntrada = "25/08/2024 10:30";
		String digitarDataDeSaida = "27/08/2024 11:40";
		//System.out.print("Data de entrada: " + digitarDataDeEntrada);
		//System.out.print("Data de saida: " + digitarDataDeSaida);
		
		LocalDateTime entrada = LocalDateTime.parse(digitarDataDeEntrada, formatoDaData);
		LocalDateTime saida = LocalDateTime.parse(digitarDataDeSaida, formatoDaData);

		
		AluguelDoVeiculo aluguel = new AluguelDoVeiculo(entrada, saida, new Veiculo(modeloDoVeiculo)); 
	
		double precoPorHora = 10.0;
		double precoPorDia = 130.0;

		ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoPorHora, precoPorDia, new TaxaDoBrasil());
		
		servicoDeAluguel.gerarFatura(aluguel);
		
		System.out.println("Pagamento básico: R$" + aluguel.getFatura().getPagamentoBasicoDouble());
		System.out.println("Taxa: R$" + aluguel.getFatura().getTaxa());
		System.out.println("Pagamento total: R$" + aluguel.getFatura().pagamentoTotal());
		System.out.println(servicoDeAluguel.getTaxaDeServico());
		
	}

}
