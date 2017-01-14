package at.ac.tuwien.inso.swtesten.sample;

import at.ac.tuwien.inso.swtesten.util.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by joschey on 12.01.17.
 */
public class TissSeleniumHelper {
    private WebDriver driver;
    private String baseUrl;

    public void setUp() {
        driver = SeleniumWebDriver.getDriver();
        baseUrl = "http://tiss.tuwien.ac.at/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void goToTeachingSection(){
        driver.get(baseUrl);
        driver.findElement(By.linkText("Lehre")).click();
    }

    public void shutDown(){
        SeleniumWebDriver.closeDriver();
    }

    public void selectCourseSection() {
        driver.findElement(By.linkText("Lehrveranstaltungen")).click();
    }

    public void assertHeaderShown(String arg1) {
        assertEquals(arg1, driver.findElement(By.xpath("//*[@id=\"contentInner\"]/h1")).getText());
    }

    public void search(String arg1) {
        driver.findElement(By.xpath("//*[@id=\"courseList:searchField\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"courseList:searchField\"]")).sendKeys(arg1);
        driver.findElement(By.xpath("//*[@id=\"courseList:cSearchBtn\"]")).click();
    }

    public void assertCoursePageShown(String arg1) {
        assertEquals(arg1, driver.findElement(By.xpath("//*[@id=\"contentInner\"]/h1")).getText().trim());
    }

    public void assertListContains(String arg1) {
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"courseList:courseTable_data\"]/tr/td"));

        boolean found = false;
        for(WebElement lva : elements){
            if(lva.getText().equals(arg1)){
                found = true;
                break;
            }
        }

        assertTrue(found);
    }
}
