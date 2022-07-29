package com.exceptional;

import java.util.Scanner;

public class MoodAnalyser {

    //Using Enum
    public static final String EMPTY_ERROR = "EMPTY MOOD ";
    private String mood;
    public MoodAnalyser(){

    }
    public MoodAnalyser(String msg){
        this.mood=msg;
    }
    //To analyse Mood Happy or Sad

    public String analyseMood(){

        Scanner sc=new Scanner(System.in);
        String mood="";

        //Using try catch to analyse the mood
        try {
            System.out.println("Enter Your Mood");
             mood = sc.nextLine();
            //if String is Empty throw Empty String Error
            if (mood.isEmpty()) {
                throw new MoodAnalysisException(EMPTY_ERROR);
            }
            if (this.mood.equals("I am in Sad Mood")) {
                mood= "Sad";
            } else if (this.mood.equals("I am in ANY Mood")) {
                mood="Happy";
            }
            else{
                throw new MoodAnalysisException("Im Happy");
            }
        }
        catch(Exception e){

            System.out.println(e);

        }
        return mood;

    }

}
