package code401challengespart2.repeatedWord;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedWord {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String input = sn.nextLine();
        String[] words = input.split(" ");

        Map<String,String> repeatedWordMap= new HashMap<String,String>();

        for(int i=0;i<words.length;i++){
            String singleWord = words[i].toLowerCase();
            if(repeatedWordMap.get(singleWord)!=null){
                System.out.println("Repeated word:"+ singleWord);
            }else {
                repeatedWordMap.put(singleWord,singleWord);
            }
        }

    }
    }
