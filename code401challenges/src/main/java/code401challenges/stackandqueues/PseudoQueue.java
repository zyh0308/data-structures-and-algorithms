package code401challenges.stackandqueues;

public class PseudoQueue<E> {

        public Stack<E> stackOne;

        public Stack<E> stackTwo;

        public PseudoQueue(){
            stackOne = new Stack<>();
            stackTwo = new Stack<>();
        }

        public void enqueue(E value){
            while(!stackTwo.isEmpty()) {
                stackOne.push(stackTwo.pop());
            }
            stackOne.push(value);
        }

        public E dequeue(){
            while(!stackOne.isEmpty()){
               stackTwo.push(stackOne.pop());
            }
            return stackTwo.pop();
        }
    }






