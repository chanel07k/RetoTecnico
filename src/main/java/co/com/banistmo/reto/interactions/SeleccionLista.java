package co.com.banistmo.reto.interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleccionLista implements Interaction {
    private Target lista;
    private String opcion;

    public SeleccionLista (Target lista, String opcion){
        this.lista = lista;
        this.opcion = opcion;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            List<WebElement> listObjeto = lista.resolveFor(actor).findElements(By.tagName("li"));
            for (int i=0;i<listObjeto.size();i++){
                if(listObjeto.get(i).getText().equals(opcion)){
                    listObjeto.get(i).click();
                    break;
                }
            }
            System.out.println(listObjeto);
            System.out.println(opcion);

    }
    public static SeleccionLista laLista(Target lista, String opcion){
        return new SeleccionLista(lista,opcion);
    }

}



