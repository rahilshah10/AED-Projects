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
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;

    public SupplierDirectory() {
    this.supplierList = new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
    public Supplier addSupplier()
    {
    Supplier s = new Supplier();
    supplierList.add(s);
    return s;
    }
    
    public void removeSupplier(Supplier s)
    {
    supplierList.remove(s);
    }
    
    public Supplier searchSupplier(String name)
    {
        for(Supplier s : supplierList)
        {
        if(s.getSupplierName().equalsIgnoreCase(name))
        {
        return s;
        }
        }
        return null;
    }
    
}
