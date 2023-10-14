package tests.day18_xmlFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroAppPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_SoftAssertion {
    @Test
    public void zeroAppTesti(){
        //Yeni bir Class Olusturun : C03_SoftAssert

        //1. “http://zero.webappsecurity.com/” Adresine gidin

        //2. Sign in butonuna basin
        //3. Login kutusuna “username” yazin
        //4. Password kutusuna “password” yazin
        //5. Sign in tusuna basin
        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        //7. “Purchase Foreign Currency” tusuna basin
        //8. “Currency” drop down menusunden Eurozone’u secin
        //9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        //"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        //(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        //(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        //(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"







        //1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroAppUrl"));

        //2. Sign in butonuna basin
        ZeroAppPage zeroAppPage = new ZeroAppPage();
        zeroAppPage.ilkSignInButonu.click();
        //3. Login kutusuna “username” yazin
        zeroAppPage.loginKutusu.sendKeys(ConfigReader.getProperty("zeroUsername"));

        //4. Password kutusuna “password” yazin
        zeroAppPage.passwordKutusu.sendKeys(ConfigReader.getProperty("zeroPassword"));
        //5. Sign in tusuna basin
        zeroAppPage.signInButonu.click();
        Driver.getDriver().navigate().back();
        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        zeroAppPage.onlineBankingLinki.click();
        zeroAppPage.payBillsLinki.click();
        //7. “Purchase Foreign Currency” tusuna basin
        zeroAppPage.purchaseFCurrencyElementi.click();
        //8. “Currency” drop down menusunden Eurozone’u secin
        zeroAppPage.pcCurrencyDropdown.click();
        //9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
        Select select= new Select(zeroAppPage.pcCurrencyDropdown);
        select.selectByValue("EUR");
        SoftAssert softAssert= new SoftAssert();
        String expectedValue= "Eurozone (euro)";
        String actualValue= select.getFirstSelectedOption().getText();
        softAssert.assertTrue(expectedValue.contains(actualValue));
        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        String[] dropDownElementArr = { "Select One", "Australia (dollar)", "Canada (dollar)", "Switzerland (franc)",
                "China (yuan)", "Denmark (krone)", "Eurozone (euro)", "Great Britain (pound)",
                "Hong Kong (dollar)", "Japan (yen)", "Mexico (peso)", "Norway (krone)",
                "New Zealand (dollar)", "Sweden (krona)", "Singapore (dollar)", "Thailand (baht)"};
        List<String> expectedDropdownElementList= Arrays.asList(dropDownElementArr);
        List<WebElement> dropDownWebElementList= select.getOptions();
        List<String> actualDropDownList= new ArrayList<>();
        for (WebElement each: dropDownWebElementList
             ) {
           actualDropDownList.add(each.getText());

        }
        softAssert.assertEquals(expectedDropdownElementList,actualDropDownList);
        Driver.closeDriver();
        //"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        //(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        //(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        //(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"
    }





}
