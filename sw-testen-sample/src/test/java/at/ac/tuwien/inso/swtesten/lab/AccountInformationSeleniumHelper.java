package at.ac.tuwien.inso.swtesten.lab;

import at.ac.tuwien.inso.swtesten.util.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

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
    }

    public void login(){
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.name("app_username")).clear();
        driver.findElement(By.name("app_username")).sendKeys("User14.02@mail.com");
        driver.findElement(By.name("app_password")).clear();
        driver.findElement(By.name("app_password")).sendKeys("Testing14_d351");
        driver.findElement(By.id("loginSubmit")).click();
    }

    public void shutDown(){
        SeleniumWebDriver.closeDriver();
    }
}

/*
    driver.get(baseUrl + "/st/grp114/");
    driver.findElement(By.id("loginButton")).click();
    driver.findElement(By.name("app_username")).clear();
    driver.findElement(By.name("app_username")).sendKeys("User14.02@mail.com");
    driver.findElement(By.name("app_password")).clear();
    driver.findElement(By.name("app_password")).sendKeys("Testing14_d351");
    driver.findElement(By.id("loginSubmit")).click();
    driver.findElement(By.linkText("Account")).click();
    driver.findElement(By.id("address.street")).clear();
    driver.findElement(By.id("address.street")).sendKeys("Gußhausstraße 28");
    driver.findElement(By.id("address.zip")).clear();
    driver.findElement(By.id("address.zip")).sendKeys("1040");
    driver.findElement(By.id("address.city")).clear();
    driver.findElement(By.id("address.city")).sendKeys("Vienna");
    new Select(driver.findElement(By.id("address.country"))).selectByVisibleText("Austria");
    driver.findElement(By.cssSelector("button.button.float-right")).click();
 */