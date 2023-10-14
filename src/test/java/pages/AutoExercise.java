package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

import java.awt.*;

public class AutoExercise {


    public AutoExercise() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUp;
    @FindBy(xpath = "//*[@*='name']")
    public WebElement name;
    @FindBy (xpath = "//input[@data-qa='signup-email']")
    public WebElement email;
    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement login;
    @FindBy (id = "id_gender2")
    public WebElement gender;

    @FindBy (xpath = "//input[@data-qa='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement fisrtName;
    @FindBy(xpath = "//*[@id='last_name']")
    public WebElement lastName;
    @FindBy(xpath = "//*[@id='address1']")
    public WebElement adress1;
    @FindBy (xpath = "//input[@data-qa='address']")
    public WebElement address;

    @FindBy (xpath = "//input[@data-qa='state']")
    public WebElement state;

    @FindBy (xpath = "//input[@data-qa='city']")
    public WebElement city;

    @FindBy (xpath = "//input[@data-qa='zipcode']")
    public WebElement zipcode;

    @FindBy (xpath = "//input[@data-qa='mobile_number']")
    public WebElement mobileNumber;

    @FindBy (xpath = "//select[@data-qa='country']")
    public WebElement country;

    @FindBy (xpath = "//button[@data-qa='create-account']")
    public WebElement createAccount;


}
