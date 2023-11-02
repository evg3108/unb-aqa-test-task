package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ConsumerAppHomePage {

    private final String STAGING_URL = "https://www-staging.unbiased.team/";
    private final String PROD_URL = "https://unbiased.co.uk/";

    private SelenideElement cookies = $("[data-cookiefirst-widget='box']");

    public ConsumerAppHomePage openPage(){
        open(STAGING_URL);
        closeCookiesBanner();
        return this;
    }

    public ConsumerAppMatchEnquiryStartPage clickFIFAButton(){
        $(byXpath("//button[@onclick=\"goToMatchIntroPage('financial-adviser')\"]")).click();
        return new ConsumerAppMatchEnquiryStartPage();
    }

    public void closeCookiesBanner(){
        if (cookies.isDisplayed()){
            $("[data-cookiefirst-action='accept']").click();
        }
    }

}
