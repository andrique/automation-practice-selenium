package qa.andriele.automation.practice.selenium.tests;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import qa.andriele.automation.practice.selenium.pages.LoginPage;

class LoginPageTest {
	private LoginPage loginPage;
	private final String URL = "https://myanimelist.net/login.php?from=%2F";

	@BeforeEach
	void setUp() throws Exception {
		this.loginPage = new LoginPage();
		this.loginPage.visit(this.URL);
	}

	/* @AfterEach
	void tearDown() throws Exception {
		this.loginPage.quitWebDriver();
	} */

	@Test
	void test() {
		//when
		this.loginPage.signin();

		//then
		assertTrue(this.loginPage.getMyAccountMessage().equals("andrique"));
		assertFalse(this.loginPage.getCurrentUrl().equals(this.URL));
	}

}
