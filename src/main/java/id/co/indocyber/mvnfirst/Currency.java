package id.co.indocyber.mvnfirst;

/**
 *
 * @author zulfahmi
 */
public class Currency {

    private String currencyCode;
    private String currencyName;        

    public Currency() {
    }

    public Currency(String currencyCode, String currencyName) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
    

    @Override
    public String toString() {
        return currencyCode + " - " + currencyName;
    }
}
