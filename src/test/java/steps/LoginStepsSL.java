package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageSL;
import pages.InventoryPageSL;

public class LoginStepsSL {
    HomePageSL objHomePage = new HomePageSL();
    InventoryPageSL objInventoryPageSL = new InventoryPageSL();

    @Given("Un usuario con credenciales validas en el home page de sauce demo")
    public void unUsuarioConCredencialesValidasEnElHomePageDeSauceDemo() {
        objHomePage.navigateToSauceDemoHomePage();
    }
    @When("Ingreso usuario y contresena")
    public void ingresoUsuarioYContresena() {
        objHomePage.login("standard_user", "secret_sauce");
    }
    @Then("Visualizo el cambio de pagina al inventario")
    public void visualizoElCambioDePaginaAlInventario() {

    }



}
