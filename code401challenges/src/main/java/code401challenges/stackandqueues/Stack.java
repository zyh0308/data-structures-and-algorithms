package code401challenges.stackandqueues;

import java.util.EmptyStackException;

public class Stack{
    Node top;

    public Stack(){
        this.top=null;

    }

    public boolean isEmpty(){
        if (this.top == null){
//
            return true;

        }else{
            return false;
        }

    }

    public void push(int data ){
        Node temp = new Node(data, this.top);
        this.top=temp;

    }

    public int pop() {
        if (!this.isEmpty()) {
            Node temp = this.top;
            this.top = top.next;
            return temp.data;

        } else {
            throw new EmptyStackException();

        }


    }

    public int peek(){
        if(!this.isEmpty()){
            return top.data;
        }else{
            throw new EmptyStackException();
        }

    }


}
