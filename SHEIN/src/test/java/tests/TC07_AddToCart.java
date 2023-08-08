package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC07_AddToCart extends TestBaseReport {

    Locators page=new Locators();
    @Test

    public void test7() throws InterruptedException {
        extentTest=extentReports.createTest("Add to Cart",
                "");
        page.goToHomePage();
        page.search("baby shoes");
        page.addToCart();



    }
}
