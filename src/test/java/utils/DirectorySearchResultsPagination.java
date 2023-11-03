package utils;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DirectorySearchResultsPagination {

    private SelenideElement nextPageButton() {
        return $("ul.v-pagination button[aria-label=\"Next page\"]");
    }

    private SelenideElement previousPageButton() {
        return $("ul.v-pagination button[aria-label=\"Previous page\"]");
    }

    public boolean doExist() {
        if (!$("ul.v-pagination").isDisplayed()){
        }
        return $("ul.v-pagination").isDisplayed();
    }

    public DirectorySearchResultsPagination goToNextPage() {
        if (hasNextPage()) nextPageButton().click();
        return this;
    }

    public DirectorySearchResultsPagination goToPreviousPage() {
        if (hasPreviousPage()) previousPageButton().click();
        return this;
    }

    public boolean hasNextPage() {
        return $("ul.v-pagination button[aria-label=\"Next page\"]").isEnabled();
    }

    public boolean hasPreviousPage(){
        return $("ul.v-pagination button[aria-label=\"Previous page\"]").isEnabled();
    }

}
