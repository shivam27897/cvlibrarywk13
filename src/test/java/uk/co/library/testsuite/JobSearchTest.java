package uk.co.library.testsuite;

import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class JobSearchTest extends TestBase {

    HomePage homePage;
    ResultPage resultPage;


    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, int salaryType, int jobType){
        driver.switchTo().frame("gdpr-consent-notice");
        homePage.clickOnAccept();
        driver.switchTo().defaultContent();
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocaion(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreoptions();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectsalaryTypeDropDown(salaryType);
        homePage.selectJobTypeDropDown(jobType);
        homePage.clickOnSearchButton();
       // String actualMsg = resultPage.verifyResultText();


    }
}
