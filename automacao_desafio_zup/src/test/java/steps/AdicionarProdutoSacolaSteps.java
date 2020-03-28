package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import pageObjects.Elementos;

import org.junit.Assert;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.After;
import cucumber.api.Scenario;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdicionarProdutoSacolaSteps {

	private WebDriver driver;
	private WebDriverWait wait;

	@Dado("^que o usuario tenha acesso a pagina inicial do site$")
	public void queOUsuarioTenhaAcessoAPaginaInicialDoSite() throws Throwable {

		JSONParser parser = new JSONParser();
		Object object = parser.parse(new FileReader("asserts/ambiente.json"));
		JSONObject jsonObject = (JSONObject) object;

		String chromeDriver = (String) jsonObject.get("chromeDriver");
		String paginaHomeMagazineLuiza = (String) jsonObject.get("paginaHomeMagazineLuiza");

		System.setProperty("webdriver.chrome.driver", chromeDriver);
		driver = new ChromeDriver();
		driver.get(paginaHomeMagazineLuiza);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 4);

	}

	@Quando("^usuario inserir um \"([^\"]*)\" clicar na lista de exibicao do produto pesquisado$")
	public void usuarioInserirUmClicarNaListaDeExibicaoDoProdutoPesquisado(String produto) throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(By.id("inpHeaderSearch")));
		Elementos.campoPesquisa(driver).click();
		Elementos.campoPesquisa(driver).sendKeys(produto);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/header/div/div[1]/div/div/div[2]/div[2]/div[2]/ul[1]/li[1]")));
		Elementos.campoFiltroPesquisa(driver).click();
        
		Thread.sleep(500);
	}

	@E("^usuario valida o retorno da busca do seu produto pesquisado$")
	public void usuarioValidaORetornoDaBuscaDoSeuProdutoPesquisado() throws Throwable {

		JSONParser parser = new JSONParser();
		Object object = parser.parse(new FileReader("asserts/mensagens.json"));
		JSONObject jsonObject = (JSONObject) object;

		String validaTituloDaBuscaJson = (String) jsonObject.get("validaTituloDaBusca");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-title\"]/strong")));
		String validaTituloDaBusca = Elementos.validandoTituloBusca(driver).getText();

		Assert.assertEquals(validaTituloDaBuscaJson, validaTituloDaBusca);
		
		Thread.sleep(2000);

	}

	@E("^usuario escolhe um \"([^\"]*)\" da lista$")
	public void usuarioEscolheUmDaLista(String produto) throws Throwable {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product_013075001\"]/div[3]/h2")));
		Elementos.clicaProdutoDaLista(driver).click();

	}

	@E("^usuario seleciona a voltagem do produto$")
	public void usuarioSelecionaAVoltagemDoProduto() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"variation-label\"]")));
		Elementos.campoSelecioneVoltagem(driver).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"variation-label\"]/option[3]")));
		Elementos.filtroSelecioneVoltagem(driver).click();

		JSONParser parser = new JSONParser();
		Object object = parser.parse(new FileReader("asserts/mensagens.json"));
		JSONObject jsonObject = (JSONObject) object;

		String voltagemJson = (String) jsonObject.get("voltagem");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"variation-label\"]")));
		String validaVoltagem = Elementos.validandoVoltagemSelecionada(driver).getText();

		Assert.assertEquals(voltagemJson, validaVoltagem);

	}

	@E("^usuario informa o cep \"([^\"]*)\" para calcular o frete depois clica no botao ok$")
	public void usuarioInformaOCepParaCalcularOFreteDepoisClicaNoBotaoOk(String cep) throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[5]/div[1]/div[4]/div[2]/div[9]/div[1]/div/input")));
		Elementos.campoCep(driver).click();
		Elementos.campoCep(driver).sendKeys(cep);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[5]/div[1]/div[4]/div[2]/div[9]/div[1]/div/button")));
		Elementos.botaoOK(driver).click();
		
		Thread.sleep(1200);

	}

	@E("^usuario adiciona o produto na sacola$")
	public void usuarioAdicionaOProdutoNaSacola() throws Throwable {
	   
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[5]/div[1]/div[4]/div[2]/button[2]")));
		Elementos.botaoAdicionarASacola(driver).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/div[4]/a")));
		Elementos.botaoContinuar(driver).click();
		
		
	}
	
	@E("^usuario valida o produto adicionado na sacola$")
	public void usuarioValidaOProdutoAdicionadoNaSacola() throws Throwable {

	   
		JSONParser parser = new JSONParser();
		Object object = parser.parse(new FileReader("asserts/mensagens.json"));
		JSONObject jsonObject = (JSONObject) object;

		String produtoSacolaJson = (String) jsonObject.get("produtoSacola");
        
		Thread.sleep(3500);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[1]")));
		String validaProdutoSacola = Elementos.validaProduroNaSacola(driver).getText();

		Assert.assertEquals(produtoSacolaJson, validaProdutoSacola);
		
	}

	@E("^usuario valida o cep se esta correto$")
	public void usuarioValidaOCepSeEstaCorreto() throws Throwable {
        
		JSONParser parser = new JSONParser();
		Object object = parser.parse(new FileReader("asserts/mensagens.json"));
		JSONObject jsonObject = (JSONObject) object;

		String validaCepJson = (String) jsonObject.get("validaCep");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[3]/div/div[1]/div/span[2]/span")));
		String validaCep = Elementos.validaCep(driver).getText();

		Assert.assertEquals(validaCepJson, validaCep);
		
		
	}

	@Entao("^usuario confirma o produto$")
	public void usuarioConfirmaOProduto() throws Throwable {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[4]/div[2]/div[1]/button")));

		Elementos.botaoContinuarTelaSacola(driver).click();
		
		Thread.sleep(1200);
		

	}

	@After("@ValidandoEAdicionandoProdutoNaSacola")
	public void screenshotValidandoEAdicionandoProdutoNaSacola(Scenario cenario) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,
					new File("target/screenshots/adicionar_produto_sacola/" + cenario.getId() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.quit();
		System.out.println("Fim");
	}

}
