package tests.Day16_TestNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utulites.Driver;

import static utulites.ReusableMethod.bekle;

public class C01_DriverClassKullanimi {

    @Test(groups = "smoke")
    public void amazonTest() throws InterruptedException {


        // amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().navigate().refresh();
        bekle(3);

        // Nutella icin arama yapalim
        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

        // sayfayi kapatin
        Driver.closeDriver();
    }

    @Test(groups = {"smoke","regression"})
    public void youtubeTesti(){

        Driver.getDriver().get("https://www.youtube.com");

        Driver.closeDriver();
    }
}
