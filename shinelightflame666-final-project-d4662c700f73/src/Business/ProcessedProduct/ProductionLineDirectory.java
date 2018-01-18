/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ProcessedProduct;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class ProductionLineDirectory {
     private ArrayList<ProductionLine> productionLineList;
     
     public ProductionLineDirectory(){
         this.productionLineList = new ArrayList<>();
     }

    public ArrayList<ProductionLine> getProductionLineList() {
        return productionLineList;
    }

    public void setProductionLineList(ArrayList<ProductionLine> productionLineList) {
        this.productionLineList = productionLineList;
    }
      public ProductionLine addProductionLine() {
        ProductionLine productionLine = new ProductionLine();
        productionLineList.add(productionLine);
        return productionLine;
    }
}
