package tests.Day17_TestNG_Framework_Assertion;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utulites.ConfigReader;
import utulites.Driver;

import static utulites.ReusableMethod.bekle;

public class C04_Assertions {

    @Test
    public void test01(){

        // amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        bekle(1);
        Driver.getDriver().navigate().refresh();

        // url'in amazon icerdigini test edelim
        String expectedUrl = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

        // aranacak kelimeyi aratalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime"));
        amazonPage.aramaKutusu.sendKeys(Keys.ENTER);
        bekle(2);

        // sonuclarin aranacak kelimeyi icerdigini test edelim
        String expectedIcerikSonuc = ConfigReader.getProperty("amazonAranacakKelime");
        String actualIcerikSonuz = amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualIcerikSonuz.contains(expectedIcerikSonuc));

        // ilk urune tiklayalim
        amazonPage.ilkUrunElementi.click();
        bekle(1);

        // ilk urun isminde aranacak kelime bulundugunu test edelim
        String expectedAranacakKelime = ConfigReader.getProperty("amazonAranacakKelime");
        String actualAranacakKelime = amazonPage.ilkUrunIsimElementi.getText();
        Assert.assertTrue(actualAranacakKelime.contains(expectedAranacakKelime));
        bekle(1);

        // sayfayi kapatalim
        Driver.closeDriver();
        bekle(2);

    }
}
