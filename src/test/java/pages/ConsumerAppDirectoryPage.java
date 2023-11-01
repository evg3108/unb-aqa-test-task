package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ConsumerAppDirectoryPage {

    public ConsumerAppDirectoryPage selectAdviceAreaFilterOption(String xPathSelector) {
        $(byXpath(xPathSelector)).click();
        return this;
    }

    public ConsumerAppDirectoryPage selectAssetsValueFilterOption(String xPathSelector) {
        $(byXpath(xPathSelector)).click();
        return this;
    }

    public ConsumerAppDirectoryPage setPostcodeFilter(String poscode) {
        $("#filter-select-postcode").setValue(poscode);
        return this;
    }

    public ConsumerAppDirectoryPage clickFindAdviserButton() {
        $("#filter-submit-button").click();
        return this;
    }

    public ElementsCollection getSearchResultsCompanyNames() {
        return $$("#directory-search-results h2 span");
    }

}
