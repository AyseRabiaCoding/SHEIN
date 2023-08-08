package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC10_SaleZoneScreen extends TestBaseReport {


    Locators page=new Locators();
    @Test

    public void test10() throws InterruptedException {
        extentTest=extentReports.createTest("Sale Zone",
                "");
        page.goToHomePage();
        page.saleZone();




    }

}
