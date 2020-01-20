package code401challenges.linkedlist;

public class LinkedList {

    //global node head

    Node head;

// create node class
    class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    //insert method

    public void insertToHead(int headValue){

        Node HeadNode = new Node(headValue, null);

        Node OldHead = this.head;

        this.head = HeadNode;

        this.head.next = OldHead;

    }

    //includes method

    public boolean include(int targetValue){
        Node current=this.head;
        while (current != null){

            if (targetValue == current.data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // toString method
    public String toString(){

        Node current = this.head;

        String overallStatement = "";

        while (current != null){

            String stringStatement = "{ " + current.data + " } => ";

            overallStatement = overallStatement + stringStatement;

            current = current.next;

        }

        return overallStatement + "null";

    }

    //code challenge 6
    //append


    //insertBefore

    //insertAfter




//code challenge 7

    public int lastList (int k){
        int counter=0;
        Node countNode=head;
        Node otherNode=head;
        while (countNode != null){
            counter++;
            countNode=countNode.next;
        }
        while (counter-k>1){
            counter--;
            otherNode=otherNode.next;

        }
        return otherNode.data;
    }

// code challenge 8



    

}







