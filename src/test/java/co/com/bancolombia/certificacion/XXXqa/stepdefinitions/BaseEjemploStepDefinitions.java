package co.com.bancolombia.certificacion.XXXqa.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.hamcrest.CoreMatchers.is;



import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class BaseEjemploStepDefinitions {
	
	/*Define objeto que contiene el HomePage de la pagina a automatizar
	 *  private StoreDemoQaHomePage storedemoqahomepage;
	 */
	
	@Before
	public void preparaEscenario() {
		OnStage.setTheStage(new OnlineCast()); 
	}
	
	

}
