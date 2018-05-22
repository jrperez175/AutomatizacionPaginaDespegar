package co.com.bancolombia.certificacion.despegartest.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="projectFeatures", //definimos donde esta el lenguaje gherkin
				glue="co.com.bancolombia.certificacion.despegartest.stepDefinitions" //y el codigo pegado
				//,tags = {"@Busqueda_Exitosa","~@Busqueda_FaltaCiudadDestino"}
				)   // que escenario ejecutar sino se coloca el tag ejecuta todo la ~significa no corre
public class TestRunner {
	
}
