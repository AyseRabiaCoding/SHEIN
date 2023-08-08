package tests;

import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC01_ValidLogin extends TestBaseReport {

   Locators page=new Locators();


    @Test
    public void test1() throws InterruptedException {
        extentTest=extentReports.createTest("Valid Login",
                "");
        page.goToHomePage();
        page.signIn();
        page.logout();




    }

}
