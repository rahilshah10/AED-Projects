/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeedbackAnalytics.FeedbackProcessor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Zi Wei Fan
 */
public class WordProcessor {

    String query = null;
    Statement st = null;
    ArrayList<Word> arraylistWord = new ArrayList<>();

    //Clean Sentence: clean up the single word.
    public String cleanSentence(String feedback){
        String strFilteredFeedback = cleanSingleWord(feedback);
        strFilteredFeedback = cleanEmptyWord(strFilteredFeedback);
        return strFilteredFeedback;
    }
    
    public ArrayList<Word> cleanPunctuation(String feedback){
        String feedbackFiltered = feedback.replaceAll("[\\pP\\p{Punct}]","");
        String[] stringListFeedbackFiltered = feedbackFiltered.split(" ");
        
         ArrayList<Word> arraylistWords = new ArrayList<>();
         for(String s: stringListFeedbackFiltered){
             Word word = new Word();
             word.setWord(s);
             word.setFrequency(0.0);
             arraylistWords.add(word);
         }
         return arraylistWords;
    }
    
    public String cleanSingleWord(String feedback){
        //Remove the words with the length less than 2 chars.
        List<String> wordList = new ArrayList<String>(Arrays.asList(feedback.split(" ")));
        ArrayList<String> arrayList = new ArrayList<String>(wordList);
        
       for(String s: wordList){
            if(s.length()<=2){
                arrayList.remove(s);
            }
        }
        String filteredFeedback = String.join(",", arrayList);
        return filteredFeedback;
    }
    
    public  String cleanEmptyWord(String feedback){
        //Remove the word without meanning.
        String emptyWord ="the,you,must,should,may,have,an,a,one,might,could,can";
        List<String> wordList = new ArrayList<String>(Arrays.asList(feedback.split(" ")));
        
        String[] emptyWordList = emptyWord.split(",");
        for(String s:emptyWordList){
            if(wordList.contains(s)){ //equalsIgnoreCase
                wordList.remove(s);
            }
        }
        String filteredFeedback = String.join(",", wordList);
        return filteredFeedback;
    }
    
    public double getFrequency(String wordString, ResultSet rs, Connection conn) {
        double frquency = 0.0;

        try {
            query = "SELECT frequency FROM symptom WHERE symptomName LIKE '%" + wordString + "%' ";
            st = conn.createStatement();
            rs = st.executeQuery(query);

            if (rs.next()) {
                frquency = rs.getDouble("frequency");
            }
            st.close();
        } catch (Exception e) {
            frquency = 0.0;
        }

        return frquency;
    }

    public boolean ConnectDB(Connection conn) {
        boolean isInserted = false;
        conn = MySqlConnect.connectDB();
        if (conn != null) {
            isInserted = true;
        } else {
            isInserted = false;
        }
        return isInserted;
    }
    
    public List<String> splitString(String feedback){
        List<String> items = Arrays.asList(feedback.split(","));
        return items;
    }
    
    public Word generateWord(String wordContent, double frequency){
        Word word = new Word();
        word.setWord(wordContent);
        word.setFrequency(frequency);
        arraylistWord.add(word);
        return word;
    }

    public ArrayList<Word> getArraylistWord() {
        return arraylistWord;
    }  

}
