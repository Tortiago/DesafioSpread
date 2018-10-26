package br.com.spread.definition;

import static br.com.spread.utils.GerenciadorDriver.abreNavegador;
import static br.com.spread.utils.GerenciadorDriver.fechaNavegador;

import br.com.spread.business.BuscaDeExamesBussines;
import br.com.spread.business.HomeBusiness;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class BuscaDeExameDefinition {

	private HomeBusiness homeB;
	private BuscaDeExamesBussines buscaExamesB;
	
	public BuscaDeExameDefinition() {
		homeB = new HomeBusiness();
		buscaExamesB = new BuscaDeExamesBussines();
	}

	@Dado("^que eu esteja acessando o portal de medicina diagnotica 'Sergio Franco'$")
	public void que_eu_esteja_acessando_o_portal_de_medicina_diagnotica_Sergio_Franco() throws Throwable {
		abreNavegador();
	}

	@Dado("^clique na opcao do menu 'exames'$")
	public void clique_na_opcao_do_menu_exames() throws Throwable {
		homeB.mouseOverMenuExames();
	}

	@Dado("^clique no submenu 'Busca de exames'$")
	public void clique_no_submenu_Busca_de_exames() throws Throwable {
		homeB.clicaSubMenuExames();
	}

	@Dado("^clico na lupa para pesquisar$")
	public void clico_na_lupa_para_pesquisar() throws Throwable {
		buscaExamesB.clicaBtnPesquisa();
	}

	@Dado("^digito um \"([^\"]*)\" valido$")
	public void digito_um_valido(String arg1) throws Throwable {
		buscaExamesB.digitaPesquisa(arg1);
	}

	@Entao("^valido a lista de exames apresentados$")
	public void valido_a_lista_de_exames_apresentados() throws Throwable {
		buscaExamesB.validaResultadoDesquisaComSucesso();
	}

	@Dado("^digito um \"([^\"]*)\" invalido$")
	public void digito_um_invalido(String arg1) throws Throwable {
		buscaExamesB.digitaPesquisa(arg1);
	}

	@Entao("^valido se o resultado da pesquisa esta vazia$")
	public void valido_se_o_resultado_da_pesquisa_esta_vazia() throws Throwable {
		buscaExamesB.validaResultadoDesquisaComFalha();
	}

	@After
	public void encerraTest() {
		fechaNavegador();
	}
	
}
