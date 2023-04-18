package br.com.victor.api.cep;

public record Endereco(String cep, String logradouro, String complemento, String bairro, String localidade,
				String uf) {

}
