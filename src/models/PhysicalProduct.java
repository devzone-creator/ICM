package models;

public class PhysicalProduct extends Product{
    private double weight;
    private String dimensions;

    public PhysicalProduct(String id, String name, String description, double price, int stock, double weight, String dimensions) {
        super(id, name, description, price, stock);
        this.weight = weight;
        this.dimensions = dimensions;
    }

    public double getWeight(){return weight;}
    public String getDimensions(){return dimensions;}


}
