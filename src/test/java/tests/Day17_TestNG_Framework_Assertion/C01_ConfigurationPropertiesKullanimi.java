package tests.Day17_TestNG_Framework_Assertion;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utulites.ConfigReader;
import utulites.Driver;

import static utulites.ReusableMethod.bekle;
import static utulites.ReusableMethod.tumSayfaFotografiCek;

public class C01_ConfigurationPropertiesKullanimi {

    @Test
    public void test01(){

        // amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // parantezin icin configuration.properties dosyasindan amazonUrl'i
        // bana getirecek bir seyler yazmam lazim

        bekle(1);
        Driver.getDriver().navigate().refresh();


        // arama kutusuna aranacak kelimeyi yazdirin ve aratin

        AmazonPage amazonPage= new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime"));
        bekle(1);
        amazonPage.aramaKutusu.sendKeys(Keys.ENTER);


        // arama sonuclarinin aranan kelimeyi icerdigini test edin

        String expectedSonuc = ConfigReader.getProperty("amazonAranacakKelime");
        String actualSonuc = amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonuc.contains(expectedSonuc));

        // sayfayi kapatin
        tumSayfaFotografiCek("confugReader");

        Driver.closeDriver();
    }
}
