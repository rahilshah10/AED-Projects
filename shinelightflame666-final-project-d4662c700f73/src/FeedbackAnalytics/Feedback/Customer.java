/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeedbackAnalytics.Feedback;

/**
 *
 * @author Zi Wei Fan
 */
public class Customer {

    private String CustomerName;
    private FeedbackDirectory feedbackDirectory;
    private long id;

    public Customer(String CustomerName) {
        this.CustomerName = CustomerName;
        this.feedbackDirectory = new FeedbackDirectory();
        this.id = (long) System.currentTimeMillis();
    }

    public long getId() {
        return id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public FeedbackDirectory getFeedbackDirectory() {
        return feedbackDirectory;
    }

    @Override
    public String toString() {
        return CustomerName;
    }
}
