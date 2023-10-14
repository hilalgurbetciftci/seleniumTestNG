package tests.Practice;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

public class C04_Faker {
    //1 - https://www.facebook.com/ adresine gidin
    //2- POM’a uygun olarak email, sifre kutularini ve giris
    //yap butonunu locate edin
    //3- Faker class’ini kullanarak email ve sifre
    //degerlerini yazdirip, giris butonuna basin
    //4- Basarili giris yapilamadigini test edin

    @Test
    public void test01(){
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));

        //2- POM’a uygun olarak email, sifre kutularini ve giris
        //yap butonunu locate edin
        //3- Faker class’ini kullanarak email ve sifre
        Faker faker= new Faker();
        FacebookPage facebookPage= new FacebookPage();
        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passwordKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButon.click();
        //degerlerini yazdirip, giris butonuna basin
        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.emailKutusu.isDisplayed());
        Driver.closeDriver();


    }


}
