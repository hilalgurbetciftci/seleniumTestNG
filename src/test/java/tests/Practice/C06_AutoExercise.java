package tests.Practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExercise;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;
import tests.utilities.ReusableMethods;

public class C06_AutoExercise {
    @Test
    public void test01(){
        //https://automationexercise.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));
        // signup/login butonuna basın
        AutoExercise autoExercise= new AutoExercise();
        autoExercise.signUp.click();
        // isim girin
        autoExercise.name.sendKeys(ConfigReader.getProperty("name"));
        // email girin
        autoExercise.email.sendKeys(ConfigReader.getProperty("email"));
        // hesap olustur butonuna basin
        autoExercise.login.click();
        // cinsiyeti secin
        autoExercise.gender.click();
        // pasword girin
        autoExercise.password.sendKeys(ConfigReader.getProperty("password"));
        //adres bilgileri icin first name girin
        autoExercise.fisrtName.sendKeys(ConfigReader.getProperty("firstName"));
        //adres bilgileri icin last name girin
        autoExercise.lastName.sendKeys(ConfigReader.getProperty("lastName"));
        //adres bilgileri adres girin
        autoExercise.address.sendKeys(ConfigReader.getProperty("adres"));
        //adres bilgileri city girin
        autoExercise.city.sendKeys(ConfigReader.getProperty("city"));
        // adres bilgisi icin ulke secimi yapin
        Select select= new Select(autoExercise.country);
        select.selectByValue("Canada");
        //select.selectByValue(ConfigReader.getProperty("country"));
        //adres bilgileri state girin
        autoExercise.state.sendKeys(ConfigReader.getProperty("state"));
        //adres bilgileri zipkode girin
        autoExercise.zipcode.sendKeys(ConfigReader.getProperty("zipCode"));
        //adres bilgileri city girin
       // autoExercise.mobileNumber.sendKeys(ConfigReader.getProperty("mobileNumber"+Keys.ENTER));
        autoExercise.mobileNumber.sendKeys("902126547896"+ Keys.ENTER);


        //basarili giris yapildigini test edin



        Driver.closeDriver();




    }
}
