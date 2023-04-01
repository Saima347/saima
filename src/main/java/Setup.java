import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.*;

public class Setup {
    WebDriver driver;
    Actions actions;


    void setupDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_mac_arm64 (2)/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();

        driver.get(url);
    }

    void quitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    void moveMouse(WebDriver dr, WebElement element) {
        Actions actions = new Actions(dr);
        actions.moveToElement(element).perform();
    }

    void doubleClick(WebDriver dr, WebElement element) {
        Actions actions = new Actions(dr);
        actions.moveToElement(element).perform();
    }

    private void action1(WebDriver dr) {
        actions = new Actions(dr);
    }

    void rightClick(WebDriver dr, WebElement element) {
        action1(dr);
        actions.contextClick(element).perform();

    }

    public void selectDropdown(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void ScrollDown(WebDriver dr, String script) {
        JavascriptExecutor js = ((JavascriptExecutor) dr);
        js.executeScript(script);
    }

    void waitForVisibility(WebDriver dr, int time, WebElement element) {
        WebDriverWait wait = new WebDriverWait(dr, time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    void waitForClickable(WebDriver dr, int time, WebElement element) {
        WebDriverWait wait = new WebDriverWait(dr, time);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    void  Timeout( WebDriver dr){
        dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);}
//    void  Iftame(WebDriver dr,String id){
//        dr.switchTo().frame(id);
//    }

    void windowHandle(WebDriver dr){
        Set<String> otherWindow = dr.getWindowHandles();
        String currentWindow = dr.getWindowHandle();

        for(String s : otherWindow){
            if( s != currentWindow){
                dr.switchTo().window(s);
            }
        }

    }
}
