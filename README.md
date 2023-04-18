# Buscador de CEP
Este é um projeto em Java que realiza a busca de informações de endereço a partir de um CEP informado pelo usuário. O programa utiliza a API pública ViaCEP para obter as informações de endereço a partir do CEP e também gera um arquivo JSON com essas informações.

## Como usar
O projeto é composto por três classes: Principal, BuscadorDeCep e GeradorDeArquivo.

Para executar a aplicação, basta rodar a classe Principal. O programa irá solicitar ao usuário que digite o CEP que deseja buscar. Em seguida, ele irá chamar o método buscaEndereco da classe BuscadorDeCep para obter as informações de endereço a partir do CEP. Caso as informações sejam encontradas com sucesso, o programa irá exibir na tela as informações de endereço e também irá gerar um arquivo JSON com essas informações, utilizando o método geraJson da classe GeradorDeArquivo.

## Classes
### Principal
* A classe Principal é a classe principal do projeto e é responsável por executar a aplicação. Ela solicita ao usuário que digite o CEP que deseja buscar e chama o método buscaEndereco da classe BuscadorDeCep para obter as informações de endereço a partir do CEP. Caso ocorra algum erro durante a execução da aplicação, a exceção é tratada e uma mensagem de erro é exibida na tela.

### BuscadorDeCep
* A classe BuscadorDeCep é responsável por realizar a busca de informações de endereço a partir de um CEP informado pelo usuário. Ela utiliza a API pública ViaCEP para obter as informações de endereço a partir do CEP e retorna um objeto do tipo Endereco contendo essas informações.

### GeradorDeArquivo
* A classe GeradorDeArquivo é responsável por gerar um arquivo JSON com as informações de endereço obtidas a partir do CEP. O arquivo é nomeado de acordo com o CEP informado pelo usuário e é gerado no diretório onde a aplicação está sendo executada.

* Endereco
* A classe Endereco é uma classe modelo que representa as informações de endereço obtidas a partir do CEP. Ela utiliza o recurso record do Java para definir seus atributos e métodos de forma simplificada.
