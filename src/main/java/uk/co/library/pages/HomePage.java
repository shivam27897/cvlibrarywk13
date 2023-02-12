package uk.co.library.pages;

import uk.co.library.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogManager().getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "keywords")
    WebElement jobTitle;
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement accept;
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    @FindBy(id = "distance")
    WebElement distanceDropDown;
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;


    public void enterJobTitle(String title){
        sendTextToElement(jobTitle,title);
    }
    public void clickOnAccept(){
        clickOnElement(accept);
    }
    public void enterLocaion(String postcode){
        sendTextToElement(location,postcode);
    }
    public void selectDistance(String value){
        selectByValueFromDropDown(distanceDropDown,value);
    }
    public void clickOnMoreoptions(){
        clickOnElement(moreSearchOptionsLink);
    }
    public void enterMinSalary(String minSal){
        sendTextToElement(salaryMin,minSal);
    }
    public void enterMaxSalary(String maxSal){
        sendTextToElement(salaryMax,maxSal);
    }
    public void selectsalaryTypeDropDown(int value1){
        selectByIndexFromDropDown(salaryTypeDropDown,value1);
    }
    public void selectJobTypeDropDown(int value2){
        selectByIndexFromDropDown(jobTypeDropDown,value2);
    }
    public void clickOnSearchButton(){
        clickOnElement(findJobsBtn);
    }

}
