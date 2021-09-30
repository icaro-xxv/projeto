package projeto.udemy.actions;

import org.openqa.selenium.WebDriver;
import projeto.udemy.objects.loginObjects;

public class loginActions {

    static loginObjects obj ;
    public loginActions(WebDriver driver){

        obj = new loginObjects(driver);

    }
        public static void login(){

            obj.getInputEmail().sendKeys("aafenabravetst@autoavaliar.com.br");
            obj.getInputPass().sendKeys("AAtst@2020");
            obj.getButtonLogin().click();
            obj.getClickVehicle().click();
            obj.getClickRegistration().click();


        }

}
