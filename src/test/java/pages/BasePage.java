package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    public static void navigateTo(String url){
        driver.get(url);
    }
    public WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public void clickElement(String locator){
        find(locator).click();
    }
    public void write (String locator, String textToWrite){
        find(locator).clear();
        find(locator).sendKeys(textToWrite);
    }
}
