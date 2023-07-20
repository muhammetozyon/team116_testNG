package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class QdPage {

    public QdPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//*[@id='login-email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//*[@id='login-password']")
    public WebElement passwordKutusu;


    @FindBy(xpath = "(//*[@type=\"submit\"])[2]")
    public WebElement loginButonu;


    @FindBy(xpath = "(//a[text()='My courses'])[1]")
    public WebElement basariliGirisKontrolElementi;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cookiesElementi;

}