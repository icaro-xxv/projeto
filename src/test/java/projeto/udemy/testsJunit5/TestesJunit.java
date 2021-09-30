package projeto.udemy.testsJunit5;

import io.github.bonigarcia.wdm.OperatingSystem;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import projeto.udemy.actions.loginActions;

class TestesJunit {

    static WebDriver driver;
    static loginActions actLogin;
    //static cadastrodashActions actdash;

    @BeforeAll
    static void abrirBrowser(){

      //WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
        WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();

      driver = new FirefoxDriver();

      driver.get("https://sync-homolog.autoavaliar.com.br/");

      driver.manage().window().maximize();

      //Instanciar Actions

        actLogin = new loginActions(driver);
        //actdash = new cadastrodashActions(driver);


  }

   @Test

    void loginSync(){

        loginActions.login();


   }

   @AfterAll

    static void fecharBrowser(){

        driver.quit();
   }




}
