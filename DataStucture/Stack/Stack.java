package Stack;

public class Stack <T>{
    private Node<T> top;

    public Stack(){
        this.top = null;
    }

    public boolean isFull(){
        return false;
    }

    public  boolean isEmpty(){
        return top == null;
    }
    public boolean push(T item){
        Node<T> newNode = new Node<T>(item);

        if(isEmpty()){
            top = newNode;
            return true;
        }else {
            newNode.setNext(top);
            top = newNode;
            return true;
        }

    }

    public T pop(){
        if(isEmpty()){
            return null;
        }else {
            T item = top.getData();
            top = top.getNext();
            return item;
        }
    }

    public T getTopItem(){
        if(isEmpty()){
            return null;
        }else {
            return top.getData();
        }
    }

    @Override
    public String toString(){
        return top.toString();
    }
}
