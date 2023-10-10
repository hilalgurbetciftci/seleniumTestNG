package tests.day16_testNG_framework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import tests.utilities.Driver;

public class C05_qualityDemyNegatifLoginTest {
    @Test
    public void gecersizPasswordTest(){
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        //2- login linkine basin

        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginlink.click();
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com"+ Keys.ENTER);
        qualitydemyPage.passwordKutusu.sendKeys("12345"+Keys.ENTER);
        qualitydemyPage.sonLogin.click();
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void gecersizEmailTest(){
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        //2- login linkine basin

        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginlink.click();
        qualitydemyPage.emailKutusu.sendKeys("aaanevzatcelik@gmail.com"+ Keys.ENTER);
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032"+Keys.ENTER);
        qualitydemyPage.sonLogin.click();
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void gecersizEmailvePasswordTest(){
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        //2- login linkine basin

        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginlink.click();
        qualitydemyPage.emailKutusu.sendKeys("aaanevzatcelik@gmail.com"+ Keys.ENTER);
        qualitydemyPage.passwordKutusu.sendKeys("Nevzccwat152032"+Keys.ENTER);
        qualitydemyPage.sonLogin.click();
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        Driver.closeDriver();
    }
}
