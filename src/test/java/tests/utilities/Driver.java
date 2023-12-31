package tests.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*
    JUnit'de WebDriver objesi TestBase'den geliyordu
    TestNG extends ile baglanma zorunlulugunu ortadan kaldirmak
    ve testi yazanlara daha fazla kontrol imkani vermek icin
    TestBase yerine Driver class'inda static 2 method ile
    driver olusturma ve kapatma islemlerini yapmayi tercih etmistir
    */
    public static WebDriver driver;// biz deger atamadigimiz için java default olarak null point eder
    private Driver(){

    }

    public static WebDriver getDriver(){
        /*
        dinamik olarak browser kullanmak icin configorations.properties dosyamizda
        browser = istenenBrowser seklinde tanımlama  yaptık

         */

        if (driver == null){
            String browser = ConfigReader.getProperty("browser");
            switch (browser){
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver=null;
        }
    }
    public static void quitDriver(){
        if (driver != null){
            driver.close();
            driver=null;
        }
    }
}
