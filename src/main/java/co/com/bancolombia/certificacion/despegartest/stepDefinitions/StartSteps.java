package co.com.bancolombia.certificacion.despegartest.stepDefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certificacion.despegartest.configuration.ShareDriver;
import co.com.bancolombia.certificacion.despegartest.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;



public class StartSteps {

	WebDriver driver;
	HomePage startpage;
	
	
	@Given ("^Dado que el usuario esta en la opcion de busqueda de la pagina Despegar$")
	public void usuarioEstaEnPaginaDespegar() {
		startpage.ingresarUrl();
	}
	
    @When ("^el usuario haga click en el opcion vuelo$")
    public void usuarioHaceClicOpcionVuelo() throws InterruptedException {
		startpage.opcionVuelo();
	}
    
        
    	
	public StartSteps(ShareDriver sharedriver, HomePage startpage ) {
		driver = sharedriver;
		this.startpage=startpage;
		
		
	}
	
}
