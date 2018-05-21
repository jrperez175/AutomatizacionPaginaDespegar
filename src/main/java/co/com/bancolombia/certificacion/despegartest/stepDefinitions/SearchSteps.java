package co.com.bancolombia.certificacion.despegartest.stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certificacion.despegartest.configuration.ShareDriver;
import co.com.bancolombia.certificacion.despegartest.pages.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchSteps {
	WebDriver driver;
	SearchPage searchPage;
	
	@And("^el usuario haga click en el opcion ida y regreso$")
	public void usuarioClickOpcionIda()  {
		searchPage.usuarioClickOpcionIdayRegreso();
		
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
	public void usuarioIngresaFechaSalida(String yyyy_ini, String mm_ini, int dd_ini) throws InterruptedException {
		searchPage.usuarioIngresaFechaSalida(yyyy_ini,mm_ini,dd_ini );
	}

	@And("^el usuario ingresa la fecha final YYYY (.*) MM (.*) DD (.*) (.*)$")
	public void usuarioIngresaFechaRegreso(String yyyy_fin, String mm_fin, String dd_fin, String mm_ini) throws InterruptedException {
		searchPage.usuarioIngresaFechaRegreso(yyyy_fin,mm_fin,dd_fin,mm_ini);
	}

	@And("^el usuario ingresa el numero de personas a viajar (.*) (.*)$")
	public void usuarioIngresaNumeroDePersonas(int nro_adultos, int nro_ninos) throws InterruptedException  {
		searchPage.usuarioIngresaNroPersonas(nro_adultos, nro_ninos);
	}

	@And("^el usuario haga click en el boton enviar$")
	public void usuarioClickBotonEnviar() throws InterruptedException{
		searchPage.usuarioClickBotonBuscar();
	}

	@And("^el usuario ordena los vuelos por precio$")
	public void usuarioOrdenaVuelosPorPrecio() throws InterruptedException {
		searchPage.usuarioOrdenaVuelosPorPrecio();
	}
	
	
	

	
	@And("^el usuario almacena los registros en excel (.*)$")
	public void usuarioAlmacenaDatosExcel(String ruta_archivo) throws IOException {
		searchPage.usuarioAlmacenaDatosExcel(ruta_archivo);
	}
	
	
	@Then("^al usuario se le presentan la lista de los vuelos$")
	
	public void sePresentanListaDeLosVuelos() {
		String resultado = driver.getTitle();
    	assertEquals("Despegar.com . Resultados de Vuelos", resultado);
		
	}
	
	@Then("^el sistema presenta mensaje Ingresa un destino$")
	public void sePresentanMensajeErrorIngreseDestino() {
		String resultado = driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/span[1]")).getText();
    	assertEquals("Ingresa un destino", resultado);
	
	}
	
	@Then("^el sistema presenta mensaje El destino debe ser diferente del origen$")
	public void sePresentanMensajeErrorDestinoDiferenteOrigen() {
		String resultado = driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/span[2]")).getText();
    	assertEquals("El destino debe ser diferente del origen", resultado);
	
	}
	
	
	
	
	
	public SearchSteps(ShareDriver sharedriver, SearchPage searchPage) {
		driver = sharedriver;
		this.searchPage = searchPage;
		
		
	}

}
