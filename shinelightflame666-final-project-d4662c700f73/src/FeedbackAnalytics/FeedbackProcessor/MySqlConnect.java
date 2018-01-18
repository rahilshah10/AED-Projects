/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeedbackAnalytics.FeedbackProcessor;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Zi Wei Fan
 */
public class MySqlConnect {
     
      public static Connection connectDB(){
          Connection conn = null;
          try{
               Class.forName("com.mysql.jdbc.Driver");
               conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/feedbackanalysis?"+"user=root&password=Fanziwei123");
               return conn;
               //conn =DriverManager.getConnection("jdbc:mysql://localhost/test?" + "user=minty&password=greatsqldb");
          }catch(Exception e){
              return null;
          }
      }
}
