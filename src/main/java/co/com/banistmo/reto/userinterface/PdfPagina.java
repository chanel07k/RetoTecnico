package co.com.banistmo.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PdfPagina extends PageObject {
    public static final Target CLICK_PDF = Target.the("Escribir idioma")
            .located(By.xpath("//*[@id='content']/div[1]/div/p[5]/a[1]/img"));

}
