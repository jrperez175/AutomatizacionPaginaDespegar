package co.com.bancolombia.certificacion.despegartest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public void ingresarUrl() {
		String url = "https://www.despegar.com.co/";

		// Maximizar la ventana del navegador
		driver.manage().window().maximize();

		// Ingresar a la URL
		driver.get(url);

	}

	public void opcionVuelo() throws InterruptedException {
		Thread.sleep(3000);			
		//driver.findElement(By.linkText("Vuelos")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/ul/li/a/span[contains(text(),'Vuelos')]")).click();
	}

	public HomePage(WebDriver driver) { // constructor
		this.driver = driver;

	}

}
