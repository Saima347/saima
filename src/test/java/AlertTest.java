import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertTest extends Setup {

    Alert alert;
    @BeforeMethod
    void setUpHome() {
        setupDriver("https://demoqa.com/alerts");
       alert= PageFactory.initElements(driver, Alert.class);

    }

    @Test
    void GetTitle() {
        System.out.println(driver.getTitle());
        Assert.assertTrue(true);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
            @Test
            void ClickbutonsCheck () {
            alert.Clickbutons();
                Assert.assertTrue(true);
            }

}
