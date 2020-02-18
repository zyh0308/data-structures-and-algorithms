package code401challengespart2.hashtable;

public class Node {
    public Node next;
    public String value;

    public Node(String key, String value) {
        this.value=value;
        this.next = null;
    }
    public Node(String value, Node nextNode) {
        this.value=value;
        this.next = nextNode;
    }
}
