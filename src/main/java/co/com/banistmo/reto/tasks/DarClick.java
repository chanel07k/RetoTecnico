package co.com.banistmo.reto.tasks;

import co.com.banistmo.reto.userinterface.PdfPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DarClick implements Task {

    public static DarClick AbrirPDf() {
        return Tasks.instrumented(DarClick.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PdfPagina.CLICK_PDF));

    }
}
