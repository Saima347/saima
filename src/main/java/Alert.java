import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Alert extends Setup {
    @FindBy(css = "[id=\"alertButton\"]")
    WebElement ClickButton;

    @FindBy(xpath = "//* [id=\"javascriptAlertsWrapper\"]/div[1]/div[1]/span")
    WebElement messege;

        String GetText() {
        ClickButton.click();
        driver.switchTo().alert().accept();
        return messege.getText();
    }
        void Clickbutons () {
            ClickButton.click();

        }
}
