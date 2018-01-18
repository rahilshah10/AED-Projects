/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author rahil
 */
public class ProductCatalog {
    private ArrayList<Product> productCatalog;

    public ProductCatalog() {
        this.productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ArrayList<Product> productCatalog) {
        this.productCatalog = productCatalog;
    }

    public Product addProduct()
    {
    Product p = new Product();
    productCatalog.add(p);
    return p;
    }
    
    public void removeProductDirectory(Product p)
    {
        productCatalog.remove(p);
    }
    
    public Product searchProduct(int modelnum)
    {
    for(Product p:productCatalog)
    {
    if(p.getModelNumber()==modelnum)
    {
        return p;
    }
    }
    return null;
    }
}
