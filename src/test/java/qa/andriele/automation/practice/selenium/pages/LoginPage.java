package qa.andriele.automation.practice.selenium.pages;

import java.time.Duration;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	
		//Locators
		private By loginUserNameLocator = By.id("loginUserName");
		private By passwordElementLocator = By.name("password");
		private By submitBtnElementLocator = By.xpath("//*[@id=\"dialog\"]/tbody/tr/td/form/div/p[6]/input");
		private By classProfileLinkLocator = By.className("header-profile-link");
		
		public void signin() {	
			if(super.isDisplayed(loginUserNameLocator)) {
				super.type("andrique", loginUserNameLocator); //adicionar login
				super.type("andri123", passwordElementLocator); //adicionar senha
				super.click(submitBtnElementLocator);		
			} else {
				System.out.println("User name textbox was not present");				
			}
		}
		
		public String getMyAccountMessage() {
			//alterei o driver para público para poder chamá-lo aqui e coloquei um tempo fixo de 5s, não é a melhor prática, mas você aprenderá melhores eventualmente
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			return super.getText(classProfileLinkLocator);
		}
		

}
