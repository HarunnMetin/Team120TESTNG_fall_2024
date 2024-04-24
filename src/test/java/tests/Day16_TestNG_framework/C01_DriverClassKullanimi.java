package tests.Day16_TestNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utulites.Driver;

public class C01_DriverClassKullanimi {

    @Test
    public void amazonTest(){


        // amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // Nutella icin arama yapalim
        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

        // sayfayi kapatin
        Driver.closeDriver();
    }
}
