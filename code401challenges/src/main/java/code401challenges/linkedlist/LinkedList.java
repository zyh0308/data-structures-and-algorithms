package code401challenges.linkedlist;

public class LinkedList {

    //global node head

    public Node head;

// create node class
    public class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data){
            this.data=data;
            this.next=null;
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
    public void append(int data) {
        Node newNode = new Node(data);
        Node firstNode = head;
        while (firstNode.next != null) {
            firstNode = firstNode.next;
        }
        firstNode.next = newNode;
    }

    //insertBefore

    public void insertBefore(int target, int data) {
        Node newNode = new Node(data);

        Node firstNode = head;
        if (head.data==target){
            head=new Node(data,head);
            return;
        }
        while (firstNode.next != null && firstNode.next.data!= target) {
            firstNode = firstNode.next;
        }
        if (firstNode.next ==null){
            throw new IllegalArgumentException();
        }
        newNode.next = firstNode.next;
        firstNode.next = newNode;
    }

    //insertAfter

    public void insertAfter(int target, int data) {
        Node newNode = new Node(data);
        Node firstNode = head;
        while (firstNode.data != target) {
            firstNode = firstNode.next;
        }
        if (firstNode==null){
            throw new IllegalArgumentException();
        }
        newNode.next = firstNode.next;
        firstNode.next = newNode;
    }






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

    public static LinkedList mergeLists(LinkedList listOne, LinkedList listTwo)
    {
        Node listOneCurr = listOne.head;
        Node listTwoCurr = listTwo.head;


        while (listOneCurr != null && listTwoCurr != null)
        {
            listTwo.head = listTwoCurr.next;
            listTwoCurr.next= listOneCurr.next;
            listOneCurr.next = listTwoCurr;
            listOneCurr = listTwoCurr.next;
            listTwoCurr = listTwo.head;
        }
        return listOne;
    }

}

    









