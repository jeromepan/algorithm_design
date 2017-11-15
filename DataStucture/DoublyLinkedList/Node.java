package DoublyLinkedList;

public class Node {
    private Node previous;
    private int data;
    private Node next;

    public Node(){
        previous = null;
        data = -1;
        next = null;
    }

    public Node(int data){
        this.previous = null;
        this.data = data;
        this.next = null;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getPrevious(){
        return previous;
    }

    public void setPrevious(Node previous){
        this.previous = previous;

    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    @Override
    public String toString(){
        return String.format("%d", data);
    }


}
