package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.AbrirPage;
import util.Constantes;

import static util.Constantes.URL;

public class Abrir implements Task {
     AbrirPage abrirPage;

    public static Abrir laPagina() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
           actor.attemptsTo(
                   Open.browserOn(abrirPage)
           );
    }
}
