package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC08_BrandsLinkVerification extends TestBaseReport {

    Locators page = new Locators();

    @Test

    public void test8() throws InterruptedException {
        extentTest=extentReports.createTest("Brands Link Verification",
                "");
        page.goToHomePage();
        page.brandsLink();

    }

}
