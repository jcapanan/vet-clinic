package serenitylabs.tutorials.vetclinic.sales.model;

public class SalesTax {
    private static double rate;
    private final String name;
    private final double amount;

    public SalesTax(double rate, String name, double amount) {
        this.rate = rate;
        this.name = name;
        this.amount = amount;
    }

    public static SalesTaxBuilder atRateOf(double rate) {
        return new SalesTaxBuilder(rate);
    }

    public static class SalesTaxBuilder {
        private double rate;
        private String name;

        public SalesTaxBuilder(double rate) {
            this.rate = rate;
        }

        public SalesTaxBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public SalesTax forAnAmountOf(double amount) {
            return new SalesTax(rate, name, amount);
        }
    }
}
