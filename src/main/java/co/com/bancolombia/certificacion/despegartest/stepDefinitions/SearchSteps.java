package co.com.bancolombia.certificacion.despegartest.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certificacion.despegartest.configuration.ShareDriver;
import co.com.bancolombia.certificacion.despegartest.pages.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchSteps {
	WebDriver driver;
	SearchPage searchPage;
	
	@And("^el usuario haga click en el opcion ida y vuelta$")
	public void usuarioClickOpcionIdayVuelta()  {
		searchPage.usuarioClickOpcionIdayVuelta();
		
	}

	@And("^el usuario ingresa la ciudad origen (.*)$")
	public void usuarioIngresaCiudadOrigen(String origen) throws InterruptedException  {
		searchPage.usuarioIngresaCiudadOrigen(origen);
	}

	@And("^el usuario ingresa la ciudad destino (.*)$")
	public void usuarioIngresaCiudadDestino(String destino) throws InterruptedException  {
		searchPage.usuarioIngresaCiudadDestino(destino);
	}

	@And("^el usuario ingresa la fecha de inicio YYYY (.*) MM (.*) DD (.*)$")
	public void usuarioIngresaFechaSalida(String yyyy_ini, String mm_ini, String dd_ini) throws InterruptedException {
		searchPage.usuarioIngresaFechaSalida(yyyy_ini,mm_ini,dd_ini );
	}

	@And("^el usuario ingresa la fecha final YYYY (.*) MM (.*) DD (.*)$")
	public void usuarioIngresaFechaRegreso(String yyyy_fin, String mm_fin, String dd_fin) throws InterruptedException {
		searchPage.usuarioIngresaFechaRegreso(yyyy_fin,mm_fin,dd_fin);
	}

	@And("^el usuario ingresa el numero de personas a viajar (.*) (.*)$")
	public void usuarioIngresaNumeroDePersonas(int nro_adultos, int nro_ninos)  {
		searchPage.usuarioIngresaNroPersonas(nro_adultos, nro_ninos);
	}

	@And("^el usuario haga click en el boton enviar$")
	public void usuarioClickBotonEnviar() throws InterruptedException{
		searchPage.usuarioClickBotonBuscar();
	}

	@Then("^al usuario se le presentan la lista de los vuelos$")
	
	public void sePresentanListaDeLosVuelos() {
		String resultado = driver.getTitle();
    	assertEquals("Despegar.com . Resultados de Vuelos", resultado);
		
	}
	
	
	public SearchSteps(ShareDriver sharedriver, SearchPage searchPage) {
		driver = sharedriver;
		this.searchPage = searchPage;
		
		
	}

}
