package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;

public class ConsumerAppMatchEnquiryStartPage {

    public ConsumerAppDirectoryPage clickBrowseAdviserDirectory(){
        $(byXpath("//a[contains(text(),'Browse adviser directory')]")).click();
        return new ConsumerAppDirectoryPage();
    }

}
