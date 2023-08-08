package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC14_QuantityTest extends TestBaseReport {

    Locators page = new Locators();

    @Test

    public void test14() throws InterruptedException {
        extentTest=extentReports.createTest("Quantity Test",
                "");
        page.goToHomePage();
        page.search("baby shoes");
        page.addToCart();
        page.changeQuantity();

    }
}
