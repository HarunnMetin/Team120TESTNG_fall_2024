package tests.Day17_TestNG_Framework_Assertion;

import org.testng.annotations.Test;
import utulites.ConfigReader;
import utulites.Driver;
import utulites.ReusableMethod;

public class C03_DriverSingletonPattern {

    @Test
    public void test01(){

        /*
         Page Object Model(POM) kapsaminda
            locate'ler, test datalari ve WebDriver'i dinamiklestirdik
            hepsinin POM tarafindan belirlenen erisim sekilleri var

            ornegin locate'lere obje olusturarak, webDriver'a ise static yolla ulasiyoruz

            POM dizayn edenler Driver class'indan obje olusturularak
            WebDriver kullanimini engellemek icin
            Singleton Pattern kullanmislar

            Singleton Pattern bir class'dan obje olusturulmasini
            engelleyen yontemlerden birisi

            Singleton pattern default constructor'i gorunur yapip
            access modifier'ini private yaparak
            constructor'a erisimi, dolayisiyla da obje olusturmayi engeller


        Driver driver = new Driver();
        driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethod.bekle(2);

        driver.closeDriver();

         */
    }
}
