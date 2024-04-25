package utulites;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReusableMethod {

    public static void bekle(int saniye) {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void tumSayfaFotografiCek( String resimAdi){

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmm");
        String tarihEtiketi = ldt.format(formatter);
        String dinamikDosyaYolu = "target/Screenshot/"+resimAdi+tarihEtiketi+".jpg";

        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();

        File tumSayfaScreenShoot = new File(dinamikDosyaYolu);

        File geciciDosya = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geciciDosya,tumSayfaScreenShoot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void webelementFotografiCek(WebElement webElement, String resimAdi){

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmm");
        String tarihEtiketi = ldt.format(formatter);
        String dinamikDosyaYolu = "target/Screenshot/"+resimAdi+tarihEtiketi+".jpg";


        File tumSayfaScreenShoot = new File(dinamikDosyaYolu);

        File geciciDosya = webElement.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geciciDosya,tumSayfaScreenShoot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
