package co.com.banistmo.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Comprobar implements Question<Boolean> {
    private String Verificar;

    public Comprobar(String Verificar) {
        this.Verificar = Verificar;
    }

    public static Comprobar ThePDF(String Verificar) {
        return new Comprobar(Verificar);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).getDriver().getCurrentUrl().contains(Verificar);}

}

