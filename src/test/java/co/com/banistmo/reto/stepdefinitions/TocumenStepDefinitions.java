package co.com.banistmo.reto.stepdefinitions;

import co.com.banistmo.reto.interactions.Switch;
import co.com.banistmo.reto.model.BuscarData;
import co.com.banistmo.reto.questions.Comprobar;
import co.com.banistmo.reto.tasks.HacerClick;
import co.com.banistmo.reto.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TocumenStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Ingreso a la pagina de tocumen$")
    public void ingresoALaPaginaDeTocumen()  {
        OnStage.theActorCalled("Kristelle").wasAbleTo(OpenUp.ThePage());

    }


    @Cuando("^Hago click en SERVICIOS/INFORMACION DEL VIAJERO/OBJETOS EXTRAVIADOS$")
    public void hagoClickEnSERVICIOSINFORMACIONDELVIAJEROOBJETOSEXTRAVIADOS(List<BuscarData> buscardata)  {
        OnStage.theActorInTheSpotlight().attemptsTo(HacerClick.ServiciosPage(buscardata),(Switch.TheWindow()));

    }

    @Entonces("^Deberia abrirse el archivo (.*)$")
    public void deberiaAbrirseElArchivoAaaaa(String Verificar)  {
        OnStage.theActorInTheSpotlight().should(seeThat(Comprobar.ThePDF(Verificar)));

    }

}
