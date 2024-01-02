package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DirectorySearchResultsPagination {


    public boolean exists() {
        return $("[aria-label='Pagination Navigation']").exists();
    }

    private SelenideElement nextPageButton() {
        return $x("//span[contains(.,'Next page')]");
    }

    private SelenideElement previousPageButton() {
        return $x("//span[contains(.,'Previous page')]");
    }

    public void goToNextPage() {
        nextPageButton().click();
    }

    // ElementClickInterceptedException is thrown when using the nextPageButton so replaced with separate selector
    public boolean hasNextPage() {
        nextPageButton().scrollIntoView(true);
        return $("[aria-label='Next page']").isEnabled();
    }

}
