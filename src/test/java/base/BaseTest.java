package base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
protected WebDriver driver;

@Before
    public void setUp() {
    driver = new ChromeDriver();
    //driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
}

@After
    public void tearDown() {
    if(driver != null) {
        driver.quit();
    }
}
}
