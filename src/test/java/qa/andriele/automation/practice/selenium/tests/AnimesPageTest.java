package qa.andriele.automation.practice.selenium.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import qa.andriele.automation.practice.selenium.pages.AnimesPage;

class AnimesPageTest {
	private AnimesPage animesPage;
	private final String URL = "https://myanimelist.net/";

	@BeforeEach
	void setUp() throws Exception {
		this.animesPage = new AnimesPage();
		this.animesPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.animesPage.quitWebDriver();
	}

	@Test
	void test() {
		//when
		this.animesPage.viewTopAnimesPage();
		//then
		Assertions.assertEquals("Top Anime", this.animesPage.getTitlePage());
		Assertions.assertFalse(this.URL.equals(animesPage.getCurrentUrl()));
	}

}
