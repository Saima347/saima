import com.beust.ah.A;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class amazontest extends Setup {
    amazon Amazon;

    @BeforeMethod
    void setUpTest() {
        setupDriver("https://amazon.com/");
        Amazon = PageFactory.initElements(driver, amazon.class);

    }


    @Test
    void validateCategory() throws InterruptedException {
        Amazon.selectCategory();
        Thread.sleep(10000);
    }

    @Test
    void checkaccount() throws InterruptedException {
        ScrollDown(driver, "window.scroll(0,7000)");
        String actualUrl = driver.getCurrentUrl();
        Thread.sleep(3000);
    }
    @Test
    void clickHelper(){
       Amazon.helperLinks.clear();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    void CheckAmazonbasic(){
     Amazon.clickAmazonBasics();
    }
    @Test
    void Checkaccounttext(){
        Amazon.accountText();
    }

}
