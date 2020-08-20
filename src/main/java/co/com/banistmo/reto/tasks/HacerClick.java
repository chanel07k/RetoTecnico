package co.com.banistmo.reto.tasks;

import co.com.banistmo.reto.interactions.SeleccionLista;
import co.com.banistmo.reto.userinterface.Registrar;
import co.com.banistmo.reto.model.BuscarData;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.WebElement;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class HacerClick implements Task {

    private List<BuscarData> buscarData;

    public HacerClick(List<BuscarData> buscarData) {
        this.buscarData = buscarData;
    }


    public static HacerClick ServiciosPage(List<BuscarData> buscardata) {
        return Tasks.instrumented(HacerClick.class, buscardata);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(buscarData.get(0).getservicios.));


    }
}
