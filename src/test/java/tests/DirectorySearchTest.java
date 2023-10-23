package tests;

import org.junit.Test;
import pages.ConsumerAppHomePage;

public class DirectorySearchTest {
    @Test
    public void searchWithFilters(){
        new ConsumerAppHomePage().openPage().clickFIFAButton()
                .clickBrowseAdviserDirectory()
                .selectAdviceAreaFilterOption("//div/div/div[2]/div/div[2]/div/div")
                .selectAssetsValueFilterOption("//div[3]/div/div[7]/div")
                .setPostcodeFilter("SE207AA")
                .clickFindAdviserButton();
    }
}
