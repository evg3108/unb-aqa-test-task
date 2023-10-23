package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.*;

public class ConsumerAppHomePage {

    private SelenideElement cookies = $("[data-cookiefirst-widget='box']");

    public ConsumerAppHomePage openPage(){
        open("https://unbiased.co.uk");
        if (cookies.isDisplayed()){
            $("[data-cookiefirst-action='accept']").click();
        }
        return this;
    }

    public ConsumerAppMatchEnquiryStartPage clickFIFAButton(){
        $(byXpath("//button[@onclick=\"goToMatchIntroPage('financial-adviser')\"]")).click();
        return new ConsumerAppMatchEnquiryStartPage();
    }

}
