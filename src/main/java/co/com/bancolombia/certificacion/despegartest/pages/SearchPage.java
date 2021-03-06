package co.com.bancolombia.certificacion.despegartest.pages;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import org.apache.poi.ss.formula.functions.Replace;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import co.com.bancolombia.certificacion.despegartest.util.TrabajarConExcel;

public class SearchPage {

	WebDriver driver;
	TrabajarConExcel excel;
	Calendar c1 = Calendar.getInstance();
	int mes = c1.get(Calendar.MONTH);
	String mesCaracter = "";
	Select orden_vuelo;

	public void usuarioClickOpcionIdayRegreso() {
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/form/span/label/span[contains(text(),'Ida y vuelta')]")).click();
		
		                             
	}

	public void usuarioIngresaCiudadOrigen(String origen) throws InterruptedException {

		driver.findElement(By.xpath(
				"//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder='Ingresa desde d�nde viajas']"))
				.clear();
		driver.findElement(By.xpath(
				"//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder='Ingresa desde d�nde viajas']"))
				.sendKeys(origen);

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder='Ingresa desde d�nde viajas']"))
				.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(
				"//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder='Ingresa desde d�nde viajas']"))
				.sendKeys(Keys.ENTER);

	}

	public void usuarioIngresaCiudadDestino(String destino) throws InterruptedException {

		driver.findElement(By.xpath(
				"//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder='Ingresa hacia d�nde viajas']"))
				.clear();
		driver.findElement(By.xpath(
				"//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder='Ingresa hacia d�nde viajas']"))
				.sendKeys(destino);

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder='Ingresa hacia d�nde viajas']"))
				.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(
				"//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder='Ingresa hacia d�nde viajas']"))
				.sendKeys(Keys.ENTER);

	}

	public void usuarioIngresaFechaSalida(String yyyy_ini, String mm_ini, int dd_ini) throws InterruptedException {

		if (mes >= 0 || mes <= 8) {
			mesCaracter = "0" + Integer.toString(mes + 1);
		} else {
			mesCaracter = Integer.toString(mes + 1);
		}

		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/div/div/div/div/input[@placeholder='Partida']")).click();
		

		while (!driver.findElement(By.xpath("/html/body/div/div/div/div[@data-month='" + yyyy_ini + "-" + mm_ini + "']/div[@class='_dpmg2--dates']/span["+ dd_ini +"]")).isDisplayed()) {
				
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]")).click();
		}

		if (!mesCaracter.equals(mm_ini)) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]")).click();
		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[@data-month='" + yyyy_ini + "-" + mm_ini + "']/div[@class='_dpmg2--dates']/span["+ dd_ini +"]")).click();

	}

	public void usuarioIngresaFechaRegreso(String yyyy_fin, String mm_fin, String dd_fin, String mm_ini)
			throws InterruptedException {


		while (!driver.findElement(By.xpath("/html/body/div/div/div/div[@data-month='" + yyyy_fin + "-" + mm_fin
				+ "']/div/span[contains(text(),'" + dd_fin + "')]")).isDisplayed()) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]")).click();
		}

		if (mm_fin.equals(mm_ini)) {
			Thread.sleep(1000);
			//driver.findElement(By.xpath("/html/body/div/div/div/div[@data-month='" + yyyy_fin + "-" + mm_fin + "']/div/span[@class='_dpmg2--date _dpmg2--available _dpmg2--nights-tooltip _dpmg2--days--modifier'][" + dd_fin + "]")).click();
			driver.findElement(By.xpath("/html/body/div/div/div/div[@data-month='" + yyyy_fin + "-" + mm_fin + "']/div[4]/span[contains(text(),'"+dd_fin +"')]")).click();																				                                        
		} else {
			driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]")).click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath("/html/body/div/div/div/div[@data-month='" + yyyy_fin + "-" + mm_fin + "']/div/span[@class='_dpmg2--date _dpmg2--available _dpmg2--nights-tooltip _dpmg2--days--modifier']["	+ dd_fin + "]")).click();
			driver.findElement(By.xpath("/html/body/div/div/div/div[@data-month='" + yyyy_fin + "-" + mm_fin + "']/div[4]/span[contains(text(),'"+dd_fin +"')]")).click();
		}

	}

	public void usuarioIngresaNroPersonas(int nro_adultos, int nro_ninos) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[6]/div[2]/div/input"))
				.click();

		int edad_ninos = (int) (Math.random() * 4 + 2);

		for (int i = 1; i < nro_adultos; i++) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/a[2]"))
					.click();

		}

		for (int i = 1; i <= nro_ninos; i++) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div/a[2]"))
					.click();
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[" + nro_ninos
					+ "]/div[2]/div/div/select")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[" + nro_ninos
					+ "]/div[2]/div/div/select/option[" + edad_ninos + "]")).click();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/a")).click(); // Boton Aplicar

	}

	public void usuarioClickBotonBuscar() throws InterruptedException {

		// driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[4]/div/a/em")).click();
		driver.findElement(
				By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div/div/div/div/a/em[@class=\"btn-text\"]"))
				.click();
		Thread.sleep(9000);

	}

	public void usuarioAlmacenaDatosExcel(String ruta_archivo) throws IOException {
		excel = new TrabajarConExcel(ruta_archivo);
		String aerolinea;
		String valor;

		excel.escribirExcel(0, 0, 0, "Aerolinea");
		excel.escribirExcel(0, 0, 1, "Valor");

		try {
			for (int i = 1; i <= 7; i++) {
				aerolinea = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[" + i
						+ "]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]"))
						.getText();
				valor = driver
						.findElement(By.xpath("//*[@id=\"clusters\"]/span[" + i
								+ "]/span/cluster/div/div/span/fare-box/div/span/span/span/p[2]/span[2]/em[2]"))
						.getText();

				excel.escribirExcel(0, i, 0, aerolinea);
				excel.escribirExcel(0, i, 1, valor);
			}
		} catch (NoSuchElementException e) {
			for (int i = 1; i <= 7; i++) {
				aerolinea = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[" + i
						+ "]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]"))
						.getText();
				valor = driver.findElement(By.xpath("//*[@id=\"clusters\"]/span[" + i
						+ "]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]"))
						.getText();

				excel.escribirExcel(0, i, 0, aerolinea);
				excel.escribirExcel(0, i, 1, valor);

			}
		}

	}

	public void usuarioOrdenaVuelosPorPrecio(String orden) throws InterruptedException {
		Thread.sleep(1000);
		orden_vuelo = new Select(driver.findElement(By.id("eva-select")));
		Thread.sleep(1000);
		orden_vuelo.selectByVisibleText(orden);
		Thread.sleep(6000);

	}

	public void sistemaResaltaVueloMasEconomico() throws IOException {

		String strMenor=  excel.leerExcel(0, 1, 1);
		String strValor="";
		int valor=0;
		int  menor= Integer.parseInt(strMenor.replace(".","")); 
		int fila = 1;

		
		
		for (int i = 2; i <= 7; i++) {
			strValor = excel.leerExcel(0, i, 1);
			valor= Integer.parseInt(strValor.replace(".",""));
			if (menor > valor) {
				menor = valor;
				fila=i;
				
			}
		
		}

		excel.Estilo(0, fila, 1);
		
	}


	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

}
