package tests.day16_testNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.utilities.Driver;

public class C01_DriverClassKullanisi {
    @Test
    public void amazontest(){

        // amazona git
        Driver.getDriver().get("https://www.amazon.com");
        // nutella icin arama yap
        WebElement aramaKutusu= Driver.getDriver().findElement(By.id("twotabsearchtextbos"));
        //ilk urune click yap
        // urun isminin nutella iicerdigini test et

        Driver.closeDriver();// burada driveri kapattigiimiz icin sonraki teste driver calismaz cunku degeri null degil artik chrome driver

    }
    @Test
    public void youTubetest(){
        Driver.getDriver().get("https://www.youtube.com");

}
}