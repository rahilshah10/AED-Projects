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
public class MarketOfferCatalog {
//    private Market market;
    private String market;
    private ArrayList<MarketOffer> productsOffer;

    public MarketOfferCatalog() {
        this.productsOffer = new ArrayList<MarketOffer>();
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

//    public Market getMarket() {
//        return market;
//    }
//
//    public void setMarket(Market market) {
//        this.market = market;
//    }

    public ArrayList<MarketOffer> getProductsOffer() {
        return productsOffer;
    }

    public void setProductsOffer(ArrayList<MarketOffer> productsOffer) {
        this.productsOffer = productsOffer;
    }
    
    public MarketOffer addOffer()
    {
        MarketOffer marketOffer = new MarketOffer();
        productsOffer.add(marketOffer);
        return marketOffer;
    }
    
    public void removeOffer(MarketOffer offer)
    {
        for(int i=0; i<productsOffer.size();i++)
        {
            int pn = productsOffer.get(i).getProduct().getModelNumber();
            if(pn==offer.getProduct().getModelNumber())
                productsOffer.remove(i);
        }
    }
}
