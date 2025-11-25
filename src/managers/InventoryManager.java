package managers;

import models.Product;

import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<Product> products;

    public InventoryManager(){
        this.products = new ArrayList<>();
    }

    public boolean addProduct(Product product){
        if(findProductById(product.getId()) == null){
            products.add(product);
            return true;
        }
        return false;
    }

    public boolean removeProduct(String id){
        Product product = findProductById(id);
        if(product != null){
            products.remove(product);
            return true;
        }
        return false;
    }

    public Product findProductById(){

    }
}