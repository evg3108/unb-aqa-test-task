package tests;

import enums.AdviceArea;
import enums.AssetsValue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.ConsumerAppHomePage;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DirectorySearchTest {

    static Stream<Arguments> searchWithFiltersArguments() {
        return Stream.of(
                Arguments.of(
                        AdviceArea.FINANCIAL_PLANNING,
                        AssetsValue.MORE_THAN_501,
                        "SE207AA",
                        "AAtest"
                )
        );
    }

    @DisplayName("When searching adviser directory with filters, results contain company AAtest")
    @MethodSource("searchWithFiltersArguments")
    @ParameterizedTest
    public void resultsOfSearchWithFiltersContainSpecifiedCompany(AdviceArea adviceArea,
                                                                  AssetsValue assetsValue,
                                                                  String postcode,
                                                                  String expectedCompanyName) {
        List<String> searchResults = new ConsumerAppHomePage().openPage().closeCookiesBanner()
                .clickFIFAButton()
                .clickBrowseAdviserDirectory()
                .selectAdviceAreaFilterOption(adviceArea)
                .selectAssetsValueFilterOption(assetsValue)
                .setPostcodeFilter(postcode)
                .clickSubmitButton()
                .getCompanyNamesFromAllSearchResults();

        boolean hasSpecifiedCompany = searchResults
                .stream()
                .anyMatch(companyName -> companyName.equalsIgnoreCase(expectedCompanyName));

        assertFalse(searchResults.isEmpty());
        assertTrue(hasSpecifiedCompany);
    }
}
