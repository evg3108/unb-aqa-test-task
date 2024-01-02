package utils;

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

    public DirectorySearchResultsPagination goToNextPage() {
        nextPageButton().toWebElement().click();
        return this;
    }

    public DirectorySearchResultsPagination goToPreviousPage() {
        if (hasPreviousPage()) previousPageButton().click();
        return this;
    }

    public boolean hasNextPage() {
        nextPageButton().scrollIntoView(true);
        return $("[aria-label='Next page']").isEnabled();
    }

    public boolean hasPreviousPage() {
        return $("ul.v-pagination button[aria-label=\"Previous page\"]").isEnabled();
    }


}
