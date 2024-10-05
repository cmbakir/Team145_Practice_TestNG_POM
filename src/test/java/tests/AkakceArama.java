package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AkakcePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.lang.reflect.Array;
import java.util.*;

public class AkakceArama {

    // akakce anasayfaya gidin
    // arama kutusunun locate edin
    // arama kutusuna "iPhone 16 Pro Max" yazip arattirin
    // solda cep telefonu sekmesine tiklayin
    //soldaki 256 gb checkbox'a tiklayin
    // arama sonucunda urunlerin bulunmabilirligini test edin

    // arama sonucunda kac urun bulundugunu bir List e kaydedin
    // kaydedilen urunleri kucukten buyuge siraliyin
    //en ucuz urunun fiyatini ve websayfasini yazdirin
    // pencereleri kapatin


    @Test
    public void test01(){


        Driver.getDriver().get(ConfigReader.getProperty("akakceUrl"));

        AkakcePage akakcePage = new AkakcePage();
        akakcePage.aramaKutusu.click();
        akakcePage.aramaKutusu.sendKeys("iPhone 16 Pro Max" + Keys.ENTER);
        ReusableMethods.bekle(2);
       // JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
       // WebElement dahiliHafiza= Driver.getDriver().findElement(By.xpath("(//*[@class='fl-ac'])[3]"));

       //  jse.executeScript("","");

       //  jse.executeScript("arguments[0].scrollIntoView({block: 'center’}); ", dahiliHafiza);

        //akakcePage.checkBox256gb.click();

        //akakcePage.checkBox256gb.click();


        akakcePage.ceptelefonuSekmesi.click();
        ReusableMethods.bekle(2);

        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

       // js.executeScript("","");

       // js.executeScript("arguments[0].scrollIntoView({block: 'center’}); ", akakcePage.dahiliHafiza);

      //  akakcePage.checkBox256gb.click();

        //Actions actions = new Actions(Driver.getDriver());
       // actions.sendKeys(Keys.PAGE_DOWN).perform();
       // actions.sendKeys(Keys.PAGE_DOWN).perform();
       // actions.sendKeys(Keys.PAGE_DOWN).perform();
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
       //actions.sendKeys(Keys.PAGE_DOWN).perform();

        //akakcePage.dahiliHafiza.click();

        List<WebElement> urunFiyatlariListesiElementi =
                Driver.getDriver().findElements(By.xpath("//*[@class='pt_v8']"));

       List<String> stringListe = ReusableMethods.getElementsText(urunFiyatlariListesiElementi);
       Collections.sort(stringListe);
        System.out.println(stringListe);




        Driver.quitDriver();

    }


}
