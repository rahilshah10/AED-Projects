/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.storageclass;

import java.util.ArrayList;

/**
 *
 * @author Zi Wei Fan
 */
public class productDirectory {
    private ArrayList<Product> productlist;

    public productDirectory() {
        this.productlist = new ArrayList<>();
    }

    public ArrayList<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(ArrayList<Product> productlist) {
        this.productlist = productlist;
    }
    
    public Product addProduct() {
        Product product = new Product();
        productlist.add(product);
        return product;
    }

    public void removeProduct(Product product) {
        productlist.remove(product);
    }
}
