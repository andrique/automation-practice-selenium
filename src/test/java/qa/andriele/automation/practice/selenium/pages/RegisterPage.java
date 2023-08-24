package qa.andriele.automation.practice.selenium.pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
	//Locators
	private By emailLocator = By.id("loginEmail");
	private By usernameLocator = By.name("user_name");
	private By passwordLocator = By.id("password");
	private By birthdayMonthLocator = By.name("birthday[month]");
	private By birthdayDayLocator = By.name("birthday[day]");
	private By birthdayYearLocator = By.name("birthday[year]");
	//private By registerBtnLocator = By.id("create-account");
	
	//adicionar dados
	public void fillOutForm() {
		super.type("andrieleputrique@hotmail.com", emailLocator);
		super.type("andrique", usernameLocator);
		super.type("123456", passwordLocator);
		selectByValue(birthdayMonthLocator, "9");
		selectByValue(birthdayDayLocator, "30");
		selectByValue(birthdayYearLocator, "1991");
		//click(registerBtnLocator);
		
	}

}
