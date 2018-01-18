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
public class StorageProduct {

    private String porductName;
    private String humidity;
    private String tempreture;
    private String producerName;
    private String storageQuantity;

    public String getPorductName() {
        return porductName;
    }

    public void setPorductName(String porductName) {
        this.porductName = porductName;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTempreture() {
        return tempreture;
    }

    public void setTempreture(String tempreture) {
        this.tempreture = tempreture;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getStorageQuantity() {
        return storageQuantity;
    }

    public void setStorageQuantity(String storageQuantity) {
        this.storageQuantity = storageQuantity;
    }

}
