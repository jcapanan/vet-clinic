package serenitylabs.tutorials.vetclinic.sales.model;

public class LineItem {
    private static int quantity;
    private final String itemName;
    private final ProductCategory category;
    private final double price;
    private double total;

    public LineItem(int quantity, String itemName, ProductCategory category, double price) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.category = category;
        this.price = price;
    }

    public static WithItemName forSaleOf(int quantity) {
        return new LineItemBuilder(quantity);
    }

    public double getTotal() {
        return total;
    }

    public interface WithItemName {
        WithCategory itemCalled(String itemName);
    }

    public interface WithCategory {
        LineItemBuilder inCategory(ProductCategory category);
    }

    public static class LineItemBuilder implements WithItemName, WithCategory{
        private int quantity;
        private String itemName;
        private ProductCategory category;

        public LineItemBuilder(int quantity) {
            this.quantity = quantity;
        }

        public WithCategory itemCalled(String itemName) {
            this.itemName = itemName;
            return this;
        }

        public LineItemBuilder inCategory(ProductCategory category) {
            this.category = category;
            return this;
        }

        public LineItem withUnitPriceOf(double price) {
            return new LineItem(quantity, itemName, category, price);
        }
    }
}
