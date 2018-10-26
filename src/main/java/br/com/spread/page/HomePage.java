package br.com.spread.page;

import org.openqa.selenium.By;

public class HomePage {

	private By itemMenuExames = By.xpath(".//div[@class='col-xs-12 list-group']//ul[@class='list-group-pacientes']//li[2]//a[@id='dropdownMenuExames']");	
	private By itemSubMenuBuscarExames = By.id("menu-desktop-exames");
	
	public By getItemMenuExames() {
		return itemMenuExames;
	}
	public By getItemSubMenuBuscarExames() {
		return itemSubMenuBuscarExames;
	}
	
}
