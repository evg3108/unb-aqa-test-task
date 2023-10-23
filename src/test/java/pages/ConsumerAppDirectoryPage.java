package pages;

import static com.codeborne.selenide.Selectors.*;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class ConsumerAppDirectoryPage {

    public ConsumerAppDirectoryPage selectAdviserTypeFilterOption(String cssSelector){
        $(".v-select__selections").shouldHave(Condition.text("Financial adviser")).click();
        $(byXpath(cssSelector)).click();
        return this;
    }
    public ConsumerAppDirectoryPage selectAdviceAreaFilterOption(String xPathSelector){
        $(byXpath(xPathSelector)).click();
        return this;
    }

    public ConsumerAppDirectoryPage selectAssetsValueFilterOption(String xPathSelector){
        $(byXpath(xPathSelector)).click();
        return this;
    }

    public ConsumerAppDirectoryPage setPostcodeFilter(String poscode){
        $("#filter-select-postcode").setValue(poscode);
        return this;
    }

    public void clickFindAdviserButton(){
        $("#filter-submit-button > .v-btn__content").click();
    }

}
