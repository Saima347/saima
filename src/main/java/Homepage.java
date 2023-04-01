import net.bytebuddy.implementation.bind.annotation.AllArguments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Homepage extends Setup {
    @FindBy(xpath = "//div[@class=\"Header3__group Customer\"]/div[2]")
    WebElement cart;
    @FindBy(css = "[class=\"SearchBox__buttonIcon\"]")
    WebElement searchbar;
    @FindBy(xpath = "//img[@alt=\"Bath Towels\"]")
    WebElement Towel;
    @FindBy(id = "Action/Favorite-UnSelected")
    WebElement list;
    @FindBy(xpath = "//span[@class=\"bttn__content--e4t5c\"]")
    WebElement singin;

    @FindBy(css = "[class=\"HeaderLogo\"]")
    WebElement logo;
    @FindBy(xpath = "//*[@id=\"footer\"]/nav/div[2]/ul/li[15]/a/img")
    WebElement ecosmart;
    @FindBy(xpath = "//ul[@id=\"TasklinkList\"]/li[4]/a")
    WebElement GiftCard;
    @FindBy(xpath = "//div[@class=\"grid flush hide show--sm\"]/div/ul/li[4]")
    WebElement flushhide;
    @FindBy(id = "B2CCheckOrder")
    WebElement CheckOrder;
    @FindBy(xpath = "//ul[@id=\"TasklinkList\"]/li[1]/a")
    WebElement StoreFinder;
    @FindBy(xpath = "//ul[@id=\"TasklinkList\"]/li[5]")
    WebElement CreditServices;
    @FindBy(xpath = "//ul[@class=\"ShoppingLinks\"]/li[3]/a")
    WebElement Shoppinglink;
    @FindBy(xpath = "//div[@class=\"DeliveryZipInline__button--block\"]")
    WebElement Delivery;
    @FindBy(xpath = "//p[@class=\"u__legal u--paddingBottom\"]")
    WebElement copyRight;
    @FindBy(css = "[class=\"homeDecorFurnitureFlyout__link homeDecorFurnitureFlyout__link--active\"]")
    WebElement room;

    @FindBy(xpath = "//ul[@class=\"footer__brands\"]/li")List<WebElement>  sisterSites;
    @FindBy(xpath = "//div[@class=\"MessageBarText u__normal\"]")
    WebElement productGrid;
    @FindBy(xpath = "//ul[@class=\"ShoppingLinks\"]/li[1]/a")
    WebElement AllDepartments;
    @FindBy(xpath = "//div[@class=\"breadcrumbs__nowrap--cosdh\"]/div[2]")
    WebElement CustomerService;
    @FindBy(xpath = "//div[@class=\"shop-by-category__content\"]/div[1]/a")
    WebElement LocalShop;
    @FindBy(xpath="//p [@class=\"footerEmailSignup__controlGroup\"]/button[1]")
    WebElement email;
    @FindBy(xpath = "//div[@class=\"grid grid--center-verticle\"]")
    WebElement scroll ;
    @FindBy(css = "[class=\"MyStore__label\"]")
    WebElement shoppinglocation;
    @FindBy(css = "[class=\"zipCode\"]")
    WebElement zipcode;
    @FindBy(css = "[class=\"DeliveryZipDropDown__form--input\"]")
    WebElement dropdown;
    @FindBy(css = "class=\"Header3__groupItem Header3__groupItem--center MyCartHeader\"")
    WebElement item;
    @FindBy(css = "[alt=\"Vissani\"]")
    WebElement vissani ;
    @FindBy(css = "[title=\"Privacy & Security Statement\"]")
    WebElement  security;
    @FindBy(css = "[alt=\"HDX\"]")
    WebElement HDX;
    @FindBy(css = "[title=\"Site Map\"]")
    WebElement sitemap;
    @FindBy(css = "[alt=\"Defiant\"]")
    WebElement defiant;
    @FindBy(css = "[title=\"Cookie Usage\"]")
    WebElement cookie;
    @FindBy(css = "[class=\"homeDecorFurnitureFlyout__link homeDecorFurnitureFlyout__link--active\"]")
    WebElement decor;
    



    boolean checkdecor(WebDriver dr1) {
        moveMouse(dr1, decor);
        boolean copy = decor.isDisplayed();
        return copy;
    }
    String decortext(WebDriver dr1){
        moveMouse(dr1,decor);
        return decor.getText();
    }
    void Checkdcookie(){
        cookie.isDisplayed();
    }
    void Checkdefiant(){
        defiant.click();
    }

    void Checksitemap(){
       sitemap.click();
    }
    void CheckHDX(WebDriver dr ) {
        doubleClick(dr, HDX);

    }
 void Checksecurity(){
        security.click();
 }

    void checkvissani(){
        vissani.isDisplayed();
    }

    void setCopyRight(){
        item.click();
    }
    void checkshoopinglocation(){
        shoppinglocation.click();
    }

    void checkscroll(){
        scroll.clear();
    }
    void cartpage() {
        cart.click();
    }
    boolean Towel() {
        return singin.isDisplayed();
    }
//    void searchbarkey(){
//        searchbar.sendKeys("Mirror");
//
//    }
    void list() {
        list.click();
    }

    boolean singin() {
        return singin.isDisplayed();
    }

    void logo() {
        logo.getText();
    }

    void ecosmart() {
        ecosmart.click();
    }

    void GiftCards() {
        GiftCard.click();
    }

    void flushhide() {
        flushhide.getText();
    }

    String CheckOrderText() {
        return CheckOrder.getText();
    }

    boolean StoreFinderText() {
        return StoreFinder.isDisplayed();
    }

    String CreditServices() {
        return CreditServices.getText();

    }

    boolean checkCopyRight(WebDriver dr1) {
        moveMouse(dr1, copyRight);
        boolean copy = copyRight.isDisplayed();
        return copy;
    }
    String copyRightText(WebDriver dr1){
        moveMouse(dr1, copyRight);
        return copyRight.getText();
    }
    boolean checkroom(WebDriver dr1) {
        moveMouse(dr1, room);
        boolean copy = room.isDisplayed();
        return copy;
    }
    String roomtext(WebDriver dr1){
        moveMouse(dr1,room);
        return room.getText();
    }
     void productGridClick(WebDriver dr){
        doubleClick(dr ,productGrid);

     }
    void CustomerService(WebDriver dr){
        doubleClick(dr ,CustomerService);

    }
    void AllDepartmentsClick(WebDriver dr ){
      doubleClick(dr,Delivery);

    }

    ArrayList<String> linkText() {
        ArrayList<String> text = new ArrayList<>();

        for (WebElement a : sisterSites) {
            text.add(a.getText());
        }
        return text;
    }
    void clickLinks(){
        for(WebElement a : sisterSites){
            a.click();
            driver.navigate().to("https://homedepot.com");
        }
    }

    boolean CheckAllDepartments(WebDriver dr1) {
        moveMouse(dr1, AllDepartments);
        boolean copy = AllDepartments.isDisplayed();
        return copy;
    }
    String copyAllDepartments(WebDriver dr1){
        moveMouse(dr1, AllDepartments);
        return AllDepartments.getText();
    }

    void LocalShop(WebDriver dr ) {
        doubleClick(dr, LocalShop);

    }
   void email(){
        email.click();

   }

  void Checksearchbar(){
        searchbar.click();
  }
  void powerTools(){
        powerTools();
  }
    void Checkzipcode(){
        zipcode.click();
    }
    }
























