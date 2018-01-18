/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ProcessedProduct;

/**
 *
 * @author apple
 */
public class ProductionLine {

    private String productionLineID;
    private String name;
    private String lineHumidity;
    private String lineTempreture;
    private String status;

    public String getProductionLineID() {
        return productionLineID;
    }

    public void setProductionLineID(String productionLineID) {
        this.productionLineID = productionLineID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLineHumidity() {
        return lineHumidity;
    }

    public void setLineHumidity(String lineHumidity) {
        this.lineHumidity = lineHumidity;
    }

    public String getLineTempreture() {
        return lineTempreture;
    }

    public void setLineTempreture(String lineTempreture) {
        this.lineTempreture = lineTempreture;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
