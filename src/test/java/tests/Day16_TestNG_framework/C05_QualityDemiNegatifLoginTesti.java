package tests.Day16_TestNG_framework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitDemiPage;
import utulites.Driver;

import static utulites.ReusableMethod.bekle;

public class C05_QualityDemiNegatifLoginTesti {

    QualitDemiPage qualitDemiPage;
    @Test
    public void gecersizPasswordTesti(){

        qualitDemiPage = new QualitDemiPage();
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitDemiPage.loginSayfasi.click();
        bekle(2);
        qualitDemiPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        bekle(1);
        qualitDemiPage.passwordKutusu.sendKeys("4389f39f3");
        bekle(1);
        qualitDemiPage.loginButonu.sendKeys(Keys.ENTER);
        bekle(1);

        Assert.assertTrue(qualitDemiPage.emailKutusu.isDisplayed());

        Driver.closeDriver();

    }
    @Test
    public void gecersizEmailTesti(){

        qualitDemiPage = new QualitDemiPage();
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitDemiPage.cookieAccept.click();
        bekle(1);
        qualitDemiPage.loginSayfasi.click();
        bekle(1);
        qualitDemiPage.emailKutusu.sendKeys("fywr.4343@gmail.com");
        bekle(1);
        qualitDemiPage.passwordKutusu.sendKeys("Nevzat152032");
        bekle(1);
        qualitDemiPage.loginButonu.sendKeys(Keys.ENTER);
        Assert.assertTrue(qualitDemiPage.emailKutusu.isDisplayed());

    }
    @Test
    public void gecersizPasswordVeEmailTesti(){

        qualitDemiPage = new QualitDemiPage();
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitDemiPage.cookieAccept.click();
        bekle(1);
        qualitDemiPage.loginSayfasi.click();
        bekle(1);
        qualitDemiPage.emailKutusu.sendKeys("fywr.4343@gmail.com");
        bekle(1);
        qualitDemiPage.passwordKutusu.sendKeys("89324h8nf2");
        bekle(1);
        qualitDemiPage.loginButonu.sendKeys(Keys.ENTER);
        Assert.assertTrue(qualitDemiPage.emailKutusu.isDisplayed());
    }

    

}
