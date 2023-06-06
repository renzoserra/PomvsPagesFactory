package pages;

import org.junit.Assert;

public class InventoryPageSL extends BasePage{
    // Contructor

    public InventoryPageSL() {
        super(driver);
    }

    //URL

    String url = "https://www.saucedemo.com/inventory.html";

    //Web Element
    String spanProducts = "//span[contains(text(),'Products')]";

    //Metodos
    public void validateSpanProducts(){
        Assert.assertTrue("Estamos en Inventory",find(spanProducts).isDisplayed());
    }

}
