package tests.footerLinks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.MetroHomePage;

public class FooterLinksTest {

    @Test
    public void checkLangSwitchButtonIsDisplayed() {
        WebElement button = driver.findElement(By.xpath(".//button[@class = 'select_metro-borderless__button']"));
        Assert.assertTrue("Button is not displayed", button.isDisplayed());
    }

    @Test
    public void testLanguageChangeToRussian() {
        WebElement pageHeading = driver.findElement(By.tagName("h1"));
        String headingText = pageHeading.getText();
        Assert.assertEquals("Схема метро Москвы", headingText);
    }

    @Test
    public void testLanguageChangeToEnglish() {
        metroPage.waitForLoadHomePage();
        metroPage.changeLangToEn();
        WebElement pageHeading = driver.findElement(By.tagName("h1"));
        String headingText = pageHeading.getText();
        Assert.assertEquals("Metro map for Moscow", headingText);
    }

    @Test
    public void testChangeLangToBy() {
        metroPage.waitForLoadHomePage();
        metroPage.changeLangToBy();
        WebElement pageHeading = driver.findElement(By.tagName("h1"));
        String headingText = pageHeading.getText();
        Assert.assertEquals("Схема метро Масквы", headingText);
    }

    @Test
    public void testChangeLangToUa() {
        metroPage.waitForLoadHomePage();
        metroPage.changeLangToUa();
        WebElement pageHeading = driver.findElement(By.tagName("h1"));
        String headingText = pageHeading.getText();
        Assert.assertEquals("Схема метро Москви", headingText);
    }
}
