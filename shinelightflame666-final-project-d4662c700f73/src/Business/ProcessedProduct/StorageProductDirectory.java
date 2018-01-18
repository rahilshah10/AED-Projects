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
public class StorageProductDirectory {

    private ArrayList<StorageProduct> storageProductList;

    public StorageProductDirectory() {
        this.storageProductList = new ArrayList<>();
    }

    public ArrayList<StorageProduct> getStorageProductList() {
        return storageProductList;
    }

    public void setStorageProductList(ArrayList<StorageProduct> storageProductList) {
        this.storageProductList = storageProductList;
    }
 public StorageProduct addStorageProduct() {
        StorageProduct storageProduct = new StorageProduct();
        storageProductList.add(storageProduct);
        return storageProduct;
    }

    public void removeStorageProduct(StorageProduct storageProduct) {
        storageProductList.remove(storageProduct);
    }
}
