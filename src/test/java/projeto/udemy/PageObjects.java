package projeto.udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class PageObjects {

    private WebDriver driver;

    @FindBy(id="email")
    private WebElement inputEmail;

    @FindBy(name="pass")
    private WebElement inputPass;

    @FindBy(css="div._6ltg")
    private WebElement butLogar;

    @FindBys({
        @FindBy(css="div.id"),
        @FindBy(id="u_f_b_es"),
        @FindBy(css="div.placeholder"),
        @FindBy(id="u_f_g_Ny")
    })

    private List<WebElement> listaElementos;

    @FindBys({
            @FindBy(css ="div.mbm"),
            @FindBy(id="div"),
            @FindBy(name="lastname")
    })

    private List<WebElement> listaElementosErrados;



    public PageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        //PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
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

    public WebElement getButLogar() {
        return butLogar;
    }

    public void setButLogar(WebElement butLogar) {
        this.butLogar = butLogar;
    }

    public List<WebElement> getListaElementos() {
        return listaElementos;
    }

    public void setListaElementos(List<WebElement> listaElementos) {
        this.listaElementos = listaElementos;
    }

    public List<WebElement> getListaElementosErrados() {
        return listaElementosErrados;
    }

    public void setListaElementosErrados(List<WebElement> listaElementosErrados) {
        this.listaElementosErrados = listaElementosErrados;
    }
}
