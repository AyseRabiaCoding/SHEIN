package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;


public class TC16_Wishlist extends TestBaseReport {

    Locators page=new Locators();


    @Test
    public void test1() throws InterruptedException {
        extentTest = extentReports.createTest("Wishlist Test",
                "");
        page.goToHomePage();
        page.signIn();
        page.wishListControl();




    }


}