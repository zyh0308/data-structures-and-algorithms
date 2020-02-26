package code401challengespart2.repeatedWord;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedWord {

    public String repeatedWord(String sentence) {
        int counter = 0;

        String[] words = sentence.toLowerCase().split(" ");
        String [] checking = new String [words.length];
        String [] result = new String [checking.length];
        int k = 0;
        for (int i = 0; i < words.length && k < 1; i++) {
            for (int j = i + 1; j < words.length && k < 1; j++) {
                if (words[i].equals(words[j])) {
                    checking[i] = words[i];
                    k = 10;
                }
            }
        }
        for(int i = 0; i < checking.length; i++){
            if(checking[i] != null){
                result[i] = checking[i];
            }
        }

        if(result[0] != null){
            return result[0];
        }
        else{
            return "There is no repeated words";
        }

    }

    }
