package DriverConfig;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    protected static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }
    @BeforeClass
    public static void init() {
        driver = DriverFactory.getDriver(BROWSER.CHROME);
    }
    @AfterClass
    public static void close() {
        driver.close();
    }
}
