package code401challenges.stackandqueues;

import java.util.EmptyStackException;

public class Stack<E>{
    Node<E> top;

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

    public void push(E data ){
        Node<E>  temp= new Node<>(data, this.top);
        this.top=temp;

    }

    public E pop() {
        if (!this.isEmpty()) {
            Node<E> temp = this.top;
            this.top = top.next;
            return temp.data;

        } else {
            throw new EmptyStackException();

        }


    }

    public E peek(){
        if(!this.isEmpty()){
            return top.data;
        }else{
            throw new EmptyStackException();
        }

    }


}
