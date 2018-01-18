/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author rahil
 */
public class Supplier {
    private String SupplierName;
    private ProductCatalog pc;

    public Supplier() {
        this.pc = new ProductCatalog();
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public ProductCatalog getPc() {
        return pc;
    }

    public void setPc(ProductCatalog pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return SupplierName;
    }
    
    
    
}
