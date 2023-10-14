package tests.Practice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;
import tests.utilities.ReusableMethods;

public class C05_QualityDemy {
    //1- https://www.qualitydemy.com/ anasayfasina gidin
    //2- login linkine basin
    // 3- Kullanici email'i olarak valid email girin
    // 4- Kullanici sifresi olarak valid sifre girin
    // 5- Login butonuna basarak login olu
    // 6- Basarili olarak giris yapilabildigini test edin
    @Test
    public void test01(){
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qUrl"));
        //2- login linkine basin
        QualitydemyPage qualitydemyPage= new QualitydemyPage();

        qualitydemyPage.ilkLoginlink.click();
        // 3- Kullanici email'i olarak valid email girin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliEmail"));
        // 4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        // 5- Login butonuna basarak login olu
        qualitydemyPage.coocies.click();
        ReusableMethods.bekle(5);
        qualitydemyPage.sonLogin.click();
        // 6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGiris.isDisplayed());
        Driver.closeDriver();

    }
}
