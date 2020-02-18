package code401challengespart2.hashtable;

import code401challenges.linkedlist.LinkedList;

import static java.util.Objects.hash;

public class Hashtable {
    int size;
    public Node[] hashtable;

    public Hashtable (int size){
        this.size=size;
        this.hashtable=new Node[size];

    }

    private int hash(String key){
        int hashValue=0;
        for(int i=0; i<key.length(); i++){
            hashValue+=(int)key.charAt(i);
        }
        hashValue=(hashValue*599)%this.size;
        return hashValue;
    }

    //add method
    public void add(String key, String value){
        int point=hash(key);
        if (hashtable[point]==null){
            hashtable[point]=new Node(key,value);
        }
        else{
            Node pointer=hashtable[point];
            hashtable[point]=new Node(key,value);
            hashtable[point].next=pointer;
        }

    }

    //get method

    public String get(String key){
        int point = hash(key);
        if(hashtable[point] != null){
            return hashtable[point].value;
        }
        return null;
    }



    //contains method

    public Boolean contains(String key){
        int point =hash(key);
        return hashtable[point]!=null;

    }





}
