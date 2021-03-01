package serenitylabs.tutorials.vetclinic.sales.model;

public class ZeroRateCalculator implements TaxRateCalculator {
    @Override
    public TaxRate rateFor(LineItem item) {
        return null;
    }
}
