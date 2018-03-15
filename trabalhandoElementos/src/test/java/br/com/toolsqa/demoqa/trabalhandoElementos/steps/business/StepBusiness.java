package br.com.toolsqa.demoqa.trabalhandoElementos.steps.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WebBrowserScreenElement;
import br.com.toolsqa.demoqa.trabalhandoElementos.pages.PageObjectClass;
import jxl.common.Logger;
import net.serenity_bdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusiness {

	PageObjectClass page;
	private static Logger LOG = Logger.getLogger(StepBusiness.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONT�M M�TODOS PR�PRIOS DO FRAMEWORK

	@Step
	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}


	//INTERACTIVES
	public void clicarMenuDraggable() {
		viewElement.click(page.getMenuDraggable());
		page.waitForAllTextToAppear("Draggable");
	}

	public void arrastarESoltarXY(int x, int y) {
		Actions acao = new Actions(viewElement.getDriver());
		
		acao.clickAndHold(page.getDivArrastavel()).moveByOffset(x, y).build().perform();
		
	    
		/*
		WebElement drag = page.getDivArrastavel();
		WebElement drop = viewElement.findElement(By.id("content"));
		
		acao.dragAndDrop(drag, drop).build().perform();
		*/
		
	}
	
	
	public void arrastarSoltarClassificando(int pos) throws InterruptedException {
		
		viewElement.findElement(By.partialLinkText("Draggable + Sortable")).click();
		
		Actions acao = new Actions(viewElement.getDriver());
		acao.clickAndHold(page.getLiDraggable()).moveByOffset(100, pos*21).release().build().perform();
		
		
		
	}
	
	public void clicarMenuDroopable() {
		viewElement.click(page.getMenuDroppable());
	}
	
	public void arrastarSoltarSobreOutroElemento() {
		Actions acao = new Actions(viewElement.getDriver());
		acao.dragAndDrop(page.getDivDraggable2(), page.getDivDroppable()).build().perform();
		
		//espera();
	}
	
	public void arrastarLiSoltarSobreDiv() {
		
		viewElement.findElement(By.partialLinkText("Shopping cart demo")).click();

		List<WebElement> liProductsTshirts = page.getLiProducts();
		
		for(int i = 0; i < liProductsTshirts.size(); i++)
		{
			Actions acao = new Actions(viewElement.getDriver());
			acao.dragAndDrop(liProductsTshirts.get(i), page.getDivDroppable2()).build().perform();
		}
		
	}
	
	public void clicarMenuResizable() {
		viewElement.click(page.getMenuResizable());
	}
	
	public void redimensionarElementoDiv(int x, int y) {
		
		Actions acao = new Actions(viewElement.getDriver());
		System.out.println("\n\n\n\n\n"+page.getDivResizableArea().getText()+"\n\n\n\n\n");

		acao.clickAndHold(page.getDivResizableArea()).moveByOffset(x, y).build().perform();

	}
	
	public void clicarMenuSelectable() {
		viewElement.click(page.getMenuSelectable());
	}
	
	
	public void selecionarTodosNumeros() {
		viewElement.findElement(By.partialLinkText("Display as grid")).click();//clicar na guia

		Actions acao = new Actions(viewElement.getDriver());

		int tamanho = page.getLiNumeros().size() - 1;
		
		WebElement drag = page.getLiNumeros().get(0);
		WebElement drop = page.getLiNumeros().get(tamanho);
		
		acao.dragAndDrop(drag, drop).release().build().perform();
		
	}
	
	
	public void selecionarNumerosEspecificos(String numItens) {
		viewElement.findElement(By.partialLinkText("Serialize")).click();//clicar na guia

		String itens[];
		itens = numItens.split(",");
		
		Actions acao = new Actions(viewElement.getDriver());
		
		List<WebElement> listaItens = page.getLiItens();
		
		for(int i = 0; i< itens.length; i++)
		{
			int indexEscolhido = Integer.parseInt(itens[i]) - 1;
			
			acao.keyDown(Keys.CONTROL).click(listaItens.get(indexEscolhido)).keyUp(Keys.CONTROL).build().perform();
		}
	}
	
	public void clicarMenuSortable() {
		viewElement.click(page.getMenuSortable());
	}
	
	public void inverterOrdemElementos() {
		viewElement.findElement(By.partialLinkText("Display as grid")).click();//clicar na guia

		Actions acao = new Actions(viewElement.getDriver());

		int x = 10;
		List<WebElement> listaNums = page.getLiNumSortable();
		
		//acao.clickAndHold(page.getLiNumSortable().get(0)).moveByOffset(110, 0).release().build().perform(); funfa
		for(int i = 0; i < listaNums.size(); i++)
		{
			int aux = 11 - i;
			acao.clickAndHold(page.getLiNumSortable().get(0)).moveToElement(page.getLiNumSortable().get(aux)).moveByOffset(x, 0).release().build().perform();

		}
		

	}
	
	
	//WIDGETS
	
	public void clicarMenuAccordion() {
		viewElement.click(page.getMenuAccordion());
	}
	
	public void clicarNasSections() {

		List<WebElement> secao = page.getH3Sections();
		
		for(int i = 0; i < secao.size(); i++)
		{
			viewElement.click(secao.get(i));
		}
		
	}
	
	
	public void clicarMenuAutocomplete() {
		viewElement.click(page.getMenuAutocomplete());
	}
	
	
	public void preencherTxtTagEAutoCompletar(String palavras) throws InterruptedException {
		viewElement.findElement(By.partialLinkText("Multiple Values")).click();//clicar na guia

		String palavrasPesq[] = palavras.split(",");
	
		for(int i = 0; i < palavrasPesq.length; i++)
		{
			viewElement.sendText(page.getTxtTags(), palavrasPesq[i]);

			page.waitFor(2).seconds();//implicitamente espere ate q carregue ou não a lista de sugestoes da pesquisa
			
		    List<WebElement> listaSugestoes = page.getListaSugestoesPesq();
			listaSugestoes.get(0).click();//clica na 1 sugestao de determinada pesquisa(no caso a palavra pesquisada: 'palavrasPesq[i]' )
		}	
	}
	
	public void clicarMenuDataPicker() {
		viewElement.click(page.getMenuDatePicker());	
	} 
	
	
	public void selecionarData(int dia, int mes, int ano) throws InterruptedException{

		viewElement.click(page.getTxtDate());
		int anoPopup = Integer.parseInt(page.getLblAno().getText());

		//converte mes em numero
		String meses[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int mesPopup = converteMesTextoEmMesNumerico(meses, page.getLblMes().getText());
		
		//DEFINE ANO
		if(ano > anoPopup)
		{
			int difAno = (ano - anoPopup) - 1;//diferenca entre os anos, desconta 1 ano ja q ele pod não ser 1 'ano' de fato(ou seja, não conter os 12 meses)
			
			int limite = 12 * difAno;//qtd de vezes q os meses serao pulados
			limite = limite + (12-mesPopup);//para o ultimo pular a qtd d vezes subtraindo os meses(convertidos em nums) q encontravam-se no calendario
			limite = limite + mes;//limite incrementa o mes de entrada 
			
			for(int i = 1; i <= limite; i++ )
			{
				viewElement.click(page.getSpanNext());
				page.waitFor(500).milliseconds();
			}
		}
		else
			if(ano < anoPopup)
			{
				int difAno = (anoPopup - ano) - 1;//diferenca entre os anos
		
				int limite = 12 * difAno;//qtd de vezes q os meses serao pulados
				limite = limite + (12-mes);//para o ultimo pular a qtd d vezes subtraindo os meses(convertidos em nums) q foram fornecidos na entrada
				limite = limite + (mesPopup);
				
				for(int i = 1; i <= limite; i++ )
				{	
					viewElement.click(page.getSpanPrevious());
					page.waitFor(500).milliseconds();
				}
			}
		else //DEFINE MES(PARA O MSM ANO QUE SE ENCONTRA CALENDARIO E ENTRADA: ano == anoPopup)
		{
			if(mes > mesPopup)
			{
				for(int i = 1; i <= (mes-mesPopup); i++ )
				{
					viewElement.click(page.getSpanNext());
					page.waitFor(500).milliseconds();
				}
			}
			else
				if(mes < mesPopup)
				{	
					for(int i = 1; i <= (mesPopup-mes); i++ )
					{
						viewElement.click(page.getSpanPrevious());
						page.waitFor(500).milliseconds(); //////////aaa
					}
				}		
		}
		
		//DEFINE DIA
		page.waitFor(500).milliseconds();//espere carregar os td's dos dias
		
		List<WebElement> listaDias = page.getListaDias();
		for(int i = 0; i < listaDias.size(); i++)
		{
			if(listaDias.get(i).getText().equals(""+dia))
			{
				listaDias.get(i).click();
				break;
			}
		}
	}

	public int converteMesTextoEmMesNumerico(String meses[], String mes) {
		
		for(int i = 0; i < meses.length; i++)
		{
			if(mes.equals(meses[i])) {
				return i + 1;
			}
		}
		return 0;
	}
	
	public void selecionarData_SOLUCAO2(int dia, int mes, int ano) throws InterruptedException{

		viewElement.click(page.getTxtDate());
		int anoPopup = Integer.parseInt(page.getLblAno().getText());

		//converte mes em numero
		String meses[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		boolean dtEntradaMaior = false;
		if(ano >= anoPopup) 
			dtEntradaMaior = true;
		
		if(dtEntradaMaior == false && mes >= converteMesTextoEmMesNumerico(meses, page.getLblMes().getText()))
			dtEntradaMaior = true;
		
		LOG.info("\ndtEntradaMaior: " + dtEntradaMaior);
		
		//DEFINE MES E ANO
		while(ano != Integer.parseInt(page.getLblAno().getText()) || mes != converteMesTextoEmMesNumerico(meses, page.getLblMes().getText())) {
		
			if(dtEntradaMaior) 
				viewElement.click(page.getSpanNext());
			else
				viewElement.click(page.getSpanPrevious());	
		}
								
		//DEFINE DIA
		for(WebElement l : page.getListaDias()) {
			if(l.getText().equals(""+dia)){
				l.click();
				break;
			}
		}
	}

	public void clicarMenuMenu() {
		viewElement.click(page.getMenuMenu());
	}
	
	public void sobreporMenuESubMenus() {
		viewElement.findElement(By.partialLinkText("Menu With Sub Menu")).click();//clicar na guia
		
		viewElement.mouseOver(page.getMenuNews());
		
		for(int i = 0; i < page.getSubMenuNews().size(); i++)
		{
			viewElement.mouseOver(page.getSubMenuNews().get(i));
			page.waitFor(300).milliseconds();
		}
		

	}
	
	public void clicarMenuSlider() {
		viewElement.click(page.getMenuSlider());
	}

	public void deslocarSlider(int x) {
		Actions acao = new Actions(viewElement.getDriver());
		
		acao.clickAndHold(page.getSpanSlider()).moveByOffset(x*60,0).release().build().perform();
		
		
	}
	
	
	//FRAMESandWINDOWS
	public void clicarMenuFrameAndWindows() {
		viewElement.click(page.getMenuFramesAndWindows());
	}
	
	public void clicarLinkNewWindow() {
		viewElement.findElement(By.partialLinkText("Open Seprate New Window")).click();//clicar na guia
		viewElement.click(page.getLinkNewWindow());
		//page.waitFor(3).seconds();
	}
	
	public void verificarAberturaJanela() {
		
		String winHandleBefore = viewElement.getDriver().getWindowHandle(); //armazena a handle atual, sera reutilizada caso queira retornar a pag anterior
//		System.out.println("\n\n\nWin handles: " + winHandleBefore + "\n\n\n");
//		System.out.println("\n\n\nWin URL....: " + viewElement.getDriver().getCurrentUrl() + "\n\n\n");
//		System.out.println("\n\n\nWin Title..: " + viewElement.getDriver().getTitle() + "\n\n\n");

		for(String winHandle : viewElement.getDriver().getWindowHandles()){
			viewElement.getDriver().switchTo().window(winHandle);//coleta a ultima janela aberta e altera para ela 
		}
		
//		System.out.println("\n\n\nWin handles: " + viewElement.getDriver().getWindowHandle() + "\n\n\n");
//		System.out.println("\n\n\nWin URL....: " + viewElement.getDriver().getCurrentUrl() + "\n\n\n");
//		System.out.println("\n\n\nWin Title..: " + viewElement.getDriver().getTitle() + "\n\n\n");
		
		page.waitForAllTextToAppear("Oops! That page can’t be found.");
		Assert.assertTrue(page.containsAllText("Oops! That page can’t be found."));
		page.waitFor(2).seconds();
		
//		viewElement.getDriver().quit();//fecha janela atual
        viewElement.getDriver().switchTo().window(winHandleBefore); 

	}
	
	
	public void clicarLinkNewFrame() {
		viewElement.findElement(By.partialLinkText("Frameset")).click();//clicar na guia
		viewElement.click(page.getLinkNewFrame());
		
		
	}
	
	public void verificarFrames() {
		String winHandleBefore = viewElement.getDriver().getWindowHandle(); //armazena a handle atual, sera reutilizada caso queira retornar a pag anterior

		for(String winHandle : viewElement.getDriver().getWindowHandles()){
			viewElement.getDriver().switchTo().window(winHandle);//coleta a ultima janela aberta e altera para ela 
		}
		

		viewElement.getDriver().switchTo().frame("topFrame");
		Assert.assertTrue(viewElement.findElement(By.xpath("/html/body/h2")).getText().equals("www.toolsqa.com"));
		
	
        viewElement.getDriver().switchTo().window(winHandleBefore); 

		
	}
	
	
	//ALERTS E POPUPs
	public void clicarMenuSuperior(String categoria) {
		viewElement.waitForElementIsPresent(10, page.getMenuSuperior());
		viewElement.click(page.getMenuSuperior().findElement(By.partialLinkText(categoria)));
		
	}
	
	public void clicarBtnSimpleAlert() {
		viewElement.click(page.getBtnSimpleAlert());
	    page.waitFor(2).seconds();//aguarda o alerta
	}
	
	public void manipularSimpleAlert() {
		
		Alert simpleAlert = viewElement.getDriver().switchTo().alert();
		LOG.info("\n\nTEXTO DO ALERTA SIMPLES: " + simpleAlert.getText());
	    page.waitFor(2).seconds();//apenas p/ visualizar
		simpleAlert.accept();
	}
	
	public void clicarBtnConfirmPopUp() {
		((JavascriptExecutor) viewElement.getDriver()).executeScript("arguments[0].click()", page.getBtnConfirmPopUp());//roda o script referente ao elemento passado
	    page.waitFor(2).seconds();//aguarda o alerta

	}
	
	public void manipularConfirmPopUp(String opcao) {
		
		Alert confirmPopUp = viewElement.getDriver().switchTo().alert();
		LOG.info("\n\nTEXTO DO ALERTA C/ OPÇÕES: " + confirmPopUp.getText());
	    page.waitFor(2).seconds();//apenas p/ visualizar
		
		if(opcao.equals("OK")) {
			confirmPopUp.accept();
			LOG.info("\nCLICOU EM OK!");
		}
		else {
			confirmPopUp.dismiss();
			LOG.info("\nCLICOU EM CANCELAR!");
		}
	}
	
	public void clicarBtnPromptPopUp() {
		((JavascriptExecutor) viewElement.getDriver()).executeScript("arguments[0].click()", page.getBtnPromptPopUp());//roda o script referente ao elemento passado
		page.waitFor(2).seconds();//aguarda o alerta

	}

	public void manipularPromptPopUp(String conteudo) throws InterruptedException {

		Alert promptPopUp = viewElement.getDriver().switchTo().alert();
		LOG.info("\n\nTEXTO DO ALERTA C/ ENTRADA DE DADOS: " + promptPopUp.getText());
		promptPopUp.sendKeys(conteudo);
	    page.waitFor(3).seconds();//apenas p/ visualizar

	}

}
