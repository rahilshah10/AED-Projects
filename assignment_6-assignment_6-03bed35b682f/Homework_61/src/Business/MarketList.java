/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author sunwe_000
 */
public class MarketList {
    private ArrayList<Market> marketList;

    public MarketList() {
        this.marketList = new ArrayList<Market>();
    }
    
    public int Selling()
    {
        int sell =0;
        for(Market m : this.marketList)
        {
            sell+=m.marketSelling();
        }
        return sell;
    }
    public int Target()
    {
        int target = 0;
       for(Market m : this.marketList)
        {
            target+=m.marketTarget();
        }
       return target;
    }

    public ArrayList<Market> getMarketList() {
        return marketList;
    }

    public void setMarketList(ArrayList<Market> marketList) {
        this.marketList = marketList;
    }
    
    public Market addMarket()
    {
        Market m = new Market();
        marketList.add(m);
        return m;
    }
    
    public Market searchMarket(String name)
    {
        for(Market m : marketList)
        {
            if(m.getMarketName().equals(name))
                return m;
        }
        return null;
        
    }
}
