package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataDriveDemoQa;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Verifico;
import tasks.Abrir;
import tasks.Diligenciar;

import java.util.List;

public class DemoQaStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^yo ingreso al sitio web$")
    public void yo_ingreso_al_sitio_web() {
        OnStage.theActorCalled("jairo").wasAbleTo(Abrir.laPagina());
    }


    @When("^yo Diligencio los campos de texto$")
    public void yo_Diligencio_los_campos_de_texto(List<DataDriveDemoQa> losdatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.elFormulariocon(losdatos));
    }

    @Then("^yo verifico que se registren los datos correctamente\"([^\"]*)\"$")
    public void yoVerificoQueSeRegistrenLosDatosCorrectamente(String dato) {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verifico.laRespuestaConEl(dato)));
    }



}
