package tests;


import org.testng.annotations.Test;
import pages.Locators;
import utilities.TestBaseReport;

public class TC17_Logout_Unhappy extends TestBaseReport {

    Locators page=new Locators();


    @Test
    public void test1() throws InterruptedException {
        extentTest=extentReports.createTest("InValid Login",
                "");
        page.goToHomePage();
       page.invalidLogin();





    }

}


