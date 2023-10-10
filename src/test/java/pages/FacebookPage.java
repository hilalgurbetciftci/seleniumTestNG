package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id= "email")
    public WebElement emailKutusu;
    @FindBy(id="pass")
    public  WebElement passwordKutusu;
    @FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement loginButon;
    @FindBy(xpath = "//div[class='-9ay7']")
    public WebElement girisYpilamadi;

}
