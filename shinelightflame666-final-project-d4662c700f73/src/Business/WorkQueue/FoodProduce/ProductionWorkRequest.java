/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue.FoodProduce;

import Business.Poultry.ChickenShed;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author Urja
 */
public class ProductionWorkRequest extends WorkRequest {
    private ArrayList<ChickenShed> chickenshedrequest;
    
    public ProductionWorkRequest() {
        this.chickenshedrequest = new ArrayList<>();
    }

    public ArrayList<ChickenShed> getChickenshedrequest() {
        return chickenshedrequest;
    }

    public void setChickenshedrequest(ArrayList<ChickenShed> chickenshedrequest) {
        this.chickenshedrequest = chickenshedrequest;
    }


    public ChickenShed addChickenShedRequest() {
        ChickenShed chickenShed = new ChickenShed();
        chickenshedrequest.add(chickenShed);
        return chickenShed;
    }

    public void removeChickenShed(ChickenShed chickenshed) {
        chickenshedrequest.remove(chickenshed);
    }
}
