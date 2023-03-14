import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
     @FindBy(css ="[data-csa-c-content-id=\"nav_cs_bestsellers\"]" )
     WebElement bestseller ;


     String dealsText() {

         return bestseller.getText();


     }


}
