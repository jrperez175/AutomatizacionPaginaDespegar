package co.com.bancolombia.certificacion.despegartest.configuration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

//import cucumber.api.Scenario;
//import cucumber.api.java.After;

public class ShareDriver extends EventFiringWebDriver {

	public static final WebDriver driver; //crea una variable estatica que controla una unica instancia
	static { //se inizializa la variable estatica no puede ser por una funcion
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //maximo tiempo de espera
	}
	
	public ShareDriver() {
		super(driver);
		
	}
	
//	@After
//	public void tearDown(Scenario scenario) {   //por cada escenario que ejecute corra esta funcion
//		driver.quit();
//	}
	
//	private static final Thread CLOSE_THREAD = new Thread() {
//	    @Override
//	    public void run() {
//	        driver.quit();
//	    }
//	};
//	static {
//	   Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
//	}
//
//	@Override
//	public void quit() {
//	    if (Thread.currentThread() != CLOSE_THREAD) {
//	        throw new UnsupportedOperationException("You shouldn't quit this WebDriver. It's shared and will quit when the JVM exits.");
//	    }
//	    super.quit();
//	}
//
	
}


