package br.com.toolsqa.demoqa.trabalhandoElementos.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClass extends PageObject{

	//INTERACTIONS
	@FindBy(id = "menu-item-140")
	private WebElement menuDraggable;
	
	@FindBy(id = "draggable")
	private WebElement divDraggable;
	
	@FindBy(id = "draggablebox")
	private WebElement liDraggable;
	
	@FindBy(id = "menu-item-141")
	private WebElement menuDroppable;
	
	@FindBy(id = "draggableview")
	private WebElement divDraggable2;
	
	@FindBy(id = "droppableview")
	private WebElement divDroppable;
	
	@FindBy(xpath = "//div[@id='ui-id-7']/ul/li")
	private List<WebElement> liProducts;
	
	@FindBy(xpath="//div[@id='cart']/div")
	private WebElement divDroppable2;
	
	@FindBy(id = "menu-item-143")
	private WebElement menuResizable;
	
	@FindBy(xpath = "//*[@id='resizable']/div[3]")
	private WebElement divResizableArea;
	
	@FindBy(id = "menu-item-142")
	private WebElement menuSelectable;
	
	@FindBy(xpath = "//*[@id='selectable_grid']/li")
	private List<WebElement> liNumeros;
	
	@FindBy(xpath = "//*[@id='selectable-serialize']/li")
	private List<WebElement> liItens;
	
	@FindBy(id = "menu-item-151")
	private WebElement menuSortable;
	
	@FindBy(xpath = "//*[@id='sortable_grid']/li")
	private List<WebElement> liNumSortable;
	
	
	//WIDGETS
	@FindBy(id = "menu-item-144")
	private WebElement menuAccordion;

	@FindBy(xpath = "//*[@id='accordion']/h3")
	private List<WebElement> h3Sections;
	
	@FindBy(id = "menu-item-145")
	private WebElement menuAutocomplete;
	
	@FindBy(id = "tagsss")
	private WebElement txtTags;
	
	@FindBy(xpath = "//*[@id='ui-id-2']/li")
	private List<WebElement> listaSugestoesPesq;
	
	@FindBy(id = "menu-item-146")
	private WebElement menuDatePicker;
	
	//CALENDARIO POPUP
	@FindBy(id = "datepicker1")
	private WebElement txtDate;
	
	@FindBy(xpath = "//span[@class='ui-datepicker-month']")
	private WebElement lblMes;
	
	@FindBy(xpath = "//span[@class='ui-datepicker-year']")
	private WebElement lblAno;
	
	@FindBy(xpath = "//a[starts-with(@class,'ui-state-default')]")
	private List<WebElement> listaDias;
	
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	private WebElement spanNext;
	
	@FindBy(xpath = "//span[contains(text(),'Previous')]")
	private WebElement spanPrevious;
	///
	
	@FindBy(id = "menu-item-147")
	private WebElement menuMenu;
	
	@FindBy(linkText = "News")
	private WebElement menuNews;
	
	@FindBy(xpath = "(//a[text()='News'])[2]/following::a[starts-with(text(),'Sub Menu Item')]")
	private List<WebElement> subMenuNews;
	
	@FindBy(id = "menu-item-97")
	private WebElement menuSlider;
	
	
	@FindBy(xpath = "//*[@id='slider-range-max']/span")
	private WebElement spanSlider;
	
	//FRAMES
	@FindBy(id = "menu-item-148")
	private WebElement menuFramesAndWindows;
			
	@FindBy(xpath = "//*[@id='tabs-2']/div/p/a")
	private WebElement linkNewWindow;
	
	@FindBy(linkText = "Open Frameset Window")
	private WebElement linkNewFrame;
	
	//ALERTS E POPUPs
	@FindBy(id = "primary-menu")
	private WebElement menuSuperior;
	
	@FindBy(xpath = "//*[@id='content']/p[4]/button")
	private WebElement btnSimpleAlert;
	
	@FindBy(xpath = "//*[@id='content']/p[8]/button")
	private WebElement btnConfirmPopUp;
	
	@FindBy(xpath = "//*[@id='content']/p[11]/button")
	private WebElement btnPromptPopUp;

	
	public WebElement getMenuDraggable() {
		return menuDraggable;
	}
	
	public WebElement getDivArrastavel() {
		return divDraggable;
	}

	public WebElement getLiDraggable() {
		return liDraggable;
	}

	public WebElement getMenuDroppable() {
		return menuDroppable;
	}

	public WebElement getDivDraggable2() {
		return divDraggable2;
	}

	public WebElement getDivDroppable() {
		return divDroppable;
	}

	public List<WebElement> getLiProducts() {
		return liProducts;
	}

	public WebElement getDivDroppable2() {
		return divDroppable2;
	}

	public WebElement getMenuResizable() {
		return menuResizable;
	}
	
	public WebElement getDivResizableArea() {
		return divResizableArea;
	}

	public WebElement getMenuSelectable() {
		return menuSelectable;
	}

	public List<WebElement> getLiNumeros() {
		return liNumeros;
	}

	public List<WebElement> getLiItens() {
		return liItens;
	}

	public WebElement getMenuSortable() {
		return menuSortable;
	}

	public List<WebElement> getLiNumSortable() {
		return liNumSortable;
	}

	public WebElement getMenuAccordion() {
		return menuAccordion;
	}

	public List<WebElement> getH3Sections() {
		return h3Sections;
	}

	public WebElement getMenuAutocomplete() {
		return menuAutocomplete;
	}

	public WebElement getTxtTags() {
		return txtTags;
	}

	public List<WebElement> getListaSugestoesPesq() {
		return listaSugestoesPesq;
	}

	public WebElement getMenuDatePicker() {
		return menuDatePicker;
	}
	
	///
	public WebElement getTxtDate() {
		return txtDate;
	}

	public WebElement getLblMes() {
		return lblMes;
	}

	public WebElement getLblAno() {
		return lblAno;
	}

	public List<WebElement> getListaDias() {
		return listaDias;
	}

	public WebElement getSpanNext() {
		return spanNext;
	}

	public WebElement getSpanPrevious() {
		return spanPrevious;
	}
	///

	public WebElement getMenuNews() {
		return menuNews;
	}

	public List<WebElement> getSubMenuNews() {
		return subMenuNews;
	}

	public WebElement getMenuMenu() {
		return menuMenu;
	}

	public WebElement getMenuSlider() {
		return menuSlider;
	}

	public WebElement getSpanSlider() {
		return spanSlider;
	}
	
	//FRAMES
	public WebElement getMenuFramesAndWindows() {
		return menuFramesAndWindows;
	}

	public WebElement getLinkNewWindow() {
		return linkNewWindow;
	}
	
	public WebElement getLinkNewFrame() {
		return linkNewFrame;
	}

	public WebElement getMenuSuperior() {
		return menuSuperior;
	}

	public WebElement getBtnSimpleAlert() {
		return btnSimpleAlert;
	}

	public WebElement getBtnConfirmPopUp() {
		return btnConfirmPopUp;
	}

	public WebElement getBtnPromptPopUp() {
		return btnPromptPopUp;
	}

	
	
	
	
	
	
	
	
}
