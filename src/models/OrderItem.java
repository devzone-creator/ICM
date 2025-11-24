package models;

// Claude-Sonnet version

public class OrderItem {
    private Product product;
    private int quantity;
    private double priceAtOrder;

    public OrderItem(Product product, int quantity, double priceAtOrder){
        this.product = product;
        this.quantity = quantity;
        this.priceAtOrder = priceAtOrder;
    }

    public Product getProduct(){return product;}
    public int getQuantity(){return quantity;}
    public double getPriceAtOrder() {return priceAtOrder;}
}