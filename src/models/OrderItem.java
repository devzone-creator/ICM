package models;

// Claude-Sonnet version

public class OrderItem {
    private Product product;
    private int quantity;
    private double priceAtOrder;

    public OrderItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
        this.priceAtOrder = product.getPrice();
    }

    public Product getProduct(){return product;}
    public int getQuantity(){return quantity;}
    public double getPriceAtOrder() {return priceAtOrder;}

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getSubTotal(){
        return priceAtOrder * quantity;
    }

    @Override
    public String toString(){
        return String.format("%s * %d @ $%.2f = $%.2f",
                product.getName(), quantity, priceAtOrder, getSubTotal());
    }
}