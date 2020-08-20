package co.com.banistmo.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Registrar extends PageObject {

    public static final Target LIST_SERVICIOS = Target.the("Escribir idioma")
            .located(By.xpath("//*[@id='menutop']/ul"));
    public static final Target LIST_INFO = Target.the("Escribir idioma")
            .located(By.xpath("//*[@id='menutop']/ul/li[3]/ul"));
    public static final Target LIST_OBJPERFIDO = Target.the("Escribir idioma")
            .located(By.xpath("//*[@id='menutop']/ul/li[3]/ul/li[1]/ul"));



}
