package pratik;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_amazonDropDown {
    @Test
    public void amazonDD(){
        // amazon ana sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //arama kutusunun yanindaki kategori menusunun 45 elementten olustugunu test edin
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.dropDownMenu.click();
        Select select= new Select(amazonPage.dropDownMenu);
        String[] expectedMenuArr={"All Departments, Arts & Crafts, Automotive, Baby, Beauty & Personal Care, " +
                "Books, Boys' Fashion, Computers, Deals, Digital Music, Electronics, Girls' " +
                "Fashion, Health & Household, Home & Kitchen, Industrial & Scientific, " +
                "Kindle Store, Luggage, Men's Fashion, Movies & TV, Music, CDs & Vinyl, " +
                "Pet Supplies, Prime Video, Software, Sports & Outdoors, Tools & Home Improvement, " +
                "Toys & Games, Video Games, Women's Fashion"};

        List<String> expectedMenuList= Arrays.asList(expectedMenuArr);
        List<WebElement> allKategori= select.getOptions();
        List<String> actualdropDownTumList= new ArrayList<>();

        for (WebElement each: allKategori
             ) {
            System.out.println(each.getText());
            actualdropDownTumList.add(each.getText());

        }
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(actualdropDownTumList,expectedMenuList);

        // tüm kategorileri getirin
        int expectedSize=45;
        int actualSize= actualdropDownTumList.size();
        softAssert.assertEquals(actualSize,expectedSize);
        softAssert.assertAll();




    }

}
