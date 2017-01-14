package at.ac.tuwien.inso.swtesten.sample;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import at.ac.tuwien.inso.swtesten.util.SeleniumWebDriver;

public class TUWienSeleniumHelper {

	private WebDriver driver;
	private String baseUrl;

	public void setUp() {
		driver = SeleniumWebDriver.getDriver();
		baseUrl = "http://www.tuwien.ac.at/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void goToTeachingAndMasterCourses() {
		driver.get(baseUrl);
		driver.findElement(By.linkText("STUDIUM UND LEHRE")).click();
		driver.findElement(By.linkText("Masterstudien")).click();
	}

	public void selectCourse(String course) {
		driver.findElement(By.linkText(course)).click();
	}

	public void assertDefinition() {
		assertEquals("Masterstudium Software Engineering & Internet Computing", 
				driver.findElement(By.className("csc-firstHeader")).getText());
		
		assertEquals("Das Masterstudium Software Engineering & Internet Computing beschäftigt sich mit der Softwareentwicklung für verteilte Systeme, Mobile Computing sowie Internet Security und Electronic Payment als wesentliche informationstechnische Voraussetzung für einen virtuellen Wirtschaftsplatz Internet.",
				driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/div/div[2]/p[1]")).getText());
	}
	
	public void shutDown() {
		SeleniumWebDriver.closeDriver();
	}
}
