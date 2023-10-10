package tests.day16_testNG_framework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.utilities.Driver;

public class C02_PageClassKullanimi {
    @Test
    public void nutellaTest(){
        // amazona git
        Driver.getDriver().get("https://www.amazon.com");
        // nutella icin arama yap
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // urun isminin nutella iicerdigini test et
        //driveri kapat
        String expectedIcerik="Nutella";
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
        Driver.closeDriver();

    }
}
