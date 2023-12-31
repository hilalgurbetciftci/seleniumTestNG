package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

public class QualitydemyPage {
    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Log in")
    public WebElement ilkLoginlink;
    @FindBy(xpath = "//*[@onclick='cookieAccept();']")
    public WebElement coocies;
    @FindBy(id = "login-email")
    public WebElement emailKutusu;
    @FindBy(id = "login-password")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement sonLogin;
    @FindBy(linkText = "My courses")
    public WebElement basariliGiris;
}
