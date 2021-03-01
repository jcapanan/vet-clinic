package serenitylabs.tutorials.vetclinic.sales.model;

import java.util.Objects;

public class SalesTax {
    private static double rate;
    private final String name;
    private final double amount;

    public SalesTax(double rate, String name, double amount) {
        this.rate = rate;
        this.name = name;
        this.amount = amount;
    }

    public static double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesTax salesTax = (SalesTax) o;
        return (Math.abs(salesTax.rate - rate) < 0.001) &&
                (Math.abs(salesTax.amount - amount) < 0.001) &&
                Objects.equals(name, salesTax.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rate, amount);
    }

    @Override
    public String toString() {
        return "TaxEntry{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", amount=" + amount +
                '}';
    }

    public static WithName atRateOf(double rate) {
        return new SalesTaxBuilder(rate);
    }

    public interface WithName {
        SalesTaxBuilder withName(String name);
    }

    public static class SalesTaxBuilder implements WithName {
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
