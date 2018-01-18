/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeedbackAnalytics.Feedback;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Zi Wei Fan
 */
public class FeedbackDirectory {
    private ArrayList<Feedback> FeedbackArrayList;

    public FeedbackDirectory() {
        this.FeedbackArrayList = new ArrayList<>();
    }

    public ArrayList<Feedback> getFeedbackArrayList() {
        return FeedbackArrayList;
    }

    public Feedback CreateFeedback(String Content){
        Feedback f = new Feedback();
        f.setContent(Content);
        FeedbackArrayList.add(f);
        return f;
    }
}
