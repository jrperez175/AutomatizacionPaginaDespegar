package co.com.bancolombia.certificacion.despegartest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


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
	
	public void usuarioIngresaFechaSalida(String yyyy_ini, String mm_ini, String dd_ini) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input")).click();
//		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[1]")).click();
		
		while (!driver.findElement(By.xpath("/html/body/div/div/div/div[@data-month='" + yyyy_ini + "-" + mm_ini + "']/div/span[contains(text(),'" + dd_ini + "')]")).isDisplayed()) {
			driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]")).click();
		} 
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[@data-month='" + yyyy_ini + "-" + mm_ini + "']/div/span[contains(text(),'" + dd_ini + "')]")).click();
		
	}
	
	public void usuarioIngresaFechaRegreso(String yyyy_fin, String mm_fin, String dd_fin) throws InterruptedException {
		
		//driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/input")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[29]")).click();
		
		while (!driver.findElement(By.xpath("/html/body/div/div/div/div[@data-month='" + yyyy_fin + "-" + mm_fin + "']/div/span[contains(text(),'" + dd_fin + "')]")).isDisplayed()) {
			driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[@data-month='" + yyyy_fin + "-" + mm_fin + "']/div/span[contains(text(),'" + dd_fin + "')]")).click();
	}
	
	
	public void usuarioIngresaNroPersonas(int nro_adultos, int nro_ninos ) {
		
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[6]/div[2]/div/input")).click();
		
			
		int edad_ninos =  (int) (Math.random()*(5-(2-1))+2);
		
		for (int i = 0; i < nro_adultos; i++) {
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/a[2]")).click();
		
		}
		
		for (int i = 1; i <= nro_ninos; i++) {
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div/a[2]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div["+ nro_ninos +"]/div[2]/div/div/select")).click();                       
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div["+ nro_ninos +"]/div[2]/div/div/select/option[" + edad_ninos + "]")).click();
		}
		
		
				
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/a")).click(); //Boton Aplicar
		
	}
	
	public void usuarioClickBotonBuscar() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[4]/div/a/em")).click();
		Thread.sleep(6000);
		
	}

	
	
	public SearchPage (WebDriver driver) {
		this.driver = driver;
	}
	
	
}
