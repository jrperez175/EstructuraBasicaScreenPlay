package co.com.bancolombia.certificacion.XXXqa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/base_ejemplo.feature"},
				glue = {"co.com.bancolombia.certificacion.XXXqa.stepdefinitions"},
				snippets = SnippetType.CAMELCASE
)

public class BaseEjemplo {

}
