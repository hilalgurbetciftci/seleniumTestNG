package tests.day16_testNG_framework;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import tests.utilities.Driver;

public class C04_QualitydemyPozitifLogin {
    @Test
    public void pozitifLoginTest(){
        //qdGecerliUsername = anevzatcelik@gmail.com
        //qdGecerliPassword = Nevzat152032
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        //2- login linkine basin

        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.cookies.click();
        qualitydemyPage.ilkLoginlink.click();
        // 3- Kullanici email’i olarak valid email girin
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com"+ Keys.ENTER);
        // 4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032"+Keys.ENTER);
        // 5- Login butonuna basarak login olun
        qualitydemyPage.sonLogin.click();
        // 6- Basarili olarak giris yapilabildigini test edin BU EKSİK KALDI YAP
    }
}
