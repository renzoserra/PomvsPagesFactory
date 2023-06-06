package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageSL {

    WebDriver driver;



    // Contructor
    public HomePageSL(WebDriver driver){
    this.driver = driver;
    ChromeOptions chromeOptions = new ChromeOptions();
    driver = new ChromeDriver(chromeOptions);
    PageFactory.initElements(driver,this);
    }

    //URL

    String url = "https://www.saucedemo.com/";

    //Web Element
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement inputUser;
    @FindBy(xpath = "//input[@id='password']")
    WebElement inputPass;
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButtonSubmit;

    //Metodos

    public void navigateToSauceDemoHomePage(){
        driver.get(url);
    }

    public void login(String username, String password) {
        inputUser.sendKeys(username);
        inputPass.sendKeys(password);
        loginButtonSubmit.click();
    }

    public void buttonSubmitNoDisplay(){
        Assert.assertTrue("Se inicio sesión Correctamente",loginButtonSubmit.isDisplayed());
    }
}
