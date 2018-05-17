package co.com.bancolombia.certificacion.despegartest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;


public class SearchPage {

	WebDriver driver;
	
	public void usuarioClickOpcionIdayVuelta() {
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/form/span/label/span[contains(text(),'Ida y vuelta')]")).click();
	}
	
	public void usuarioIngresaCiudadOrigen(String origen) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).sendKeys(origen);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).sendKeys(Keys.ENTER);

	}
	
	public void usuarioIngresaCiudadDestino(String destino) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).sendKeys(destino);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).sendKeys(Keys.ENTER);

	}
	
	public void usuarioIngresaFechaSalida() {
		
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[1]")).click();

		
	}
	
	public void usuarioIngresaFechaRegreso() {
		
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[29]")).click();
		
	}
	

	
	
	public SearchPage (WebDriver driver) {
		this.driver = driver;
	}
	
	
}
