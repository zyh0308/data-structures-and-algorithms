package code401challenges.tree;

public class FizzBuzzTree extends Tree{

    public FizzBuzzTree(Node<String> root){
        super(root);

    }

    private void fbHelper(Node<String> current) {
        int num = Integer.parseInt(current.value);
        if (num % 15 == 0) {
            current.value="FizzBuzz";
        } else if (num % 3 == 0) {
            current.value="Fizz";
        } else if (num % 5 == 0) {
           current.value="Buzz";
        }

    }


    public void fizzBuzzTree(){
      fizzBuzzTree(this.root);
    }

    private void fizzBuzzTree(Node<String> current){
        //base case
        if (current==null){
            return;
        }
        fbHelper(current);
        fizzBuzzTree(current.left);
        fizzBuzzTree(current.right);

    }
}