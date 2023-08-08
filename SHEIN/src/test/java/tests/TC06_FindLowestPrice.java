package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC06_FindLowestPrice extends TestBaseReport {

    Locators page=new Locators();
    @Test

    public void test6() throws InterruptedException {
        extentTest=extentReports.createTest("Find Lowest Price",
                "");
        page.goToHomePage();
        page.search("baby shoes");
        page.lowestPrice();

    }
}
