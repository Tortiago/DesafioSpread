package br.com.spread.business;

import br.com.spread.page.HomePage;
import br.com.spread.utils.DSL;

public class HomeBusiness extends DSL {

	private HomePage homePage;

	public HomeBusiness() {
		homePage = new HomePage();
	}

	public void mouseOverMenuExames() {
		mouseOver(homePage.getItemMenuExames());
	}

	public void clicaSubMenuExames() {
		clica(homePage.getItemSubMenuBuscarExames());
	}

	public void acessaPaginaBuscaExames() {
		mouseOver(homePage.getItemMenuExames());
	}
}