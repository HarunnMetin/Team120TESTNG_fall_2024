package tests.Day16_TestNG_framework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitDemiPage;
import utulites.Driver;

import static utulites.ReusableMethod.bekle;

public class C04_QualityDemiPozitifLogin {

    @Test
    public void pozitifLoginTesti(){

        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        bekle(2);

        //2- login linkine basin
        QualitDemiPage qualitDemiPage = new QualitDemiPage();
        qualitDemiPage.loginSayfasi.click();
        bekle(1);
        qualitDemiPage.cookieAccept.click();
        bekle(1);

        //3- Kullanici email'i olarak valid email girin
        qualitDemiPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        bekle(3);
        //4- Kullanici sifresi olarak valid sifre girin
        qualitDemiPage.passwordKutusu.sendKeys("Nevzat152032");
        bekle(2);
        //5- Login butonuna basarak login olun
        qualitDemiPage.loginButonu.sendKeys(Keys.ENTER);
        bekle(2);
        //6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(qualitDemiPage.basariliGirisElementi.isDisplayed());
    }
}
