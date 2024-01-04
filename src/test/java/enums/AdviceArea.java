package enums;

public enum AdviceArea {
    PENSIONS_AND_RETIREMENT("Pensions & retirement"),
    FINANCIAL_PLANNING("Financial planning"),
    INVESTMENTS("Investments"),
    SHARIA_FINANCE("Sharia finance"),
    LONG_TERM_CARE("Long term care"),
    STOCKBROKING_SERVICES("Stockbroking services");

    public final String filterText;

    AdviceArea(String filterText){
        this.filterText = filterText;
    }

}
