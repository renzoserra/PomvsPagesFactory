package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPageSL{

    WebDriver driver;


    // Contructor
    public InventoryPageSL (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //URL

    String url = "https://www.saucedemo.com/inventory.html";

    //Web Element
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement spanProducts;

    //Metodos
    public void validateSpanProducts(){
        spanProducts.getText().contains("Products");
    }

}
