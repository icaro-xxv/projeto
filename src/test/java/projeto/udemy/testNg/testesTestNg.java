package projeto.udemy.testNg;

import io.github.bonigarcia.wdm.OperatingSystem;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import projeto.udemy.actions.loginActions;
import projeto.udemy.actions.registrationActions;

import java.util.concurrent.TimeUnit;

public class testesTestNg {


    static WebDriver driver;
    static loginActions actLogin;
    static registrationActions actRegistration;



    @BeforeClass

        static void abrirBrowser() {


            //WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();
            WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

            //driver = new FirefoxDriver();
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);

            driver.get("https://sync-homolog.autoavaliar.com.br/");

            driver.manage().window().maximize();

            //Instanciar Actions

            actLogin = new loginActions(driver);
            actRegistration = new registrationActions(driver);

        }

        @Test
        void VehicleSync()  {

          loginActions.login();
          registrationActions.registration();

        }

            }



    //@AfterClass

    //static void fecharBrowser(){

        //driver.quit();




