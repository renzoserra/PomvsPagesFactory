package pages;

public class HomePageSL  extends BasePage{

    // Contructor

    public HomePageSL() {
        super(driver);
    }

    //URL

    String url = "https://www.saucedemo.com/";

    //Web Element
    String inputUser = "//input[@id='user-name']";
    String inputPass = "//input[@id='password']";
    String loginButtonSubmit = "//input[@id='login-button']";

    //Metodos

    public void navigateToSauceDemoHomePage(){
        navigateTo(url);
    }

    public void login(String username, String password) {
        write(inputUser, username);
        write(inputPass,password );
        clickElement(loginButtonSubmit);
    }
}
