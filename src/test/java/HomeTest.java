import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class HomeTest extends Setup {
    Homepage home;

    @AfterMethod
    void closeBrowser() throws InterruptedException {
        quitBrowser();
    }

    @BeforeMethod
    void setUpTest() {
        setupDriver("https://homedepot.com/");
        home = PageFactory.initElements(driver, Homepage.class);
    }

    @Test
    void test() {

        home.cartpage();
        String actualUrl = driver.getCurrentUrl();

    }

//  @Test
//    void Checlsearchbar(){
//         home.searchbar();
//         String actualUrl = driver.getCurrentUrl();
//  }

    @Test
    void list() {

        home.list();
        String actualUrl = driver.getCurrentUrl();
    }

    @Test
    void singin() {
        home.singin();
        String actualUrl = driver.getCurrentUrl();

    }

    @Test
    void Towel() {
        home.Towel();
        String actualUrl = driver.getCurrentUrl();
    }

    @Test
    void logo() {
        home.logo();
        String actualUrl = driver.getCurrentUrl();

    }

    @Test
    void Checkecosmart() {
        home.ecosmart.click();

    }

    @Test
    void GiftCard() {
        home.GiftCards();
        String actualUrl = driver.getCurrentUrl();
    }

    void flushhide() throws InterruptedException {
        home.flushhide();
        Thread.sleep(2000);
    }

    @Test
    void CheckOrder() {
        home.CheckOrder.getText();
    }

    @Test
    void StoreFinder() throws InterruptedException {
        home.StoreFinder.getLocation();
        Thread.sleep(5000);

    }

    @Test
    void CreditServices() {
        home.CreditServices();
        String actualUrl = driver.getCurrentUrl();
    }

    @Test
    void Shoppinglink() {
        moveMouse(driver, home.Shoppinglink);
        String actualUrl = driver.getCurrentUrl();
    }

    @Test
    void validateCopyRight() throws InterruptedException {
        boolean a = home.checkCopyRight(driver);
        Assert.assertTrue(a);
        Thread.sleep(5000);
    }


    @Test
    void validateCopyRightText() {
        Assert.assertFalse(home.copyRightText(driver).contains("2025"));
    }
    @Test
    void validroom() throws InterruptedException {
        boolean a = home.checkCopyRight(driver);
        Assert.assertTrue(a);
        Thread.sleep(5000);
    }

    @Test
    void validroomtext() {
        Assert.assertFalse(home.copyRightText(driver).contains("Bedroom"));
    }
    @Test
    void vaildProductGrid() {
        Assert.assertFalse(driver.getCurrentUrl().equals("https://homedepot.com"));
    }

    @Test
    void CustomerService() {
        home.CreditServices.click();
    }

    @Test
    void Delivery() {
        home.Delivery.click();

    }

    @Test
    void validateNumberOfLinks() {
        int number = home.linkText().size();
        Assert.assertEquals(number, 18);
    }

    @Test
    void validateIndividualLinks() {
        ArrayList<String> links = home.linkText();
        System.out.println(links);
        Assert.assertFalse(links.contains("HUSKY" +
                "lifeproof" +
                "HOME"));
    }

    @Test
    void clickFooter() {
        home.sisterSites.clear();
    }

    @Test
    void validAllDepartments() throws InterruptedException {
        boolean a = home.CheckAllDepartments(driver);
        Assert.assertTrue(a);
        Thread.sleep(5000);
    }

    @Test
    void CopyAllDepartmentsText() {
        Assert.assertFalse(home.copyAllDepartments(driver).contains("Tools"));
    }

    @Test
    void Localshop() {
        doubleClick(driver, home.LocalShop);
    }

    @Test
    void checkemail() throws InterruptedException {
        home.email.sendKeys("saima20@gmail.com");
        Thread.sleep(4000);

    }

    @Test
    void checkscroll() throws InterruptedException {
        ScrollDown(driver, "window.scroll(0,8000)");
        String actualUrl = driver.getCurrentUrl();
        Thread.sleep(3000);
    }

    @Test
    void checkshoppinglocation() {
        home.shoppinglocation.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Test
    void Checkzipcode() {
        synchronized (home.zipcode) {
//            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
   @Test
    void checkitem(){
       synchronized (home.item) {

       }
   }

   @Test
    void Checkvissani(){
        home.checkvissani();
       String actualUrl = driver.getCurrentUrl();

   }
    @Test
    void CheckHDX() {
        doubleClick(driver, home.HDX);
        String actualUrl = driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    void Checksecurity(){
        rightClick(driver, home.security);
        String actualUrl = driver.getCurrentUrl();
    }
    @Test
    void Checksitemap(){
        home.sitemap.isDisplayed();
        String actualUrl = driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    @Test
    void Checkdefiant(){
      home.defiant.isDisplayed();
    }

    @Test
    void checkcookie(){
        home.cookie.isDisplayed();
    }
    @Test
    void validdecor() throws InterruptedException {
        Thread.sleep(3000);

    }

    @Test
    void validdecorText() {
        Assert.assertFalse(home.copyRightText(driver).contains("Art Prints"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}

