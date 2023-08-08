package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC09_FilteringProduct extends TestBaseReport {


    Locators page=new Locators();
    @Test

    public void test9() throws InterruptedException {
        extentTest=extentReports.createTest("Filtering Product",
                "");
        page.goToHomePage();
        page.filteringProduct();


    }

}
