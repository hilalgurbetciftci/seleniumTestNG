package tests.utilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import java.time.Duration;
public class TestBaseCross {
    protected WebDriver driver;
    @Parameters("browser")
    @BeforeMethod
    public void setUp(@Optional String browser){
        driver= utilities.DriverCross.getDriver(browser);
    }
    @AfterMethod
    public void tearDown(){
        utilities.DriverCross.closeDriver();
    }
}
