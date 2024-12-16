package base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.MetroHomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-metro.stand-2.praktikum-services.ru/");
        //driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //MetroHomePage metroPage = new MetroHomePage(driver);
        // дождались загрузки страницы
        //metroPage.waitForLoadHomePage();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}