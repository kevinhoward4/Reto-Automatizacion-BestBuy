package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.BestBuySteps;

public class BuscadorBestStepDefinition {
    @Steps
    BestBuySteps BestBuySteps = new BestBuySteps();

    @Given("^El usuario se encuentra en la pagina principal de BestBuy$")
    public void elUsuarioSeEncuentraEnLaPaginaPrincipalDeBestBuy() {
        SeleniumWebDriver.ChromeWebDriver("https://www.bestbuy.com/");
    }

    @When("^Ingresa en la barra de busqueda el item a buscar da click en el boton de buscar$")
    public void ingresaEnLaBarraDeBusquedaElItemABuscarDaClickEnElBotonDeBuscar() {
        BestBuySteps.buscarPalabraEnBestBuy();
    }

    @Then("^Se debe redirigir a la pantalla donde salen los resultados del item buscado y selecionar el item$")
    public void seDebeRedirigirALaPantallaDondeSalenLosResultadosDelItemBuscadoYSelecionarElItem() {
        SeleniumWebDriver.driver.quit();
    }
}
