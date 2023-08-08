package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC13_HomePage extends TestBaseReport {

    Locators page = new Locators();

    @Test

    public void test13() throws InterruptedException {
        extentTest=extentReports.createTest("Category Home",
                "");
        page.goToHomePage();
        page.goToHome();


    }

}
