package qa.andriele.automation.practice.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	private WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://myanimelist.net/login.php?from=%2F");
		
	}

	@AfterEach
	void tearDown() throws Exception {
	driver.quit();
	}

	@Test
	void test() {
		WebElement userNameElement = driver.findElement(By.id("loginUserName"));
		userNameElement.sendKeys("andrique"); //adicionar um login
		
		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.sendKeys("andri123"); //adicionar uma senha
		
		WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"dialog\"]/tbody/tr/td/form/div/p[6]/input"));
		submitBtnElement.click();
		
		WebElement tagMyPanel = driver.findElement(By.className("header-profile-link"));
		String textTagH1 = tagMyPanel.getText();

		Assertions.assertTrue(textTagH1.equals("andrique"));
		

	}

}
