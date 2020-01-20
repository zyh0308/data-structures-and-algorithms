package code401challenges.stackandqueues;

import java.util.NoSuchElementException;

public class Queue {
    Node front;
    Node back;

    public Queue(){
        this.front=null;
        this.back=null;
    }


    public boolean isEmpty(){
        if (this.front == null){
            return true;

        }else{
            return false;
        }

    }

    public void enqueue(int data){
        Node temp=new Node(data,null);
        if (this.isEmpty()) {
            this.front = this.back = temp;
        }
        else if(this.front==this.back){
            this.front.next=temp;
            this.back=temp;

        }else{
            this.back.next=temp;
            this.back=temp;

        }


    }

    public int dequeue(){
        if(this.isEmpty()){
            throw new NoSuchElementException();

        }else if (this.front==this.back){
            Node temp =this.front;
            this.front=this.back=null;
            return temp.data;
        }else{
            Node temp=this.front;
            this.front=this.front.next;
            return temp.data;

        }


    }

    public int peek(){
        if(this.isEmpty()){
            throw new NoSuchElementException();

        }else{
            return front.data;
        }

    }





}
