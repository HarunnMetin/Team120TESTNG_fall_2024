package tests.Day15_TestNG_framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import utulites.Driver;

public class C02_dependsOfMethod {


    // uc tane test method'u olusturun
    // 1- amazonTest : amazon anasayfaya gidip url'in amazon icerdigini test edelim
    // 2- nutellaTest : Nutella icin arama yapip arama sonuclarinin Nutella icerdigini test edelim
    // 3- ilkUrunTesti : ilk urunu click yapip, urun isminin Nutella icerdigini test edin

    @Test
    public void amazonTest(){
        Driver.getDriver().get("https://www.amazon.com");

        String expectedUrl = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
    @Test(dependsOnMethods = "amazonTest")
    public void nutellaTest(){

    }
    @Test(dependsOnMethods = "nutellaTest")
    public void ilkUrunTest(){


    }
}
