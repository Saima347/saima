import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoqaTest extends Setup {

    Demoqa demoqa;

    @BeforeMethod
    void setUpHome() {
        setupDriver("https://demoqa.com/browser-windows");
        demoqa = PageFactory.initElements(driver, Demoqa.class);

    }

    @Test
    void GetTitle() {
        System.out.println(driver.getTitle());
        Assert.assertTrue(true);
    }
////            @Test
////            void ClickbutonsCheck () {
////                System.out.println(demoqa.GetText());
////               demoqa.Clickbutons();
////            }

    @Test
    void windowhandlingTest(){
        demoqa.presentTab();
        windowHandle(driver);
        Assert.assertTrue(demoqa.secondTabPage());
    }

    @Test
    void windowhandlingTests() {
        demoqa.newWindowPage();
        windowHandle(driver);
        Assert.assertTrue(demoqa.secondTabPage());
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
    }


}