package projeto.udemy.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationObjects {



    private WebDriver driver;


    @FindBy(xpath="//input[contains(@validate-on,'blu')]")
    private WebElement inputPlate;
    @FindBy(xpath="//button[contains(@ng-disabled,'$roo')]")
    private WebElement clickAccept;
    @FindBy(xpath = "//md-select[contains(@ng-change,'onChangeEntity')]")
    private WebElement clickDealer;
    @FindBy(xpath = "//input[contains(@ng-model,'searchTer')]")
    private WebElement inputDealer;
    @FindBy(xpath = "//md-option[contains(@id,'select_option_172')]")
    private WebElement clickNewDealer;


    public registrationObjects(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    public WebElement getInputPlate() {
        return inputPlate;
    }

    public void setInputPlate(WebElement inputPlate) {
        this.inputPlate = inputPlate;
    }

    public WebElement getClickAccept() {
        return clickAccept;
    }

    public void setClickAccept(WebElement clickAccept) {this.clickAccept = clickAccept;}

    public WebElement getClickDealer() {return clickDealer;}

    public void setClickDealer(WebElement clickDealer) {this.clickDealer = clickDealer;}

    public WebElement getInputDealer() {return inputDealer;}

    public void setInputDealer(WebElement inputDealer) {this.inputDealer = inputDealer;}

    public WebElement getClickNewDealer() {return clickNewDealer;}

    public void setClickNewDealer(WebElement clickNewDealer) {this.clickNewDealer = clickNewDealer;}

}
