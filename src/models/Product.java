package models;

public abstract class Product {
    private String id;
    private String name;
    private String description;
    private double price;
    private int stock;

    public Product(String id, String name, String description, double price, int stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        if(stock >= 0){
            this.stock = stock;
        }
    }

    public void addStock(int quantity){
        if(quantity > 0){
            this.stock += quantity;
        }
    }

    public boolean reduceStock(int quantity){
        if(quantity > 0 && this.stock >= quantity){
            this.stock -= quantity;
            return true;
        }
        return false;
    }

    public abstract String getProductType();

    @Override
    public String toString(){
        return String.format("%s [ID: %s] - $%.2f(stock: %d)",
                name, id, price, stock);
    }
}