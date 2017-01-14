package at.ac.tuwien.inso.swtesten.util;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class SeleniumWebDriver {

    private static WebDriver webdriver = null;
    private static String defaultLocale = "en"; //use english as default

    public static WebDriver getDriver() {
        if (webdriver == null) {
            webdriver = createWebDriver();
        }

        return webdriver;
    }

        // Use this method if you use Chrome
        private static WebDriver createWebDriver() {
            ChromeDriverManager.getInstance().setup();

            ChromeOptions options = new ChromeOptions();
            if(StringUtils.isNoneBlank(defaultLocale)) {
                options.addArguments("--lang=" + defaultLocale);
            }
            return new ChromeDriver(options);
        }

    // Use this method if you use an older version of Firefox (<47). Be sure to change the pathname according to your system setup.
    // Be aware that we recommend to use Chrome.
    //    private static WebDriver createWebDriver() {
    //        //If you have installed multiple Firefox Versions set the path to the specific version
    //        List<String> paths = Arrays.asList(
    //                "/usr/bin/firefox",                                             //Linux
    //                "/Applications/Firefox 44.app/Contents/MacOS/firefox-bin",      //OS X
    //                "D:\\Dev Tools\\Firefox44 x32\\firefox.exe"                     //Windows
    //
    //                //TODO add path
    //        );
    //
    //        FirefoxProfile profile = new FirefoxProfile();
    //        if(StringUtils.isNoneBlank(defaultLocale)) {
    //            profile.setPreference("intl.accept_languages", defaultLocale);
    //        }
    //
    //        for (String pathname : paths) {
    //            if(new File(pathname).exists()) {
    //                return new FirefoxDriver(new FirefoxBinary(new File(pathname)), profile);
    //            }
    //        }
    //
    //        return new FirefoxDriver(profile);


    public static void closeDriver() {
        try {
            webdriver.quit();
            webdriver = null;
        }
        catch (UnreachableBrowserException ignored) {
        }
    }

    public static void setDefaultLocale(String defaultLocale) {
        SeleniumWebDriver.defaultLocale = defaultLocale;
    }
}

