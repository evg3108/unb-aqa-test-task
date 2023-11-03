package pages;

import com.codeborne.selenide.ElementsCollection;
import utils.DirectorySearchResultsPagination;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ConsumerAppDirectoryPage {

    DirectorySearchResultsPagination pagination = new DirectorySearchResultsPagination();

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

    public ElementsCollection getCompanyNamesFromAllSearchResults() {
        ElementsCollection results = $$("#directory-search-results h2 span");
        if (pagination.doExist()){
            do{
                pagination.goToNextPage();
                results.addAll($$("#directory-search-results h2 span"));
            } while (pagination.hasNextPage());
        }
        return results;
    }

}
