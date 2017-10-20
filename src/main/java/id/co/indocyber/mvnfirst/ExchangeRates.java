package id.co.indocyber.mvnfirst;

import java.time.Instant;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author zulfahmi
 */
public class ExchangeRates {

    private Integer timestamp;
    private String base;
    private Map<String, Double> rates;

    /**
     * @return the timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the base
     */
    public String getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * @return the rates
     */
    public Map<String, Double> getRates() {
        return rates;
    }

    /**
     * @param rates the rates to set
     */
    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    public Date getDate() {
        Date date = Date.from(Instant.ofEpochSecond(timestamp));
        return date;
    }
    
    

    @Override
    public String toString() {
        return "1 USD = Rp " + rates.get("IDR") + " per " + getDate();
    }

}
