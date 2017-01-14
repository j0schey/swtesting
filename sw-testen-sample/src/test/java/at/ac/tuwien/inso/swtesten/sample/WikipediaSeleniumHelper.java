package at.ac.tuwien.inso.swtesten.sample;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import at.ac.tuwien.inso.swtesten.util.SeleniumWebDriver;

public class WikipediaSeleniumHelper {
	private WebDriver driver;
	private String baseUrl;

	public void setUp() throws Exception {
		driver = SeleniumWebDriver.getDriver();
		baseUrl = "http://www.wikipedia.org/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void selectLanguage(){
		driver.get(baseUrl);
		driver.findElement(By.cssSelector("div.central-featured-lang.lang1 > a.link-box > strong")).click();
	}

	public void assertStartPageText(String arg1) {
		assertEquals(arg1, driver.findElement(By.xpath("//div[@id='hauptseite-willkommen']/h2/span")).getText());
	}

	public void search(String searchText){
		driver.findElement(By.id("searchInput")).clear();
		driver.findElement(By.id("searchInput")).sendKeys(searchText);
		driver.findElement(By.id("searchButton")).click();
	}

	public void assertSearchResult(String articleName) throws Exception {
		assertEquals(articleName, driver.findElement(By.xpath("//h1[@id='firstHeading']")).getText());
	}

	public void assertThatArticleNotExists(String articleName) {
		WebElement element = driver.findElement(By.className("mw-search-createlink"));
		assertEquals("Der Artikel „" + articleName + "“ existiert in der deutschsprachigen Wikipedia nicht. Du kannst den Artikel erstellen (Quelltext-Editor, Anleitung).\n"
				+ "Wenn dir die folgenden Suchergebnisse nicht weiterhelfen, wende dich bitte an die Suchhilfe oder suche nach „" + articleName + "“ in anderssprachigen Wikipedias.", element.getText());
	}
	
	public void shutDown() {
		SeleniumWebDriver.closeDriver();
	}

	public void setBrowserLanguage(String locale) {
		SeleniumWebDriver.setDefaultLocale(locale);
	}
}
