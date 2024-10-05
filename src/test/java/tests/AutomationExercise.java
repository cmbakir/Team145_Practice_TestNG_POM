package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AEPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationExercise {

    @Test
    public void test01() {

        //Driver penceresi acilip adrese gidilir
        Driver.getDriver().get("https://automationexercise.com");

        // Kullanici assertion islemini islem sonunda yapabilecegi gibi
        // islem devam ederken de yapabilir

        SoftAssert softAssert = new SoftAssert();
        String expectedUrl = "https://automationexercise.com";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl, "Anasayfada degilsiniz");

        Faker faker = new Faker();
        AEPage aePage = new AEPage();
        aePage.singupLink.click();
        ReusableMethods.bekle(2);
        aePage.signupName.sendKeys("Murat");
        aePage.signupMail.sendKeys("murat12337@gmail.com");
        aePage.signupButton.click();
        ReusableMethods.bekle(2);



        Driver.quitDriver();

    }
}

