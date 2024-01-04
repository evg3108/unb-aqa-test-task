package enums;

public enum AssetsValue {
    UNDER_20("Under £20,000"),
    MORE_THAN_21("£21,000+"),
    MORE_THAN_51("£51,000+"),
    MORE_THAN_101("£101,000+"),
    MORE_THAN_151("£151,000+"),
    MORE_THAN_251("£251,000+"),
    MORE_THAN_501("£501,000+"),
    MORE_THAN_1001000("£1,001,000+"),
    MORE_THAN_1501000("£1,501,000+");

    public final String filterText;

    AssetsValue (String filterText){
        this.filterText = filterText;
    }
}
