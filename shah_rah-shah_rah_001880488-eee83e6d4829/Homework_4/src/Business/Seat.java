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
public class Seat {
    private String modelNo;
    private String custId;
    private String SeatNo;
    private String SeatType;
    private boolean SeatAvailibility;
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    public String getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(String SeatNo) {
        this.SeatNo = SeatNo;
    }
    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getSeatType() {
        return SeatType;
    }

    public void setSeatType(String SeatType) {
        this.SeatType = SeatType;
    }

    public boolean isSeatAvailibility() {
        return SeatAvailibility;
    }

    public void setSeatAvailibility(boolean SeatAvailibility) {
        this.SeatAvailibility = SeatAvailibility;
    }

}
