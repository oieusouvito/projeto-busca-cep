package br.com.victor.api.cep;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class BuscadorDeCep {
	
	public Endereco buscaEndereco(String cep) {
		
		URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
		         .uri(endereco)
		         .build();
		   try {
			   HttpResponse<String> response = HttpClient
					   .newHttpClient()
					   .send(request, HttpResponse.BodyHandlers.ofString());
			   return new Gson().fromJson(response.body(), Endereco.class);
		   } catch(Exception e){
			   throw new RuntimeException("Não foi possível obter o endereço a partir desse cep");
		   }

		   

	}
	
}
