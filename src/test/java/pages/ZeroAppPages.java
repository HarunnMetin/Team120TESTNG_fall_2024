package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulites.Driver;

public class ZeroAppPages {

    public ZeroAppPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement singInButonu;
    @FindBy(xpath = "//input[@id=\"user_login\"]")
    public WebElement loginKutusu;
    @FindBy(xpath = "//input[@id=\"user_password\"]")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//input[@name=\"submit\"]")
    public WebElement girisYap;
}
