/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author sunwe_000
 */
public class OrderItem {
    private String orderNumber;
    private MarketOffer marketOffer;

    public OrderItem() {
        this.marketOffer=new MarketOffer();
    }
    private int number;
    private int sellingPrice;
    private int quantity;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public MarketOffer getMarketOffer() {
        return marketOffer;
    }

    public void setMarketOffer(MarketOffer marketOffer) {
        this.marketOffer = marketOffer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return quantity+"";
}
}
