package projeto.udemy.actions;
import org.openqa.selenium.WebDriver;
import projeto.udemy.objects.registrationObjects;

public class registrationActions {


    static registrationObjects obj;

    public registrationActions(WebDriver driver) {

        obj = new registrationObjects(driver);


    }

    public static void registration()  {


        obj.getInputPlate().sendKeys("FTT7785");
        obj.getClickAccept().click();
        obj.getClickDealer().click();
        obj.getInputDealer().sendKeys("AA FENABRAVE");
        obj.getClickNewDealer().click();

    }
}
