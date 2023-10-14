package tests.Practice;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class C03_IphoneAramaTest {
    // amazonda iPhone 15 PRO icin arama yapin
    // Arama kutusunun locator'ina ihtiyacimiz var
    // locator'larimiz artik pages class'larinda
    // Locator'lar static olmadigi icin obje olusturarak kullanabiliriz
    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage= new AmazonPage();

        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime2"+ Keys.ENTER));
        Driver.closeDriver();

    }

}
