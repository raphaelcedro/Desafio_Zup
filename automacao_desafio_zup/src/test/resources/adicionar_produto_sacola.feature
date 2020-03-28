# language: pt

@AcessarMagazineLuiza
Funcionalidade: Abir site Magazine Luiza
	Como usuario
	Eu gostaria de acessar site Magazine Luiza
	Para que eu possa adicionar um produto na sacola
	
	
	
@ValidandoEAdicionandoProdutoNaSacola
	Esquema do Cenario: Adicionar produto na sacola
	  Dado que o usuario tenha acesso a pagina inicial do site
		Quando usuario inserir um "<produto>" clicar na lista de exibicao do produto pesquisado
		E usuario valida o retorno da busca do seu produto pesquisado
		E usuario escolhe um "<produto>" da lista
		E usuario seleciona a voltagem do produto
		E usuario informa o cep "<38415444>" para calcular o frete depois clica no botao ok
		E usuario adiciona o produto na sacola
		E usuario valida o produto adicionado na sacola
		E usuario valida o cep se esta correto
		Entao usuario confirma o produto
	
		Exemplos:
		|	  produto  |	 cep	  |
		|	 geladeira | 38415444 |