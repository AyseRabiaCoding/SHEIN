package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC04_FindHighestPrice extends TestBaseReport {
    Locators page=new Locators();
    @Test

    public void test4() throws InterruptedException {
        extentTest=extentReports.createTest("Find Highest Price",
                "");
        page.goToHomePage();
        page.search("shirts");
        page.highestPrice();








    }

}
