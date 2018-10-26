package br.com.spread.page;

import org.openqa.selenium.By;

public class BuscaDeExamesPage {

	private By txtPesquisaExame = By.id("search-exams");
	private By btnPesquisar = By.id("button-buscar-exames");
	private By listaResultado = By.xpath(".//table[@id='table-resultado-exame']/tr");	
	
	public By getTxtPesquisaExame() {
		return txtPesquisaExame;
	}
	
	public By getBtnPesquisar() {
		return btnPesquisar;
	}

	public By getListaResultado() {
		return listaResultado;
	}
	
}
