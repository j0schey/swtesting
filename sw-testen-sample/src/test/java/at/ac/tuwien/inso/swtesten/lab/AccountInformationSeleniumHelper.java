package at.ac.tuwien.inso.swtesten.lab;

import at.ac.tuwien.inso.swtesten.util.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by joschey on 14.01.17.
 */
public class AccountInformationSeleniumHelper {

    private WebDriver driver;
    private String baseUrl;

    public void setUp() {
        driver = SeleniumWebDriver.getDriver();
        baseUrl = "https://peso.inso.tuwien.ac.at/st/grp114/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        SeleniumWebDriver.setDefaultLocale("en");

        driver.get(baseUrl);

        // login
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.name("app_username")).clear();
        driver.findElement(By.name("app_username")).sendKeys("User14.02@mail.com");
        driver.findElement(By.name("app_password")).clear();
        driver.findElement(By.name("app_password")).sendKeys("Testing14_d351");
        driver.findElement(By.id("loginSubmit")).click();
    }

    public void showProfile() {
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/ul/li[1]/ul/li[1]/a")).click();
    }

    public void shutDown(){
        SeleniumWebDriver.closeDriver();
    }

    public void setProfileFields(String arg0, String arg1, String arg2, String arg3) {
        driver.findElement(By.id("address.street")).clear();
        driver.findElement(By.id("address.street")).sendKeys(arg0);
        driver.findElement(By.id("address.zip")).clear();
        driver.findElement(By.id("address.zip")).sendKeys(arg1);
        driver.findElement(By.id("address.city")).clear();
        driver.findElement(By.id("address.city")).sendKeys(arg2);
        new Select(driver.findElement(By.id("address.country"))).selectByValue(arg3.toUpperCase());
    }

    public void submitProfileChanges() {
        driver.findElement(By.cssSelector("button.button.float-right")).click();
    }

    public void assertProfileChanges(String arg0, String arg1, String arg2, String arg3) {
        assertEquals(arg0, driver.findElement(By.id("address.street")).getAttribute("value"));
        assertEquals(arg1, driver.findElement(By.id("address.zip")).getAttribute("value"));
        assertEquals(arg2, driver.findElement(By.id("address.city")).getAttribute("value"));
        assertEquals(arg3.toUpperCase(), new Select(driver.findElement(By.id("address.country"))).getFirstSelectedOption().getAttribute("value"));
    }
}