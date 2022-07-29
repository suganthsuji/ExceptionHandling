package com.exceptional;

import java.util.Scanner;

public class MoodAnalyzerMain {

    public static void main(String[] args) {

        //Get msgh from User
        Scanner sc=new Scanner(System.in);
        String mood = sc.nextLine();

        //MoodAnalyse Object
        MoodAnalyzerMain moodAnalyzer=new MoodAnalyzerMain();

        System.out.println(moodAnalyzer.analyseMood(mood));
    }

    //To analyse Mood Happy or Sad

    public String analyseMood(String msg){

       if(msg.equals("I am in Sad Mood")){
           return "Sad";
       }
       else if(msg.equals("I am in ANY Mood")){
           return "Happy";
       }

        return "No Mood";

    }

}
