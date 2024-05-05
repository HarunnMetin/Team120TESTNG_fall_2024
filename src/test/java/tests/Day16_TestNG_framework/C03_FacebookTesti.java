package tests.Day16_TestNG_framework;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utulites.Driver;
import utulites.ReusableMethod;

import static utulites.ReusableMethod.bekle;

public class C03_FacebookTesti {

    @Test(groups = "regrasyon")
    public void facebookTest(){

        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");
        bekle(2);

        //2- POM’a uygun olarak email, sifre kutularini ve

        Faker faker = new Faker();
        FacebookPage facebookPage = new FacebookPage();

        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        bekle(2);
        facebookPage.passwordKutusu.sendKeys(faker.internet().password());
        bekle(2);

        //giris yap butonunu locate edin
        facebookPage.loginButonu.click();
        bekle(2);

        //3- Faker class’ini kullanarak email ve sifre
        //degerlerini yazdirip, giris butonuna basin
        //4- Basarili giris yapilamadigini test edin

        Assert.assertTrue(facebookPage.girisYapilamadiElementYazisi.isDisplayed());


        ReusableMethod.tumSayfaFotografiCek("facebook");
        Driver.closeDriver();
    }
}
