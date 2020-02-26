package code401challenges.stackandqueues;

import java.util.NoSuchElementException;

public class Queue<E> {
    Node<E> front;
    Node<E> back;

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

    public void enqueue(E data){
        Node<E> temp=new Node<E>(data,null);
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

    public E dequeue(){
        if(this.isEmpty()){
            throw new NoSuchElementException();

        }else if (this.front==this.back){
            Node<E> temp =this.front;
            this.front=this.back=null;
            return temp.data;
        }else{
            Node<E> temp=this.front;
            this.front=this.front.next;
            return temp.data;

        }


    }

    public E peek(){
        if(this.isEmpty()){
            throw new NoSuchElementException();

        }else{
            return front.data;
        }

    }

    ///https://stackoverflow.com/questions/31818773/working-with-a-tostring-and-a-queue-in-java ////

    @Override
    public String toString() {

        if (isEmpty()) {
            return " ";
        }

        StringBuilder sb = new StringBuilder();
        Node<E> next =front;

        sb.append(next.data);
        next = next.next;

        while(next != null){
            sb.append(" => ").append(next.data);
            next = next.next;
        }

        return sb.toString();

    }
}
