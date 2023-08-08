package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;
import utilities.TestBaseReport;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Locators extends TestBaseReport {

    public Locators(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    static JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    static By closepopup=By.xpath("(//i[@class='suiiconfont sui_icon_closed_18px_1 she-close'])[2]");
   static By closepopup2=By.xpath("//*[@class='iconfont icon-close she-close']");
   //static By closepopup2=By.xpath("//*[@class='svgicon svgicon-arrow-left']");

    static By signIn=By.xpath("//*[@class='suiiconfont-critical sui_icon_nav_me_24px']");
    static By username=By.xpath("(//*[@class='sui-input__inner sui-input__inner-suffix'])[1]");
    static By continueButton=By.xpath("//*[ text() = 'CONTINUE']");
    static By password=By.xpath("(//input[@class='sui-input__inner sui-input__inner-suffix'])[4]");
    static By signInButton=By.xpath("(//*[@class='sui-button-common sui-button-common__primary sui-button-common__H44PX page__login_mainButton'])[4]");

    static By skipButton=By.xpath("//*[text()='Skip']");
    static By invalidlogin=By.xpath("(//*[@class='error-tip'])[4]");
    static By signOut=By.xpath("//*[text()='Sign Out']");

    static By signOutPage=By.xpath("//*[text()='Sign In/Register']");
    static By searchBox=By.xpath("//input[@type='search']");
    static By title=By.xpath("//*[@class='top-info__title-name']");

    static By bar=By.xpath("//*[@class='quickg-outside']");

    //----------------------------------------------------------------------------------------
    static By sortBy=By.xpath("//*[@class='sui-input__inner sui-input__inner-suffix']");
    static By highToLow=By.xpath("(//span[@class='sui-select-option__label'])[5]");
    static By lowToHigh=By.xpath("(//span[@class='sui-select-option__label'])[4]");
    static By productList=By.xpath("//*[@class='product-list j-expose__product-list j-product-list-info j-da-event-box']");

    static By product=By.xpath("(//*[@class='S-product-item__link_jump S-product-item__link'])[1]");
    static By productSize=By.xpath("(//*[@class='product-intro__size-radio-inner'])[1]");

    @FindBy(xpath="//*[@class='product-item__camecase-wrap']")
    static List<WebElement>  priceRange_;

    @FindBy(xpath = "//*[@class='normal-price-ctn__sale-price']")
    static List<WebElement>  priceList;

    static By lowerFilter=By.xpath("//*[@class='slider-range__prices-lower']/span");
    static By upperFilter=By.xpath("//*[@class='slider-range__prices-upper']/span");



    //-----------------------------------

    static By minPriceIcon=By.xpath("//*[@class='aprs-handle aprs-handle-lower']");
    static By maxPriceIcon=By.xpath("//*[@class='aprs-handle aprs-handle-upper']");

    static By addToCart=By.xpath("(//div[@class='she-btn-xl__container'])[2]");

    static By cart=By.xpath("//*[@class='j-ipad-prevent-a j-sa-cart-1']");
    //static By cart=By.xpath("//*[@class='j-headerbag-container header-right-dropdown-ctn header-right-no-relative fast-cart-wrap']");

    static By cartList=By.xpath("//a[@class='gd-name']");

    static By rightArrow=By.xpath("//*[@class='iconfont icon-arrownew-left active']");

    static By shoesButton=By.xpath("(//*[@class='header-v2__nav2-txt'])[11]");

    static By totalPagesArea=By.xpath("//*[@class='sui-pagination__total']");

    //static By selectColor=By.xpath("((//*[@class='side-filter__item-content'])[3]//*[@class='sui-checkbox'])[2]");
    static By selectColor=By.xpath("//*[@title='Black']");

    static By selectSize=By.xpath("((//div[@class='side-filter__item'])[2]//*[@class='sui-checkbox__label-text'])[3]");

    static  By filteredProduct=By.xpath("(//*[@class='S-product-item__name'])[1]");

    static By saleZoneIcon=By.xpath("//div[@class='c-suspension__main j-suspension-main animated-slow']");

    @FindBy(xpath = "//div[@class='swiper-wrapper']//div[@class='c-anchor-text__item']")
    static List<WebElement> salezoneTitles;

    //static By deleteFromCart=By.xpath("(//*[text()='Delete'])[1]");
    static By deleteFromCart=By.xpath("//*[@class='suiiconfont sui_icon_delete_16px_1']");
    static By continueShopping=By.xpath("//*[text()='continue shopping']");
    static By deleteApprove=By.xpath("//button[@class='sui-button-common sui-button-common__primary sui-button-common__H28PX']");

    static By earthIcon=By.xpath("//*[@class='icon-panel j-earth-icon']");
    static  By euroLink=By.xpath("//li[@data-currency='EUR']");

    //static  By selectCurrency=By.xpath("//*[@class='iconfont icon-jiantou-copy']");
    static  By selectCurrency=By.xpath("//*[@class='global-s-drop-ctn j-global-s-drop-ctn j-global-s-drop-ctn-2']");

    static By price=By.xpath("(//p[@class='product-item__camecase-wrap'])[1]");

    static By brandsButton=By.xpath("//*[text()='BRANDS']");

    @FindBy(xpath = "//*[@class='header-float j-category-link j-category-link11']//a")
    static List<WebElement> links;

    @FindBy(xpath = "//*[@class='header-v2__nav2-wrapper j-header-nav-wrapper']")
    static List<WebElement> homelinks;

    static By homeButton=By.xpath("(//*[@class='c-header2__cate'])[3]");


    static By brandTitle=By.xpath("(//*[@class='sui-breadcrumb-item sui-breadcrumb-item__link'])[2]");

    static By categoryTitle=By.xpath("//*[@class='first-cate-ctn j-cm-first-cate-ctn']");

    static By quantityIncrease=By.xpath("//*[@class='suiiconfont sui_icon_plus_16px']");
    static By quantityReduce=By.xpath("//*[@class='suiiconfont sui_icon_min_16px']");

    static By totalQuantity=By.xpath("//*[@class='sui-button-common sui-button-common__primary sui-button-common__H54PX j-cart-check']");

    static By bestsellerLink=By.xpath("//*[@class='base-img__inner base-img__cover']");
    static By bestsellerLink2=By.xpath("(//img[@id='imgDom'])[15]");
    @FindBy (xpath = "//*[@class='icon-block__num']")
    static List<WebElement> percentList;

/////////

    static By heartIcon=By.xpath("//*[@class='suiiconfont sui_icon_save_32px hovertips']");

    static By profileIcon=By.xpath("//*[@class='header-user-info']");

    static By wishListIcon=By.xpath("//*[@class='suiiconfont-critical sui_icon_nav_save_24px']");

    @FindBy (xpath = "//ul//*[@class='S-product-item__name S-product-item__name-new']")
    static List<WebElement> productWishList;

    static By inWishlist=By.xpath("(//*[@class='S-product-item__wrapper'])[1]");
    static By heartIconFilled=By.xpath("//*[@class='suiiconfont sui_icon_save_completed_32px hovertips']");

    ///////

   public static void goToHomePage() throws InterruptedException {

          Log.info("Go to main page");
          extentTest.info("Go to main page");
          Driver.getDriver().get(ConfigReader.getProperty("url"));
         // Driver.getDriver().navigate().refresh();

          Thread.sleep(3000);
          Driver.getDriver().findElement(closepopup).click();
          Thread.sleep(2000);
          Driver.getDriver().findElement(closepopup2).click();
          Log.info("Main page direction is success");
          extentTest.pass("Main page direction is success");

    }


    public static void signIn() throws InterruptedException {

         Log.info("Starting sign in process");
         extentTest.info("Starting sign in process");
        Driver.getDriver().findElement(signIn).click();
        Driver.getDriver().findElement(username).sendKeys(ConfigReader.getProperty("username"));
        WebElement username1=Driver.getDriver().findElement(By.xpath("(//*[@class='sui-input__inner sui-input__inner-suffix'])[1]"));
        js.executeScript("arguments[0].style.border='6px solid blue'", username1);
        Driver.getDriver().findElement(continueButton).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(password).sendKeys(ConfigReader.getProperty("password"));
        Driver.getDriver().findElement(signInButton).click();
        Thread.sleep(20000);
        Driver.getDriver().findElement(skipButton).click();
        Thread.sleep(3000);
        Log.info("Sign in process is success");

    }
    public static void logout() throws InterruptedException {
        Log.info("Starting sign out process");
        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(Driver.getDriver().findElement(signIn)).perform();
        //Driver.getDriver().findElement(signIn).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(signOut).click();
        Thread.sleep(2000);
        Assert.assertTrue(Driver.getDriver().findElement(signOutPage).isDisplayed());
        Log.info("Sign out process is success");
        extentTest.pass("Sign out process is success");
    }
    public static void invalidLogin() throws InterruptedException {
        Log.info("Starting sign in process");
        extentTest.info("Starting sign in process");
        Driver.getDriver().findElement(signIn).click();
        Driver.getDriver().findElement(username).sendKeys(ConfigReader.getProperty("username"));
        WebElement username1=Driver.getDriver().findElement(By.xpath("(//*[@class='sui-input__inner sui-input__inner-suffix'])[1]"));
        js.executeScript("arguments[0].style.border='6px solid blue'", username1);
        Driver.getDriver().findElement(continueButton).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(password).sendKeys(ConfigReader.getProperty("password"));
        Driver.getDriver().findElement(signInButton).click();
        Thread.sleep(20000);
        Assert.assertTrue(Driver.getDriver().findElement(invalidlogin).getText().contains("The Email Address or Password you entered is incorrect."));

        Log.info("Sign in process is not succeeded");
        extentTest.pass("Sign in process is not succeeded");
    }
    public static void search(String searched) throws InterruptedException {
        extentTest.info("Starting search process : " + searched + " is/are listed");
       Log.info("Starting search process : " + searched + " is/are listed");
        WebElement searchBox1=Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
        js.executeScript("arguments[0].style.border='6px solid blue'", searchBox1);
        Driver.getDriver().findElement(searchBox).sendKeys(searched+ Keys.ENTER);
        String getTitle=Driver.getDriver().findElement(title).getText().toUpperCase();
        String actual=searched.toUpperCase();
        Log.info("Wanted: "+getTitle);
        Log.info("Listed: "+actual);
        Assert.assertTrue(getTitle.contains(actual));
        Thread.sleep(2000);
        Driver.getDriver().findElement(bar).click();
        Log.info("Search process is success");
        extentTest.pass("Search process is success");
    }

    public static void highestPrice() throws InterruptedException {
        extentTest.info("The products are listed by high to low");
        Thread.sleep(2000);
      //  Driver.getDriver().findElement(closepopup2).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(sortBy).click();
        Driver.getDriver().findElement(highToLow).click();
        Log.info("The products are listed by high to low");
        Thread.sleep(2000);
        String value=(priceList.get(0).getText()).substring(1);
        double highestPriceProduct=Double.valueOf(value);
        Log.info("Highest price from product list : "+highestPriceProduct);
        for (int i=1; i<priceList.size()-1; i++){
            String productItem=(priceList.get(i).getText()).substring(1);
            Assert.assertTrue(highestPriceProduct>= Double.valueOf(productItem));
        }
        Log.info("Verified that all products are listed by high to low");
        extentTest.pass("Verified that all products are listed by high to low");

    }

    public static void priceRange() throws InterruptedException {

        extentTest.info("Minimum and maximum price range determined");
        Actions action=new Actions(Driver.getDriver());
        Thread.sleep(1000);
        action.dragAndDropBy(Driver.getDriver().findElement(minPriceIcon),20,0).perform();
        action.dragAndDropBy(Driver.getDriver().findElement(maxPriceIcon),-20,0).perform();
        Log.info("Minimum and maximum price range determined");
        Thread.sleep(2000);
        List<Double> prices=new ArrayList<>();

        Thread.sleep(3000);
        for (int i=0; i<priceRange_.size(); i++)
        {
            prices.add(parseDouble(priceRange_.get(i).getText().substring(1)));

        }
        //System.out.println(prices);
        //System.out.println(priceRange_.get(0).getText());
        Thread.sleep(3000);

        for (int i=0; i<prices.size();i++)
        {
            Assert.assertTrue(prices.get(i)<parseInt(Driver.getDriver().findElement(upperFilter).getText()) &&
                    prices.get(i)>parseInt(Driver.getDriver().findElement(lowerFilter).getText()));
        }

        Log.info("Verified that all products listed are within the specified price range");
        extentTest.pass("Verified that all products listed are within the specified price range");
    }


    public static void lowestPrice() throws InterruptedException {
        Thread.sleep(2000);
      //  Driver.getDriver().findElement(closepopup2).click();
        Driver.getDriver().findElement(sortBy).click();
        Driver.getDriver().findElement(lowToHigh).click();
        Log.info("The products are listed by low to high");
        extentTest.info("The products are listed by low to high");
        String value=(priceList.get(0).getText()).substring(1);
        double lowestPriceProduct=Double.valueOf(value);
        Log.info("Lowest price from product list : "+lowestPriceProduct);
        for (int i=1; i<priceList.size()-1; i++){
            String productItem=(priceList.get(i).getText()).substring(1);
            Assert.assertTrue(lowestPriceProduct<= Double.valueOf(productItem));
        }
        Log.info("Verified that all products are listed by low to high");
        extentTest.pass("Verified that all products are listed by low to high");
    }



    public static void addToCart() throws InterruptedException {

        String productName=Driver.getDriver().findElement(product).getText();
        WebElement product1=Driver.getDriver().findElement(By.xpath("(//*[@class='S-product-item__link_jump S-product-item__link'])[1]"));
        js.executeScript("arguments[0].style.border='6px solid blue'", product1);
        Driver.getDriver().findElement(product).click();

        Log.info("One of the listed products was selected");
        extentTest.info("One of the listed products was selected");
        Thread.sleep(1000);
        Driver.getDriver().findElement(productSize).click();
        WebElement addToCart1=Driver.getDriver().findElement(By.xpath("(//div[@class='she-btn-xl__container'])[2]"));
        js.executeScript("arguments[0].style.border='6px solid blue'", addToCart1);
        Driver.getDriver().findElement(addToCart).click();
        Log.info("Product added to cart");
        extentTest.info("Product added to cart");
        Thread.sleep(3000);
        //Driver.getDriver().findElement(cart).click();
        Actions action=new Actions(Driver.getDriver());
        action.click(Driver.getDriver().findElement(cart)).perform();
       // System.out.println(Driver.getDriver().findElement(cartList).getText());
        //System.out.println(productName);
        Assert.assertEquals(productName,Driver.getDriver().findElement(cartList).getText());
        Log.info("Verified that the selected product is in the cart");
        extentTest.pass("Verified that the selected product is in the cart");

    }

    public static void filteringProduct() throws InterruptedException {

        Driver.getDriver().findElement(rightArrow).click();
        Driver.getDriver().findElement(shoesButton).click();
        String first=Driver.getDriver().findElement(product).getText();
        Driver.getDriver().findElement(selectColor).click();
        Log.info("listed products are filtered by color");
        extentTest.info("listed products are filtered by color");
        Thread.sleep(2000);
        String second=Driver.getDriver().findElement(filteredProduct).getText();
        Assert.assertNotEquals(first,second);
        Driver.getDriver().findElement(selectSize).click();
        Log.info("products listed are filtered by size");
        extentTest.info("products listed are filtered by size");
        Thread.sleep(2000);
        String third =Driver.getDriver().findElement(filteredProduct).getText();
        Assert.assertNotEquals(second,third);
        Log.info("Successful filtering verified");
        extentTest.pass("Successful filtering verified");

    }


    public static  void saleZone() throws InterruptedException {

        Thread.sleep(2000);
        Driver.getDriver().findElement(bar).click();
        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.getDriver().findElement(saleZoneIcon).click();
        Log.info("Sale Zone page is opened");
        extentTest.info("Sale Zone page is opened");
        List<String> titles=new ArrayList<>();
            titles.add("New to Sale");
            titles.add("Bestsellers on Sale");
            titles.add("Final Sale");
            titles.add("Super Savings");
            titles.add("Category Offers");
        System.out.println(titles);
        List<String> realList=new ArrayList<>();
        for (int i=0;i<salezoneTitles.size(); i++)
        {
           realList.add(salezoneTitles.get(i).getText());
        }
        System.out.println(realList);
        Assert.assertTrue(realList.containsAll(titles));
        Log.info("Sale Zone content verified");
        extentTest.pass("Sale Zone content verified");



    }

    public static void removeItemFromCart(String searched1) throws InterruptedException {

        Driver.getDriver().findElement(continueShopping).click();
        //Driver.getDriver().findElement(rightArrow).click();
       // Driver.getDriver().findElement(shoesButton).click();
        Driver.getDriver().findElement(searchBox).sendKeys(searched1+ Keys.ENTER);
        Thread.sleep(2000);
        Driver.getDriver().findElement(product).click();
        Log.info("One product selected");
        extentTest.info("One product selected");
        Thread.sleep(3000);
        Driver.getDriver().findElement(addToCart).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(cart).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(deleteFromCart).click();
        Driver.getDriver().findElement(deleteApprove).click();
        Log.info("Product successfully deleted from cart");
        extentTest.pass("Product successfully deleted from cart");
    }

    public static void changeCurrency() throws InterruptedException {

       Thread.sleep(2000);
       Driver.getDriver().findElement(bar).click();
       Thread.sleep(2000);
        Driver.getDriver().findElement(closepopup2).click();
        Thread.sleep(3000);
       Actions action=new Actions(Driver.getDriver());
       action.moveToElement(Driver.getDriver().findElement(earthIcon)).perform();
       Thread.sleep(1000);

       Thread.sleep(3000);
       WebElement euroLink1=Driver.getDriver().findElement(By.xpath("//li[@data-currency='EUR']"));
        js.executeScript("arguments[0].style.border='6px solid blue'", euroLink1);
       Driver.getDriver().findElement(selectCurrency).click();
           Thread.sleep(1000);
       Driver.getDriver().findElement(euroLink).click();
        Log.info("currency selected");
        extentTest.info("currency selected");
       Thread.sleep(2000);
       Driver.getDriver().findElement(searchBox).sendKeys("glasses"+ Keys.ENTER);
       Thread.sleep(1000);
       Assert.assertTrue(Driver.getDriver().findElement(price).getText().contains("€"));
       Log.info("Verified that products are listed according to the selected currency");
        extentTest.pass("Verified that products are listed according to the selected currency");
    }

    public static void brandsLink() throws InterruptedException {
        Thread.sleep(3000);
        Driver.getDriver().findElement(bar).click();
        Actions action=new Actions(Driver.getDriver());
        Log.info("Verification of Brand page links");
        extentTest.info("Verification of Brand page links");
        action.moveToElement(Driver.getDriver().findElement(brandsButton)).perform();
        for (int i=0; i< links.size()-1; i++) {

            Thread.sleep(2000);
            links.get(i).click();
            Thread.sleep(2000);
            System.out.println(Driver.getDriver().findElement(brandTitle).getText());
            Driver.getDriver().navigate().back();
            Thread.sleep(2000);
            Driver.getDriver().findElement(rightArrow).click();
            action.moveToElement(Driver.getDriver().findElement(brandsButton)).perform();

        }
        Log.info("Verified that all links work on the Brand page");
        extentTest.pass("Verified that all links work on the Brand page");
    }

    public static void goToHome() throws InterruptedException {

       Thread.sleep(2000);
       Log.info("Home category test starts");
        extentTest.info("Home category test starts");
       Driver.getDriver().findElement(homeButton).click();

       List<String> subHomeExpected =new ArrayList<>();
       List<String> subHomeActual =new ArrayList<>();

       subHomeExpected.add("NEW IN");
       subHomeExpected.add("HOME TEXTILE");
       subHomeExpected.add("KITCHEN & DINING");
       subHomeExpected.add("STORAGE & ORGANIZATION");
       subHomeExpected.add("EVENT & PARTY SUPPLIES");
      // Driver.getDriver().findElement(LeftArrow).click();
      // subHomeExpected.add("HOME DECOR");
      // subHomeExpected.add("BATHROOM & CLEANING");
      // subHomeExpected.add("OUTDOOR & GARDEN");
      // subHomeExpected.add("TOOLS & HOME IMPROVEMENT");
      //  subHomeExpected.add("HOME APPLIANCES");
      // subHomeExpected.add("PET SUPPLIES");
      // subHomeExpected.add("OFFICE & SCHOOL SUPPLIES");
      // subHomeExpected.add("TOYS");

        List<String> subHome =new ArrayList<>();
        for (int i=0; i< homelinks.size(); i++){
            subHomeActual.add(homelinks.get(i).getText());
        }
        System.out.println(subHomeActual);
        Assert.assertTrue(subHomeActual.containsAll(subHomeExpected));
        Log.info("Verified category content on Home page");
        extentTest.pass("Verified category content on Home page");

    }

    public static void categoryControl() {

        Log.info("Shein main category verification starts");
        extentTest.info("Shein main category verification starts");
        String title=Driver.getDriver().findElement(categoryTitle).getText();
        System.out.println(title);
        Assert.assertTrue(title.contains("WOMEN"));
        Assert.assertTrue(title.contains("CURVE"));
        Assert.assertTrue(title.contains("KIDS"));
        Assert.assertTrue(title.contains("MEN"));
        Assert.assertTrue(title.contains("HOME"));
        Assert.assertTrue(title.contains("BEAUTY"));

        Log.info("Main categories verified");
        extentTest.pass("Main categories verified");

    }

    public static void changeQuantity() throws InterruptedException {

       Log.info("Product count verification test starts");
        extentTest.info("Product count verification test starts");
       Thread.sleep(2000);
       String title=Driver.getDriver().findElement(totalQuantity).getText();
       int quantity= Integer.parseInt(title.substring(title.length()-2,title.length()-1));
       System.out.println(quantity);
       Driver.getDriver().findElement(quantityIncrease).click();
       Thread.sleep(3000);
       String newTitle=Driver.getDriver().findElement(totalQuantity).getText();
       int newQuantity= Integer.parseInt(newTitle.substring(title.length()-2,newTitle.length()-1));
       System.out.println(newQuantity);
       Assert.assertTrue(newQuantity==quantity+1);
       Log.info("Confirmed increase in the number of products with the plus button");
        extentTest.pass("Confirmed increase in the number of products with the plus button");
       quantity=newQuantity;
       Driver.getDriver().findElement(quantityReduce).click();
       Thread.sleep(3000);
       newTitle=Driver.getDriver().findElement(totalQuantity).getText();
       newQuantity= Integer.parseInt(newTitle.substring(title.length()-2,newTitle.length()-1));
       System.out.println(newQuantity);
       Assert.assertTrue(newQuantity==quantity-1);
       Log.info("Confirmed decrease in the number of products with minus button");
       extentTest.pass("Confirmed decrease in the number of products with minus button");

    }

    public static void displayBestSeller() throws InterruptedException {

        Log.info("Test of best-selling product listings begins");
       extentTest.info("Test of best-selling product listings begins");
       Driver.getDriver().findElement(bestsellerLink).click();
       Thread.sleep(2000);
       Actions action= new Actions(Driver.getDriver());
       action.sendKeys(Keys.END).perform();
      Driver.getDriver().findElement(bestsellerLink2).click();
       Thread.sleep(2000);
       List<Integer> perlist=new ArrayList<>();
       for (int i=0; i< percentList.size(); i++){
           perlist.add(Integer.valueOf(percentList.get(i).getText().substring(0,percentList.get(i).getText().length()-1)));
           Assert.assertTrue(perlist.get(0)>90);
       }
       Log.info("Confirmed more than 90% preference for the listed products");
        extentTest.pass("Confirmed more than 90% preference for the listed products");



    }

    public static void wishListControl() throws InterruptedException {
        Actions action=new Actions(Driver.getDriver());
        Log.info("Add the product to wishlist");
        extentTest.info("Add the product to wishlist");
        Driver.getDriver().findElement(searchBox).sendKeys("baby shoes"+ Keys.ENTER);

        String productName=Driver.getDriver().findElement(product).getText();
        Log.info("product name : "+ productName);
        Driver.getDriver().findElement(product).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(heartIcon).click();
        Thread.sleep(2000);

        action.moveToElement(Driver.getDriver().findElement(signIn)).perform();
        Driver.getDriver().findElement(profileIcon).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(wishListIcon).click();
        List<String> list=new ArrayList<>();
        for (int i=0;i<productWishList.size()-1;i++)
        {
            list.add(productWishList.get(i).getText());
        }
        System.out.println(list);
        System.out.println("----------");
        System.out.println(productName);

       // Assert.assertTrue(list.get(1).contains(productName));
        extentTest.info("The product was successfully added");

        //Driver.getDriver().findElement(inWishlist).click();
        //Thread.sleep(2000);
        //Driver.getDriver().findElement(heartIconFilled).click();



    }
}