package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC12_Currency extends TestBaseReport {
    Locators page = new Locators();

    @Test

    public void test12() throws InterruptedException {
        extentTest=extentReports.createTest("Change Currency",
                "");
        page.goToHomePage();
        page.changeCurrency();


    }
}