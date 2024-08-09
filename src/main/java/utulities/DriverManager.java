package utulities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private static WebDriver driver;

    // Метод для инициализации драйвера
    public static void initializeDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/snap/bin/geckodriver");
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }

    // Метод для получения текущего экземпляра драйвера
    public static WebDriver getDriver() {
        return driver;
    }

    // Метод для завершения работы драйвера и освобождения ресурсов
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}