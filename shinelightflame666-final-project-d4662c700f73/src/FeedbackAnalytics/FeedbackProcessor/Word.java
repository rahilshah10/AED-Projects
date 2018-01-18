/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeedbackAnalytics.FeedbackProcessor;

/**
 *
 * @author Zi Wei Fan
 */
public class Word {
    private String word;
    private double frequency;

    public Word() {
        this.word = word;
        this.frequency = frequency;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
    
   @Override
    public String toString() {
            return word;
    }
}
