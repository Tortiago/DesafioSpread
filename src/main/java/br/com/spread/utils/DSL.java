package br.com.spread.utils;

import static br.com.spread.utils.GerenciadorDriver.getdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DSL {
	
	public void clica(By by) {
		getdriver().findElement(by).click();
	}

	public void escreve(By by, String texto) {
		getdriver().findElement(by).sendKeys(texto);
	}

	public int obtemQtdItens(By by) {
		List<WebElement> itens = getdriver().findElements(by);
		return itens.size();
	}

	public void mouseOver(By by) {
		Actions action = new Actions(getdriver());
		WebElement elemento = getdriver().findElement(by);
		action.moveToElement(elemento).build().perform();
	}
	
	public String obtemTextoElemento(By by) {
		return getdriver().findElement(by).getText();
	}
}
