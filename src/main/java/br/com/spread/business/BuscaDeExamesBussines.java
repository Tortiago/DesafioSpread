package br.com.spread.business;

import org.junit.Assert;

import br.com.spread.page.BuscaDeExamesPage;
import br.com.spread.utils.DSL;

public class BuscaDeExamesBussines extends DSL{
	
	private BuscaDeExamesPage buscaExames;
	
	public BuscaDeExamesBussines() {
		buscaExames = new BuscaDeExamesPage();
	}
	
	public void digitaPesquisa(String texto) {
		escreve(buscaExames.getTxtPesquisaExame(), texto);
	}
	
	public void clicaBtnPesquisa() {
		clica(buscaExames.getBtnPesquisar());
	}
	
	public int qtdItensResultadoPesquisa(){
		return obtemQtdItens(buscaExames.getListaResultado());
	}
	
	public void validaResultadoDesquisaComSucesso() throws Exception {
		String conteudo = obtemTextoElemento(buscaExames.getListaResultado());
		if(conteudo.contains("CARDIOVASCULAR")) {
			System.out.println("Exame localizado com sucesso.");
		}else {
			throw new Exception("Exame não localizado.");
		}
			
	}
	
	public void validaResultadoDesquisaComFalha() {
		Assert.assertTrue(qtdItensResultadoPesquisa() == 0);
	}
}
