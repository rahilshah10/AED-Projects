/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeedbackAnalytics.DBOperation;

import FeedbackAnalytics.FeedbackProcessor.Word;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zi Wei Fan
 */
public class DBOperator {

    public ResultSet getFeedbacks(Connection conn) {

        ResultSet rs= null;
        String sql = "SELECT CustomerName, content"
                + " FROM feedbackanalysis.feedback" 
                +" JOIN feedbackanalysis.customer" 
                +" ON feedback.CustomerID = customer.customerID";

        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);

           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public DefaultTableModel getRestaurantFeedback(Connection conn) {

        DefaultTableModel model = new DefaultTableModel(new String[]{"FeedbackDate","CustomerName", "property", "targetProduct"}, 0);
        String sql = "SELECT FeedbackDate,CustomerName, property, targetProduct, content"
                + " FROM feedbackanalysis.feedback" 
                +" JOIN feedbackanalysis.customer" 
                +" ON feedback.CustomerID = customer.customerID";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String FeedbackDate = rs.getString("FeedbackDate");
                String property = rs.getString("property");
                String targetProduct = rs.getString("targetProduct");
                String id = rs.getString("CustomerName");
                String e = rs.getString("content");
                
                model.addRow(new Object[]{FeedbackDate, property, id, e, property});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return model;
    }
    
    public ResultSet getFeedback(Connection conn) {
        String feedback = null;
        String sql = "SELECT content FROM feedbackanalysis.feedback";
        ResultSet rs = null;

        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public String getCity(Connection conn, String feedbackID) {
        //feedback-->RestaurantID-->CityId-->City
        String cityName = null;
        String sql = "SELECT CityName FROM city WHERE CityId = ("
                + "SELECT CityId FROM feedbackanalysis.restaurant WHERE RestaurantId = ("
                + "SELECT RestaurantID FROM feedbackanalysis.feedback WHERE id = '" + feedbackID + "' ))";
        ResultSet rs = null;

        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cityName = rs.getString("CityName");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cityName;
    }

    public String getFeedbackID(Connection conn, Word word) {
        String feedbackID = null;
        String sql = "SELECT id"
                + " FROM feedbackanalysis.feedback"
                + " WHERE content LIKE '%" + word.getWord() + "%'";
        ResultSet rs = null;

        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                feedbackID = rs.getString("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return feedbackID;
    }

    public ResultSet getRestaurantList(Connection conn) {
        String sql = "SELECT RestaurantName FROM feedbackanalysis.restaurant;";
        ResultSet rs = null;

        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    
}
