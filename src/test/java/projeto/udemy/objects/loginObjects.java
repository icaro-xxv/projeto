package projeto.udemy.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginObjects {

    private WebDriver driver;

    @FindBy(xpath="//input[@id='input_0']")
    private WebElement inputEmail;

    @FindBy(xpath="//input[@id='input_1']")
    private WebElement inputPass;

    @FindBy(css="button[type='button']")
    private WebElement buttonLogin;

    @FindBy(xpath="//div[contains(@class,'dropr')]")
    private WebElement clickVehicle;

    @FindBy(xpath="//a[contains(@ng-if,'root')]")
    private WebElement clickRegistration;




    public loginObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(WebElement inputEmail) {
        this.inputEmail = inputEmail;
    }

    public WebElement getInputPass() {
        return inputPass;
    }

    public void setInputPass(WebElement inputPass) {
        this.inputPass = inputPass;
    }

    public WebElement getButtonLogin() {
        return buttonLogin;
    }

    public void setButtonLogin(WebElement buttonLogin) {this.buttonLogin = buttonLogin;}

    public WebElement getClickVehicle() {
        return clickVehicle;
    }

    public void setClickVehicle(WebElement clickVehicle) {
        this.clickVehicle = clickVehicle;
    }

    public WebElement getClickRegistration() {
        return clickRegistration;
    }

    public void setClickRegistration(WebElement clickRegistration) {
        this.clickRegistration = clickRegistration;
    }
}
