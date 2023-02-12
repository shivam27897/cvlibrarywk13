package uk.co.library.pages;

import uk.co.library.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {


    @FindBy(xpath = "//label[contains(text(),'Results per page:')]")
    WebElement resultText;

    public void verifyResultText(){
        getTextFromElement(resultText);
    }

}
