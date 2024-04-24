package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulites.Driver;

public class FacebookPage {

    public FacebookPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailKutusu;
    @FindBy(xpath = "//input[@id='pass']")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//a[@id='u_0_0_St']")
    public WebElement yeniHesapOlusturButonu;
}
