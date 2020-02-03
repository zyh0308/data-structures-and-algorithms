package code401challenges.stackandqueues;

public class PseudoQueue {

        public Stack stackOne;

        public Stack stackTwo;

        public PseudoQueue(){
            stackOne = new Stack();
            stackTwo = new Stack();
        }

        public void enqueue(int value){
            while(!stackTwo.isEmpty()) {
                stackOne.push(stackTwo.pop());
            }
            stackOne.push(value);
        }

        public int dequeue(){
            while(!stackOne.isEmpty()){
               stackTwo.push(stackOne.pop());
            }
            return stackTwo.pop();
        }
    }






