package managers;

import models.Customer;

import java.util.ArrayList;

public class CustomerManager {
    private ArrayList<Customer> customers;

    public CustomerManager(){
        this.customers = new ArrayList<>();
    }

    public boolean addCustomer(Customer customer){
        if(findCustomerById(customer.getId()) == null){
            customers.add(customer);
            return true;
        }
        return false;
    }

    public boolean removeCustomer(int id){
        Customer customer = findCustomerById(id);
        if(customer == null){
            customers.remove(customer);
            return true;
        }
        return false;
    }

    public Customer findCustomerById(int id){
        for (Customer customer : customers){
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getAllCustomers(){
        return customers;
    }

    public void displayAllCustomers(){
        if(customers.isEmpty()){
            System.out.println("No customers found.");
            return;
        }
        System.out.println("\n===== ALL CUSTOMERS =====");
        for(Customer customer : customers){
            System.out.println(customer);
        }
    }
}