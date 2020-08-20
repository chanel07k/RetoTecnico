package co.com.banistmo.reto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Switch implements Interaction {


    public static Switch TheWindow() {
        return Tasks.instrumented(Switch.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String Parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();
        for (String child : allWindows) {
            if (!Parent.equalsIgnoreCase(child)) {
                driver.switchTo().window(child);

            }
        }
    }


}