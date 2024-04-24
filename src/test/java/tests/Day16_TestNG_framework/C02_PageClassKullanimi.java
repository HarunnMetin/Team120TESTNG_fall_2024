package tests.Day16_TestNG_framework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utulites.Driver;

import static utulites.ReusableMethod.bekle;

public class C02_PageClassKullanimi {

    @Test
    public void nutellaTesti() throws InterruptedException {



        // amazona gidelim

        Driver.getDriver().get("https://www.amazon.com");
        bekle(3);
        Driver.getDriver().navigate().refresh();


        // Nutella icin arama yapalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


        // arama sonuclarinin Nutella icerdigini test edelim
        String expectedAramaSonucu = "Nutella";
        String actualAramaSonuycu = amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualAramaSonuycu.contains(expectedAramaSonucu));

        // driver'i kapatalim
        Driver.closeDriver();
    }
}
