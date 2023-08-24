package qa.andriele.automation.practice.selenium.pages;

import org.openqa.selenium.By;

public class AnimesPage extends BasePage {
	//Locators
	private By menuAnimeLocator = By.cssSelector("#nav > li:nth-child(1) > a");
	private By submenuAnimeLocator = By.cssSelector("#nav > li:nth-child(1) > ul > li:nth-child(2) > a");
	private By titlePageTopAnimeLocator = By.tagName("h1");
	
	public void viewTopAnimesPage() {
		if(super.isDisplayed(menuAnimeLocator)) {
			super.actionMovetoElementPerform(menuAnimeLocator);
			super.actionMovetoElementClickPerform(submenuAnimeLocator);
		}else {
			System.out.println("menu Anime was not found");
		}		
	}
	
	public String getTitlePage( ) {
		return super.getText(titlePageTopAnimeLocator);
	}
	

}
