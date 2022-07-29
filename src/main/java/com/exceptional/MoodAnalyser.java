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

        String mood="";

        //Using try catch to analyse the mood
        try {
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
