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
public class Product {
    private String productName;
    private int modelNumber;
    private int availibility;
    private static int count=0;
    private int soldNum;

    public Product() {
        this.modelNumber = count;
        count++;
        soldNum = 0;
    }

    public int getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(int num) {
        this.soldNum = soldNum+num;
    }

    
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public static int getCount() {
        return count;
    }
    public int getAvailibility() {
        return availibility;
    }

    public void setAvailibility(int availibility) {
        this.availibility = availibility;
    }

    @Override
    public String toString() {
        return productName;
    }
    
    
}
