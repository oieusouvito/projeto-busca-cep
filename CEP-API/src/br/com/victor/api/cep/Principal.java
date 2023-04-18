package br.com.victor.api.cep;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			BuscadorDeCep consultaCep = new BuscadorDeCep();
			
			System.out.println("Digite o cep que gostaria de buscar: ");
			String cep = input.next();
			
			try {
				Endereco endereco = consultaCep.buscaEndereco(cep);
				System.out.println("Seguem informações do cep solicitado:");
				System.out.println(endereco);
				GeradorDeArquivo gerador = new GeradorDeArquivo();
				gerador.geraJson(endereco);
			} catch(RuntimeException | IOException e) {
				System.out.println(e.getMessage());
				System.out.println("Finalizada a aplicação.");
			}
		}
		
	}
}
