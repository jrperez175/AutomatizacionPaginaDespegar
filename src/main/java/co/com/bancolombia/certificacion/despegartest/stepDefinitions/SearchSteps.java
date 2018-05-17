package co.com.bancolombia.certificacion.despegartest.stepDefinitions;

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

	@And("^el usuario ingrese la ciudad origen (.*)$")
	public void usuarioIngresaCiudadOrigen(String origen) throws InterruptedException  {
		searchPage.usuarioIngresaCiudadOrigen(origen);
	}

	@And("^el usuario ingrese la ciudad destino (.*)$")
	public void usuarioIngresaCiudadDestino(String destino) throws InterruptedException  {
		searchPage.usuarioIngresaCiudadDestino(destino);
	}

	@And("^el usuario ingrese la fecha de inicio$")
	public void usuarioIngresaFechaSalida() {
		searchPage.usuarioIngresaFechaSalida();
	}

	@And("^el usuario ingrese la fecha final$")
	public void usuarioIngresaFechaRegreso() {
		searchPage.usuarioIngresaFechaRegreso();
	}

	@And("^el usuario ingrese el numero de personas a viajar  (.*)$")
	public void el_usuario_ingrese_el_numero_de_personas_a_viajar(int arg1) throws Throwable {
	}

	@And("^el usuario haga click en el boton enviar$")
	public void el_usuario_haga_click_en_el_boton_enviar() throws Throwable {
	}

	@Then("^el usuario se le presenta las lista de los vuelos seleccionados$")
	public void el_usuario_se_le_presenta_las_lista_de_los_vuelos_seleccionados() throws Throwable {
	}
	
	
	public SearchSteps(ShareDriver sharedriver, SearchPage searchPage) {
		driver = sharedriver;
		this.searchPage = searchPage;
		
		
	}

}
