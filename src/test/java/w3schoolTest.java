import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class w3schoolTest extends Setup{
    w3school school ;
    @BeforeMethod
    void setUpHome() {
        setupDriver("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
       school= PageFactory.initElements(driver, w3school.class);

    }
    @Test
    void firstnameTest(){
        driver.switchTo().frame("iframeResult");
        school.firstnamePage();
        }
    @Test
   void lastnameTest(){
        driver.switchTo().frame("iframeResult");
        school.lastnamePage();
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
   }



    @Test
    void submitTest() {
        driver.switchTo().frame("iframeResult");
        school.submitPage();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }



}
