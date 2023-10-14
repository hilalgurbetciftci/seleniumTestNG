package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utilities.Driver;

public class AmazonPage {
 /*
    TestNG page claslari
    sürekli kullandigimiz sayfa/websitesi'ndeki locate'leei
    ve ilgili sayfadaki kullanilacak login gibi basit method'lari
    icerir.

       TestNG page calss'larindaki locate'lere ulasmak icin Test class'larinda
       page class'indan obje olusturmasini benimsemistir.



     */

    public AmazonPage(){
        // baska page'taki class'larin bu constructor'u kullanabilmesi icin
        // acces modifier'ini public yapalim

        // bu page class'indan kullanacak tum class'lar
        // AmamzonPage Class'indan obje olusturmali
        // obje olusturmak icin mutlaka bu costructor calisacak
        // o zaman vebdriver'imizi tanımlama isini  bu constructor icinde yapmaliyiz

        PageFactory.initElements(Driver.getDriver(),this);
        // initElement deger tamak demek
    }
    @FindBy(id= "twotabsearchtextbox")

    public WebElement aramaKutusu ;

    @FindBy(xpath = "//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYaziElementi;

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "//span[@class='a-size-large product-title-word-break']")
    public WebElement ilkUrunIsimElementi;
    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement dropDownMenu;





}
