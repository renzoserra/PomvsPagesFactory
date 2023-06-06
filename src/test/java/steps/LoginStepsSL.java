package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePageSL;
public class LoginStepsSL {

    private WebDriver driver;
    HomePageSL objHomePageSL = new HomePageSL(driver);

    @Given("Un usuario con credenciales validas en el home page de sauce demo")
    public void unUsuarioConCredencialesValidasEnElHomePageDeSauceDemo() {

        objHomePageSL.validToSauceDemoHomePage();
    }
    @When("Ingreso usuario y contrasena")
    public void ingresoUsuarioYContrasena() {

        objHomePageSL.login("standard_user", "secret_sauce");
    }
    @Then("Visualizo el cambio de pagina al inventario")
    public void visualizoElCambioDePaginaAlInventario() {

    }



}
