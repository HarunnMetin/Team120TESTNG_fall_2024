package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulites.Driver;

public class QualitDemiPage {

    public QualitDemiPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='btn btn-sign-in-simple']")
    public WebElement loginSayfasi;
    @FindBy(xpath = "//a[text()='Accept']")
    public WebElement cookieAccept;
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement emailKutusu;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;
    @FindBy(xpath = "(//a[text()='My courses'])[1]")
    public WebElement basariliGirisElementi;
}
