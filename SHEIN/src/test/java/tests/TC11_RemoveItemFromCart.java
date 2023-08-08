package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC11_RemoveItemFromCart extends TestBaseReport {
    Locators page = new Locators();

    @Test

    public void test11() throws InterruptedException {
        extentTest=extentReports.createTest("Delete product from cart",
                "");
        page.goToHomePage();
        page.search("baby shoes");
        page.addToCart();
        page.removeItemFromCart("glasses");


    }
}
