package tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

import java.time.Duration;

public class C02_DependsOn {
    //Birbirine bağımlı testler oluşturun
    //before ve after class ile setup ayaralarını yapın
    //Birbirine bağlı testlerle
    //önce wisequarter'a gidin
    //wisequarter adresine gidebilirse oradan amazon.com adresine gitsin
    //amazon.com adresine gidebilirse google adresine gitsin
    //driver kapatsın

    @BeforeClass
    public static void setUp(){


    }

    @Test
    public void test01(){
        //önce wisequarter'a gidin
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));


    }
    @Test (dependsOnMethods = "test01")
    public void test02(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Test(dependsOnMethods = "test02")
    public void test03(){
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

    }
    @AfterClass
    public static void tearDown(){
       Driver.closeDriver();
    }
}
