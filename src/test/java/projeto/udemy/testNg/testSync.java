package projeto.udemy.testNg;

import io.github.bonigarcia.wdm.OperatingSystem;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testSync {

    public static WebDriver driver;

    //public static void main(String[] args) throws InterruptedException {

        //syncTest();
    //}


    @BeforeClass
     static void syncTest() throws InterruptedException {

        WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();

        driver = new ChromeDriver();

        driver.get("http://sync-homolog.autoavaliar.com.br/");

        driver.manage().window().maximize();

        Thread.sleep(2000);
    }

        @Test
        static void Test() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='input_0']")).sendKeys("aafenabravetst@autoavaliar.com.br");
        driver.findElement(By.xpath("//input[@id='input_1']")).sendKeys("AAtst@2020");
        driver.findElement(By.xpath("//button[@type='button']")).click();

        Thread.sleep(20000);

        driver.findElement(By.xpath("//div[contains(@class,'dropr')]")).click();
        driver.findElement(By.xpath("//a[contains(@ng-if,'root')]")).click();
        Thread.sleep(20000);
        //driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/md-card/div/div/div/div/div/div/div/div[2]/div[2]/div/div/form/div/div/div[1]/md-input-container']")).click();
        driver.findElement(By.xpath("//input[contains(@validate-on,'blu')]")).sendKeys("FTT7895");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@ng-disabled,'$roo')]")).click();
        driver.findElement(By.xpath("/md-select[contains(@ng-change,'onChangeEntity')]")).click();
        driver.findElement(By.xpath("//input[contains(@ng-model,'searchTer')]")).sendKeys("AA FENABRAVE");
        driver.findElement(By.xpath("//md-option[contains(@id,'select_option_172')]")).click();




    }

}
