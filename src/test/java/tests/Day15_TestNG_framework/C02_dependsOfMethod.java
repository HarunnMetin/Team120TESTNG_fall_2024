package tests.Day15_TestNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utulites.Driver;

import static utulites.ReusableMethod.bekle;

public class C02_dependsOfMethod {


    // uc tane test method'u olusturun
    // 1- amazonTest : amazon anasayfaya gidip url'in amazon icerdigini test edelim
    // 2- nutellaTest : Nutella icin arama yapip arama sonuclarinin Nutella icerdigini test edelim
    // 3- ilkUrunTesti : ilk urunu click yapip, urun isminin Nutella icerdigini test edin


    /*
    DependsOnMethods priority'den farklidir

        DependsOnMethods hangi method'un once calisacagina karar vermez
        Sadece yazildigi test calismadan once, baglandigi testin
        calistigindan ve PASSED oldugundan emin olmak ister.

        bagli oldugu test calismaz veya calisir ama PASSED olmazsa
        DependsOnMethods'un yazildigi test IGNORE olur

        DependsOnMethods yazildigi method tek basina calistirilmak istenirse
        once bagli oldugu testin calismasi ve Passed olmasi gerektiginden
        kendinden once bagli oldugu method'un calismasini saglar

        Ama bu baglanti birden fazla method'u calistirmaz.

        priority kullanilarak bir method'un once calismasi istense de
        o method onceligi bagli oldugu method'a devreder
        bagli olunan method da baska method'a bagliysa once onu calistirir.
     */

    @Test
    public void amazonTest() throws InterruptedException {
        Driver.getDriver().get("https://www.amazon.com");
        bekle(2);
        Driver.getDriver().navigate().refresh();

        String expectedUrl = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
    @Test(dependsOnMethods = "amazonTest")
    public void nutellaTest(){

        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        WebElement sonucYazisi = Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedSonuc = "Nutella";
        String actualSonuc = sonucYazisi.getText();
        Assert.assertTrue(actualSonuc.contains(expectedSonuc));


    }
    @Test(priority = -1,dependsOnMethods = "nutellaTest")
    public void ilkUrunTest(){

        WebElement ilkUrun = Driver.getDriver().findElement(By.xpath("(//img[@class='s-image'])[1]"));
        ilkUrun.click();

        WebElement ilkUrunIsimKontrol = Driver.getDriver().findElement(By.xpath("//span[@id='productTitle']"));
        String expectedUrunIsim = "Nutella";
        String actualUrunIsim = ilkUrunIsimKontrol.getText();
        Assert.assertTrue(actualUrunIsim.contains(expectedUrunIsim));


        Driver.closeDriver();
    }
}
