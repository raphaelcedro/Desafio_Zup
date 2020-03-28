$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/adicionar_produto_sacola.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Abir site Magazine Luiza",
  "description": "Como usuario\nEu gostaria de acessar site Magazine Luiza\nPara que eu possa adicionar um produto na sacola",
  "id": "abir-site-magazine-luiza",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@AcessarMagazineLuiza"
    }
  ]
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Adicionar produto na sacola",
  "description": "",
  "id": "abir-site-magazine-luiza;adicionar-produto-na-sacola",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 11,
      "name": "@ValidandoEAdicionandoProdutoNaSacola"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "que o usuario tenha acesso a pagina inicial do site",
  "keyword": "Dado "
});
formatter.step({
  "line": 14,
  "name": "usuario inserir um \"\u003cproduto\u003e\" clicar na lista de exibicao do produto pesquisado",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "usuario valida o retorno da busca do seu produto pesquisado",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "usuario escolhe um \"\u003cproduto\u003e\" da lista",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "usuario seleciona a voltagem do produto",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "usuario informa o cep \"\u003c38415444\u003e\" para calcular o frete depois clica no botao ok",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "usuario adiciona o produto na sacola",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "usuario valida o produto adicionado na sacola",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "usuario valida o cep se esta correto",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "usuario confirma o produto",
  "keyword": "Entao "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "abir-site-magazine-luiza;adicionar-produto-na-sacola;",
  "rows": [
    {
      "cells": [
        "produto",
        "cep"
      ],
      "line": 25,
      "id": "abir-site-magazine-luiza;adicionar-produto-na-sacola;;1"
    },
    {
      "cells": [
        "geladeira",
        "38415444"
      ],
      "line": 26,
      "id": "abir-site-magazine-luiza;adicionar-produto-na-sacola;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 26,
  "name": "Adicionar produto na sacola",
  "description": "",
  "id": "abir-site-magazine-luiza;adicionar-produto-na-sacola;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@AcessarMagazineLuiza"
    },
    {
      "line": 11,
      "name": "@ValidandoEAdicionandoProdutoNaSacola"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "que o usuario tenha acesso a pagina inicial do site",
  "keyword": "Dado "
});
formatter.step({
  "line": 14,
  "name": "usuario inserir um \"geladeira\" clicar na lista de exibicao do produto pesquisado",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "usuario valida o retorno da busca do seu produto pesquisado",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "usuario escolhe um \"geladeira\" da lista",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "usuario seleciona a voltagem do produto",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "usuario informa o cep \"\u003c38415444\u003e\" para calcular o frete depois clica no botao ok",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "usuario adiciona o produto na sacola",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "usuario valida o produto adicionado na sacola",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "usuario valida o cep se esta correto",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "usuario confirma o produto",
  "keyword": "Entao "
});
formatter.match({
  "location": "AdicionarProdutoSacolaSteps.queOUsuarioTenhaAcessoAPaginaInicialDoSite()"
});
formatter.result({
  "duration": 13106375400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "geladeira",
      "offset": 20
    }
  ],
  "location": "AdicionarProdutoSacolaSteps.usuarioInserirUmClicarNaListaDeExibicaoDoProdutoPesquisado(String)"
});
formatter.result({
  "duration": 3254560400,
  "status": "passed"
});
formatter.match({
  "location": "AdicionarProdutoSacolaSteps.usuarioValidaORetornoDaBuscaDoSeuProdutoPesquisado()"
});
formatter.result({
  "duration": 2410855700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "geladeira",
      "offset": 20
    }
  ],
  "location": "AdicionarProdutoSacolaSteps.usuarioEscolheUmDaLista(String)"
});
formatter.result({
  "duration": 2432329500,
  "status": "passed"
});
formatter.match({
  "location": "AdicionarProdutoSacolaSteps.usuarioSelecionaAVoltagemDoProduto()"
});
formatter.result({
  "duration": 3872201700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003c38415444\u003e",
      "offset": 23
    }
  ],
  "location": "AdicionarProdutoSacolaSteps.usuarioInformaOCepParaCalcularOFreteDepoisClicaNoBotaoOk(String)"
});
formatter.result({
  "duration": 2218447099,
  "status": "passed"
});
formatter.match({
  "location": "AdicionarProdutoSacolaSteps.usuarioAdicionaOProdutoNaSacola()"
});
formatter.result({
  "duration": 1736682700,
  "status": "passed"
});
formatter.match({
  "location": "AdicionarProdutoSacolaSteps.usuarioValidaOProdutoAdicionadoNaSacola()"
});
formatter.result({
  "duration": 4340785700,
  "status": "passed"
});
formatter.match({
  "location": "AdicionarProdutoSacolaSteps.usuarioValidaOCepSeEstaCorreto()"
});
formatter.result({
  "duration": 615173100,
  "status": "passed"
});
formatter.match({
  "location": "AdicionarProdutoSacolaSteps.usuarioConfirmaOProduto()"
});
formatter.result({
  "duration": 1895451499,
  "status": "passed"
});
formatter.after({
  "duration": 1276274200,
  "status": "passed"
});
});