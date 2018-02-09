package br.com.toolsqa.demoqa.trabalhandoElementos.steps.definition;

import java.util.UUID;

import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import br.com.toolsqa.demoqa.trabalhandoElementos.steps.business.StepBusiness;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinition {

	@Steps
	StepBusiness stepB;
	
	@Given("^estou na pagina inicial do site \"([^\"]*)\"$")
	public void estou_na_pagina_inicial_do_site(String url) throws Throwable {
	    stepB.openHome(url);
	}


	//INTERACTIVES
	@When("^clico no menu 'Draggable'$")
	public void clicar_menu_Draggable() throws Throwable {
	    stepB.clicarMenuDraggable();
	}
	
	@When("^na pagina 'Draggable' em 'Default functionality' arrastar e soltar a div \"([^\"]*)\" \"([^\"]*)\"$")
	public void em_Default_functionality_arrastar_e_soltar_a_div(int x, int y) throws Throwable {
		 stepB.arrastarESoltarXY(x, y);
	}

	@When("^na pagina 'Draggable' em 'Draggable And Sortable' arrastar e soltar classificando a li \"([^\"]*)\"$")
	public void em_Draggable_And_Sortable_arrastar_e_soltar_classificando_a_dov(int pos) throws Throwable {
	    stepB.arrastarSoltarClassificando(pos);
	}
	
	@When("^clico no menu 'Droppable'$")
	public void clico_no_menu_Droppable() throws Throwable {
	    stepB.clicarMenuDroopable();
	}

	@When("^na pagina 'Droppable' em 'Default functionality' arrastar e soltar a div sobre outra$")
	public void na_pagina_Droppable_em_Default_functionality_arrastar_e_soltar_a_div_sobre_outra() throws Throwable {
	    stepB.arrastarSoltarSobreOutroElemento();
	}
	
	@When("^na pagina 'Droppable' em 'Shopping cart demo' arrastar e soltar a li sobre a div$")
	public void na_pagina_Droppable_em_Shopping_cart_demo_arrastar_e_soltar_a_li_sobre_a_div() throws Throwable {
	    stepB.arrastarLiSoltarSobreDiv();
	}
	
	@When("^clico no menu 'Resizable'$")
	public void clico_no_menu_Resizable() throws Throwable {
	    stepB.clicarMenuResizable();
	}

	@When("^na pagina 'Resizable' em 'Default functionality' redimensionar div \"([^\"]*)\" \"([^\"]*)\"$")
	public void na_pagina_Resizable_em_Default_functionality_redimensionar_div(int x, int y) throws Throwable {
	    stepB.redimensionarElementoDiv(x, y);
	}

	@When("^clico no menu 'Selectable'$")
	public void clico_no_menu_Selectable() throws Throwable {
	    stepB.clicarMenuSelectable();
	}

	@When("^na pagina 'Selectable' em 'Display as grid' selecionar todos os numeros$")
	public void na_pagina_Selectable_em_Display_as_grid_selecionar_todos_os_numeros() throws Throwable {
	    stepB.selecionarTodosNumeros();
	}
	
	@When("^na pagina 'Selectable' em 'Serialize' selecionar itens especificos \"([^\"]*)\" #separar por virgulas#$")
	public void na_pagina_Selectable_em_Serialize_selecionar_itens_especificos_separar_por_virgulas(String numItens) throws Throwable {
	    stepB.selecionarNumerosEspecificos(numItens);
	}
	
	@When("^clico no menu 'Sortable'$")
	public void clico_no_menu_Sortable() throws Throwable {
	    stepB.clicarMenuSortable();
	}

	@Then("^na pagina 'Sortable' em 'Display as grid' inverter a ordem dos elementos$")
	public void na_pagina_Sortable_em_Display_as_grid_inverter_a_ordem_dos_elementos() throws Throwable {
	    stepB.inverterOrdemElementos();
	}

	//WIDGETS
	@When("^clico no menu 'Accordion'$")
	public void clico_no_menu_Accordion() throws Throwable {
	    stepB.clicarMenuAccordion();
	}

	@When("^na pagina 'Accordion' em 'Default functionality' clico em cada 'Section'$")
	public void na_pagina_Accordion_em_Default_functionality_clicar_em_cada_Section() throws Throwable {
	    stepB.clicarNasSections();
	}
	
	@When("^clico no menu 'Autocomplete'$")
	public void clico_no_menu_Autocomplete() throws Throwable {
	    stepB.clicarMenuAutocomplete();
	}

	@When("^na pagina 'Autocomplete' em 'Multiple Values' seleciono palavras da cx autocomplete \"([^\"]*)\" #SEPARAR POR VIRGULA, Ñ ADD ESPAÇO#$")
	public void na_pagina_Autocomplete_em_Multiple_Values_selecionar_palavras_da_cx_autocomplete_SEPARAR_POR_VIRGULA_Ñ_ADD_ESPAÇO(String palavra) throws Throwable {
	    stepB.preencherTxtTagEAutoCompletar(palavra);
	}
	
	
	@When("^clico no menu 'Data Picker'$")
	public void clico_no_menu_Data_Picker() throws Throwable {
	    stepB.clicarMenuDataPicker();
	}

	@When("^na pagina 'Data Picker' em 'Default functionality' seleciono a data correta \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void na_pagina_Data_Picker_em_Default_functionality_selecionar_a_data_correta(int dia, int mes, int ano) throws Throwable {
	    stepB.selecionarData(dia, mes, ano);
	}

	@When("^clico no menu 'Menu'$")
	public void clico_no_menu_Menu() throws Throwable {
	    stepB.clicarMenuMenu();
	}

	@When("^na pagina 'Menu' em 'Menu With Sub Menu' sobreponho o cursor aos menus e submenus$")
	public void na_pagina_Menu_em_Menu_With_Sub_Menu_sobreponho_o_cursor_aos_menus_e_submenus() throws Throwable {
	    stepB.sobreporMenuESubMenus();
	}
	
	@When("^clico no menu 'Slider'$")
	public void clico_no_menu_Slider() throws Throwable {
	    stepB.clicarMenuSlider();
	}

	@When("^na pagina 'Slider' em 'Range Slider' desloco o slider \"([^\"]*)\"$")
	public void na_pagina_Slider_em_Range_Slider_desloco_o_slider(int x) throws Throwable {
	    stepB.deslocarSlider(x);
	}
	
	
	//FRAMESandWINDOWS
	@When("^clico no menu 'Frames and Windows'$")
	public void clico_no_menu_Frames_and_Windows() throws Throwable {
	    stepB.clicarMenuFrameAndWindows();
	}

	@When("^na pagina 'Frames and Windows' em 'Open Seprate New Window' clico no link 'Open Seprate New Window'$")
	public void na_pagina_Frames_and_Windows_em_Open_Seprate_New_Window_clico_no_link_Open_Seprate_New_Window() throws Throwable {
	    stepB.clicarLinkNewWindow();
	}

	@When("^verifico se a nova janela foi aberta e seu conteudo carregado$")
	public void verifico_se_a_nova_janela_foi_aberta_e_seu_conteudo_carregado() throws Throwable {
	    stepB.verificarAberturaJanela();
	}
	
	@When("^na pagina 'Frames and Windows' em 'Frameset' clico no link 'Open Frameset Window'$")
	public void na_pagina_Frames_and_Windows_em_Frameset_clico_no_link_Open_Frameset_Window() throws Throwable {
	    stepB.clicarLinkNewFrame();
	}

	@When("^verifico se a pagina contem os frames$")
	public void verifico_se_a_pagina_contem_os_frames() throws Throwable {
	    stepB.verificarFrames();
	}
	
	//ALERTS E POPUPs
	@When("^clico no 'menu superior' \"([^\"]*)\"$")
	public void clico_no_menu_superior(String categoria) throws Throwable {
	    stepB.clicarMenuSuperior(categoria);
	}
	
	@When("^clico no botao 'Simple Alert'$")
	public void clico_no_botao_Simple_Alert() throws Throwable {
	    stepB.clicarBtnSimpleAlert();
	    
	}
	
	@When("^clico no botao do 'Alerta' Simples$")
	public void clico_no_botao_do_Alerta() throws Throwable {
	    stepB.manipularSimpleAlert();
	}
	
	@When("^clico no botao 'Confirm PopUp'$")
	public void clico_no_botao_Confirm_PopUp() throws Throwable {
	    stepB.clicarBtnConfirmPopUp();
	}

	@When("^clico no botao do 'Alerta' com opcoes \"([^\"]*)\"$")
	public void clico_no_botao_do_Alerta_com_opcoes(String opcao) throws Throwable {
	    stepB.manipularConfirmPopUp(opcao);
	}
	
	@When("^clico no botao 'Prompt PopUp'$")
	public void clico_no_botao_Prompt_PopUp() throws Throwable {
	    stepB.clicarBtnPromptPopUp();
	}

	@When("^preencho o 'campo do Alerta' \"([^\"]*)\"$")
	public void preencho_o_campo_do_Alerta(String conteudo) throws Throwable {
	    stepB.manipularPromptPopUp(conteudo);
	}



}
