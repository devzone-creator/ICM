package models;

public abstract class Customer extends Person{
    private int loyaltyPoints;
    private String address;

    public Customer(int id, String name, String email, int phone, String address){
        super(id, name, email, phone);
        this.address = address;
        this.loyaltyPoints = 0;
    }

    public int getLoyaltyPoints(){
        return loyaltyPoints;
    }
    public String getAddress(){
        return address;
    }

    public void setLoyaltyPoints(int loyaltyPoints){
        this.loyaltyPoints = loyaltyPoints;
    }

    public void setAddress(String address){
        this.address = address;
    }
}