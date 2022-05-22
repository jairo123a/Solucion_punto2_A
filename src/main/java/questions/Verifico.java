package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ObjetosWebForm;

public class Verifico implements Question<Boolean> {

    String pregunta;
    public Verifico(String pregunta){
        this.pregunta=pregunta;
    }

    public static Verifico laRespuestaConEl(String pregunta){

        return new Verifico(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String respuesta;
        respuesta= Text.of(ObjetosWebForm.DUBMITTING).viewedBy(actor).asString();
        if(respuesta.equals(pregunta)){
            return true;
        }else
        {
            return false;
        }
    }
}
