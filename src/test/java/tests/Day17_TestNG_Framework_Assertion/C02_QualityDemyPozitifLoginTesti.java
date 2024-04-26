package tests.Day17_TestNG_Framework_Assertion;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitDemiPage;
import utulites.ConfigReader;
import utulites.Driver;
import utulites.ReusableMethod;

import static utulites.ReusableMethod.bekle;

public class C02_QualityDemyPozitifLoginTesti {

    QualitDemiPage qualitDemiPage;
    @Test
    public void qualityDemiPozitifLoginTesti(){

        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        bekle(1);
        Driver.getDriver().navigate().refresh();

        //2- login linkine basin
        qualitDemiPage = new QualitDemiPage();
        qualitDemiPage.loginSayfasi.click();
        bekle(1);
        qualitDemiPage.cookieAccept.click();
        bekle(1);

        //3- Kullanici email'i olarak valid email girin
        qualitDemiPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliEmail"));
        bekle(1);

        //4- Kullanici sifresi olarak valid sifre girin
        qualitDemiPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        bekle(1);

        //5- Login butonuna basarak login olun
        qualitDemiPage.loginButonu.sendKeys(Keys.ENTER);
        bekle(1);

        //6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(qualitDemiPage.basariliGirisElementi.isDisplayed());

        ReusableMethod.tumSayfaFotografiCek("qdPozitifLogin");

        Driver.closeDriver();
    }
}
