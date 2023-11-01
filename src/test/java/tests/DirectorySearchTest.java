package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import pages.ConsumerAppHomePage;

public class DirectorySearchTest {

    @Test
    public void searchWithFilters(){
        new ConsumerAppHomePage().openPage().clickFIFAButton()
                .clickBrowseAdviserDirectory()
                .selectAdviceAreaFilterOption("//div/div/div[2]/div/div[2]/div/div")
                .selectAssetsValueFilterOption("//div[3]/div/div[7]/div")
                .setPostcodeFilter("SE207AA")
                .clickFindAdviserButton()
                .getSearchResultsCompanyNames()
                .filterBy(Condition.text("this one")).shouldHave(CollectionCondition.size(1));
    }
}
