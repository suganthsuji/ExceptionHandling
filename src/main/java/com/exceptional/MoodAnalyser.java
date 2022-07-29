package com.exceptional;

public class MoodAnalyser {

    private String mood;
    public MoodAnalyser(){

    }
    public MoodAnalyser(String msg){
        this.mood=msg;
    }
    //To analyse Mood Happy or Sad

    public String analyseMood(){

        if(this.mood.equals("I am in Sad Mood")){
            return "Sad";
        }
        else if(this.mood.equals("I am in ANY Mood")){
            return "Happy";
        }

        return "No Mood";

    }

}
