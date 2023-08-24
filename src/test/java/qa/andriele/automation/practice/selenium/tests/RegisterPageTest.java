package qa.andriele.automation.practice.selenium.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import qa.andriele.automation.practice.selenium.pages.RegisterPage;

class RegisterPageTest {
	private RegisterPage registerPage;
	private final String URL = "https://myanimelist.net/register.php?from=%2F";

	@BeforeEach
	void setUp() throws Exception {
		this.registerPage = new RegisterPage();
		this.registerPage.visit(URL);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		//this.registerPage.quitWebDriver();
	}

	@Test
	void test() {
		
		this.registerPage.fillOutForm();
	}

}
