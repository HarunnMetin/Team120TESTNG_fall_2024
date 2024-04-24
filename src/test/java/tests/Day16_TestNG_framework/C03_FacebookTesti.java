package tests.Day16_TestNG_framework;

import org.testng.annotations.Test;
import utulites.Driver;

public class C03_FacebookTesti {

    @Test
    public void facebookTest(){

        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");
        //2- POM’a uygun olarak email, sifre kutularini ve giris
        //yap butonunu locate edin
        //3- Faker class’ini kullanarak email ve sifre
        //degerlerini yazdirip, giris butonuna basin
        //4- Basarili giris yapilamadigini test edin
    }
}
