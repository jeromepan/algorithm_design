package LinkedeList;

public class Node {
    private Node next;
    private int data;

    Node(){
        next = null;
        data = 0;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }

    public int getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public void setData(int data){
        this.data = data;
    }

    @Override
    public String toString(){
        return String.format("%d",this.data);
    }
}
