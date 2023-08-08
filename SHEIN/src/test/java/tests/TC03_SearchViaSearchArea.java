package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC03_SearchViaSearchArea extends TestBaseReport {
    Locators page=new Locators();
    @Test

    public void test3() throws InterruptedException {
        extentTest=extentReports.createTest("Search via Search Area",
                "");
        page.goToHomePage();
        page.search("jeans");





    }
}
