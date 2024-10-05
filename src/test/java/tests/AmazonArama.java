package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class AmazonArama extends TestBaseRapor {

    // amazon anasayfaya gidin
    // arama kutusunun yanindaki dropdown menuyu locate edin
    // dropdown menudeki tum options listesini olusturup
    // menude Electronics basligi oldugunu test edin

    @Test
    public void test01(){


            extentTest=extentReports.createTest("DropDownTest", "Aranan Elementi Kontrol Et");
            Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        }

}
