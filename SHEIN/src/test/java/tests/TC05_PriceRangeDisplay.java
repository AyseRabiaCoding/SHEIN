package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC05_PriceRangeDisplay extends TestBaseReport {

    Locators page=new Locators();
    @Test

    public void test5() throws InterruptedException {
        extentTest=extentReports.createTest("Price Range Display",
                "");
        page.goToHomePage();
        page.search("bag");
        page.priceRange();



    }


}
