import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demoqa extends Setup{
//    @FindBy(css = "[id=\"alertButton\"]")
//    WebElement ClickButton;
//
//    @FindBy (xpath = "//* [id=\"javascriptAlertsWrapper\"]/div[1]/div[1]/span")
//    WebElement messege;

    @FindBy(xpath = "//button[@id='tabButton']")
    WebElement tab;

    void presentTab() {
        tab.click();
    }
    @FindBy(xpath ="//h1[@id='sampleHeading']")
    WebElement secondTab;
    boolean secondTabPage(){
        return secondTab.isDisplayed();
    }
    @FindBy(xpath = "//button[@id='windowButton']")
    WebElement newwindow;
    void newWindowPage(){
        newwindow.click();
    }

//    String GetText() {
//        ClickButton.click();
//        driver.switchTo().alert().accept();
//        return messege.getText();
//    }
//        void Clickbutons () {
//            ClickButton.click();
//
//        }

    }