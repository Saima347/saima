import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTest extends Setup {
       Homepage home;
       @BeforeMethod
    void setUpTest(){
      setupDriver("https://amazon.com"); ;
       home = PageFactory.initElements(driver, Homepage.class);
    }
    @Test
    void testDeals(){
        String actualText = home.dealsText();
    System.out.println(actualText);

    }
}
