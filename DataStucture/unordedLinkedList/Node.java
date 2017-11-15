package unordedLinkedList;
// 5728309 jian pan
public class Node {
    private int data;
    private Node next;

    Node(){
        data = 0;
        next = null;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next  = next;
    }

    @Override
    public String toString(){
        return String.format("%d", this.data);
    }
}
