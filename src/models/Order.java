package models;

//claude-sonnet version

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<OrderItem> items;
    private Date orderDate;
    private String status;

    public Order(String orderId, Customer customer, ArrayList<OrderItem> items, Date orderDate, String status) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.orderDate = orderDate;
        this.status = status;
    }

    public String getOrderId() {return orderId;}
    public Customer getCustomer() {return customer;}
    public ArrayList<OrderItem> getItems() {return items;}
    public Date getOrderDate() {return orderDate;}
    public String getStatus() {return status;}

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItems(ArrayList<OrderItem> items) {
        this.items = items;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean addItem(Product product, int quantity){
        if(product.getStock() >= quantity){
            items.add(new OrderItem(product, quantity));
            return true;
        }
        return false;
    }

    public void removeItem(int index){
        if(index >= 0 && index < items.size()){
            items.remove(index);
        }
    }

    public double calculateTotal(){
        double total = 0;
        for (OrderItem item : items){
            total += item.getSubTotal();
        }
        return total;
    }

    @Override
    public String toString(){
        return String.format("Order %s - Customer: %s - Total: $%.2f - Status: %s ",
                orderId, customer.getName(), calculateTotal(), status);
    }
}