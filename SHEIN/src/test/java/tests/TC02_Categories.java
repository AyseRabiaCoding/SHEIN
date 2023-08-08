package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC02_Categories extends TestBaseReport {

    Locators page=new Locators();


    @Test
    public void test2() throws InterruptedException {
        extentTest=extentReports.createTest("Main Categories",
                "");
        page.goToHomePage();
        page.categoryControl();
    }

}
