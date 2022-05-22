package tasks;

import model.DataDriveDemoQa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;
import userinterface.ObjetosWebForm;
import util.Constantes;

import java.util.List;

public class Diligenciar implements Task {
    List<DataDriveDemoQa> losdatos;
    public Diligenciar( List<DataDriveDemoQa> losdatos){
        this.losdatos=losdatos;
    }


    public static Diligenciar elFormulariocon(List<DataDriveDemoQa> losdatos) {
   return new Diligenciar(losdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(losdatos.get(Constantes.NUMERO).getName()).into(ObjetosWebForm.NAME),
                Enter.theValue(losdatos.get(Constantes.NUMERO).getLastName()).into(ObjetosWebForm.LASTNAME),
                Enter.theValue(losdatos.get(Constantes.NUMERO).getEmail()).into(ObjetosWebForm.EMAIL),
                Check.whether(losdatos.get(Constantes.NUMERO).getGender().equals("MALE"))
                        .andIfSo(Click.on(ObjetosWebForm.GENDERMALE))
                        .otherwise(Click.on(ObjetosWebForm.GENDERFEMALE)),
                Enter.theValue(losdatos.get(Constantes.NUMERO).getMobile()).into(ObjetosWebForm.USERNUMBER),
                Click.on(ObjetosWebForm.Hobbies),
                Enter.theValue(losdatos.get(Constantes.NUMERO).getCurrent()).into(ObjetosWebForm.CURRENT),
                Click.on(ObjetosWebForm.STATE),
                Enter.theValue(losdatos.get(Constantes.NUMERO).getState()).into(ObjetosWebForm.STATE1),
                Hit.the(Keys.ENTER).into(ObjetosWebForm.STATE1)
        );
    }



}
