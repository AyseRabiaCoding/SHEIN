package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC15_BestSeller extends TestBaseReport {
    Locators page = new Locators();

    @Test

    public void test15() throws InterruptedException {
        extentTest=extentReports.createTest("Best Seller Page",
                "");
        page.goToHomePage();
        page.displayBestSeller();

    }


}
