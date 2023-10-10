package tests.day17TestNGFramework_assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class C01_ConfigurationsPropertiesKullanimi {
    @Test
    public void test01(){
        // azanona git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl")); // parantezin icine configuration.properties
        // dosyasindan amazonurl'yi getirecek birseyler yazilmali
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("aranacakKelime")+ Keys.ENTER);

        // arama kutusuna aramak istenilen yaz ve arat

        String expectedIcerik=ConfigReader.getProperty("aranacakKelime");
        String actualIcerik= amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
        // arama sonuclarinin aranan kelimeyi icerdigini test edin
        // sayfayi kapatin
        Driver.closeDriver();

    }
}
