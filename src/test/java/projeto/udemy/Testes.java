package projeto.udemy;

import io.github.bonigarcia.wdm.OperatingSystem;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testes {

    static WebDriver driver;

    public static void main(String[] args) {
        testeFindBys();
    }

    static void testeFactory(){

        WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        PageObjects obj = new PageObjects(driver);

        obj.getInputEmail().sendKeys("icaroxxv@yahoo.com.br");
        obj.getInputPass().sendKeys("Jesus!337");
        obj.getButLogar().click();

    }

    static void testeFindBys(){

        WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        PageObjects obj = new PageObjects(driver);

        System.out.println(obj.getListaElementos().size());
        System.out.println(obj.getListaElementos());
        System.out.println(obj.getListaElementosErrados().size());
        System.out.println(obj.getListaElementosErrados());

    }
}
