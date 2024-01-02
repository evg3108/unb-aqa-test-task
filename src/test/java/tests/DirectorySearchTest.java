package tests;

import org.junit.jupiter.api.Test;
import pages.ConsumerAppHomePage;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DirectorySearchTest {

    @Test
    public void resultsOfSearchWithFiltersContainSpecifiedCompany() {
        List<String> searchResults = new ConsumerAppHomePage().openPage().closeCookiesBanner()
                .clickFIFAButton()
                .clickBrowseAdviserDirectory()
                .selectAdviceAreaFilterOption("//div/div/div[2]/div/div[2]/div/div")
                .selectAssetsValueFilterOption("//div[3]/div/div[7]/div")
                .setPostcodeFilter("SE207AA")
                .clickSubmitButton()
                .getCompanyNamesFromAllSearchResults();

        boolean hasSpecifiedCompany = searchResults.stream().anyMatch(companyName -> companyName.equals("AAtest"));

        assertFalse(searchResults.isEmpty());
        assertTrue(hasSpecifiedCompany);
    }
}
