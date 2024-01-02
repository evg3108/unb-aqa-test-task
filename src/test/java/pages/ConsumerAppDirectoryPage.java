package pages;

import utils.DirectorySearchResultsPagination;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

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

    public ConsumerAppDirectoryPage setPostcodeFilter(String postcode) {
        $("#filter-select-postcode").setValue(postcode);
        return this;
    }

    public ConsumerAppDirectoryPage clickSubmitButton() {
        $("#filter-submit-button").click();
        return this;
    }

    public List<String> getCompanyNamesFromAllSearchResults() {
        List<String> results = new ArrayList<>(collectCompanyNamesFromCurrentPage());
        if (pagination.exists()) {
            do {
                pagination.goToNextPage();
                results.addAll(collectCompanyNamesFromCurrentPage());
            } while (pagination.hasNextPage());
        }
        return results;
    }

    private List<String> collectCompanyNamesFromCurrentPage() {
        scrollToEndOfContent();
        return $$("#directory-search-results h2 span").texts();
    }

    private void scrollToEndOfContent() {
        $("#directory-search-results").scrollIntoView(false);
        sleep(1000);
    }

}
