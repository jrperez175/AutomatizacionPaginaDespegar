package co.com.bancolombia.certificacion.despegartest.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
    	
    	Thread.sleep(4000);
    	try {
    		if (driver.findElement(By.xpath("/html/body/div[16]/div/div[1]/span")).isDisplayed()) {
    			driver.findElement(By.xpath("/html/body/div[16]/div/div[1]/span")).click(); // Cierro la ventana modal
    			startpage.opcionVuelo();
    		}
    	}catch (NoSuchElementException e){
    		startpage.opcionVuelo();
    	}
	}
    
        
    	
	public StartSteps(ShareDriver sharedriver, HomePage startpage ) {
		driver = sharedriver;
		this.startpage=startpage;
		
		
	}
	
}
