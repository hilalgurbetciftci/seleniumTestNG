package tests.day15_TestNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.utilities.Driver;

public class C02_dependsOnMethods {

    // uc tane test methodu olusturun
    // 1. si amazon anasayfaya gidip url'in amazon icerdigini test edin
    // 2. nutella icin arama yapip arama sonuclarinin nutella icerdigini test edin
    // 3- ilk ürünü click yapip urun isminin Nutella icerdigini test edin

    @Test
    public void amazonTest(){
        Driver.getDriver().get("https://www.amazon.com");
        String expectedUrlIcerik="amazon";
        String actualUrlIcerik=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrlIcerik.contains(expectedUrlIcerik));

    }
    @Test(dependsOnMethods = "amazonTest")
    public void nutellaTest(){
        WebElement searchBox= Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella"+ Keys.ENTER);
        WebElement sonucYaziElement= Driver.getDriver().findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String expectedİcerik= "Nutella";
        String actualIcerik= sonucYaziElement.getText();
        Assert.assertTrue(actualIcerik.contains(expectedİcerik));

    }
    @Test(dependsOnMethods = "nutellaTest")
    public void ilkurunTest(){

        Driver.getDriver().findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//div[@class='a-section aok-relative s-image-square-aspect']")).click();
        WebElement urunIsımElement= Driver.getDriver().findElement(By.xpath("//span[@id='productTitle']"));

        String expectedİcerik= "Nutella";
        String actualIcerik= urunIsımElement.getText();
        Assert.assertTrue(actualIcerik.contains(expectedİcerik));
        Driver.closeDriver();


    }
}
