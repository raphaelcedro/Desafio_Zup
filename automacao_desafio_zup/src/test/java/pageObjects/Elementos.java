package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elementos {

private static WebElement element = null;
	
	public static WebElement campoPesquisa(WebDriver driver) {
		element = driver.findElement(By.id("inpHeaderSearch"));
		return element;
	}
	
	public static WebElement campoFiltroPesquisa(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/header/div/div[1]/div/div/div[2]/div[2]/div[2]/ul[1]/li[1]"));
		return element;
	}
	
	public static WebElement validandoTituloBusca(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"main-title\"]/strong"));
		return element;
	}
	
	public static WebElement clicaProdutoDaLista(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"product_013075001\"]/div[3]/h2"));
		return element;
	}
	

	public static WebElement campoSelecioneVoltagem(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"variation-label\"]"));
		return element;
	}
	
	public static WebElement filtroSelecioneVoltagem(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"variation-label\"]/option[3]"));
		return element;
	}
	
	public static WebElement validandoVoltagemSelecionada(WebDriver driver) {
		element = driver.findElement(By.xpath("//option [text()=' 220V  ']"));
		return element;
	}
	
	public static WebElement campoCep(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/div[5]/div[1]/div[4]/div[2]/div[9]/div[1]/div/input"));
		return element;
	}
	
	public static WebElement botaoOK(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/div[5]/div[1]/div[4]/div[2]/div[9]/div[1]/div/button"));
		return element;
	}
	
	public static WebElement botaoAdicionarASacola(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/div[5]/div[1]/div[4]/div[2]/button[2]"));
		return element;
	}
	
	public static WebElement botaoContinuar(WebDriver driver) {
		element = driver.findElement(By.linkText("continuar"));
		return element;
	}
	
	public static WebElement validaProduroNaSacola(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/a/p[1]"));
		return element;
	}
	
	public static WebElement validaCep(WebDriver driver) {
		element = driver.findElement(By.xpath("//span [text()='38415-444']"));
		return element;
	}
	
	public static WebElement botaoContinuarTelaSacola(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".BasketContinue-button"));
		return element;
	}
}
