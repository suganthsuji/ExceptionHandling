package com.exceptional;

import java.util.Scanner;

public class MoodAnalyzerMain {

    public static void main(String[] args) {

        //Get msgh from User
        Scanner sc=new Scanner(System.in);
        String mood = sc.nextLine();

        //MoodAnalyse Object
        MoodAnalyser moodAnalyzer=new MoodAnalyser(mood);

        System.out.println(moodAnalyzer.analyseMood());
    }



}
