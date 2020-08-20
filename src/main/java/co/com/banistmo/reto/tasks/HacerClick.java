package co.com.banistmo.reto.tasks;

import co.com.banistmo.reto.interactions.SeleccionLista;
import co.com.banistmo.reto.model.BuscarData;
import co.com.banistmo.reto.userinterface.Registrar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

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
        actor.attemptsTo(
                SeleccionLista.laLista(Registrar.LIST_SERVICIOS,buscarData.get(0).getServicios()),
                SeleccionLista.laLista(Registrar.LIST_INFO,buscarData.get(0).getInfo()),
                SeleccionLista.laLista(Registrar.LIST_OBJPERFIDO,buscarData.get(0).getObjextraviado()));






    }
}
