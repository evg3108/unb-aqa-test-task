package pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ConsumerAppMatchEnquiryStartPage {

    public ConsumerAppDirectoryPage clickBrowseAdviserDirectory() {
        $(byXpath("//a[contains(text(),'Browse adviser directory')]")).click();
        return new ConsumerAppDirectoryPage();
    }

}
