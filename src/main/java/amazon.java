import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class amazon extends Setup{

    @FindBy(id = "searchDropdownBox")
    WebElement dropdown;
    @FindBy(xpath = "//a[@data-csa-c-content-id=\"nav_cs_amazonbasics\"]")
    WebElement amazonBasics;
    @FindBy(css = "[id=\"nav-link-accountList-nav-line-1\"]")
    WebElement accountText;
    String accountText(){
        return  accountText.getText();
    }

    void clickAmazonBasics(){
        amazonBasics.click();
    }
    @FindBy(xpath = "//div[@class=\"navFooterVerticalColumn navAccessibility\"]/div/div/ul/li/a")
    List<WebElement> helperLinks;
    void clickHelperLinks(WebDriver dr) {
        for (WebElement a: helperLinks) {
            a.click();
//            waitForVisibility(dr, 7, a);
//            driver.navigate().to("https://amazon.com");
        }
    }

    void selectCategory(){
        selectDropdown(dropdown, 10);
    }
   @FindBy(css = "[id=\"nav-link-accountList-nav-line-1\"]")
    WebElement accountlist;
    @FindBy(css = "h1[class='a-spacing-small']")
    WebElement signIn;

    void Clickaccountlist(){
        accountlist.click();
    }


}
