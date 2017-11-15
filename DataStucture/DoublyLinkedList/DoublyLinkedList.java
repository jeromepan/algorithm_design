package DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        return (head == null && tail == null);
    }

    public boolean insert(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = head;
            return true;
        }else if(data < head.getData()){
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
            return true;
        }else if(data <= tail.getData() && data > head.getData()){
            head.setNext(newNode);
            newNode.setPrevious(head);
            newNode.setNext(tail);
            tail.setPrevious(newNode);
            return true;
        }else if(data > tail.getData()){
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
            return true;
        }
        return false;
    }

    public boolean delete(int data){

        if(isEmpty()){
            return false;
        }else if(data == head.getData()){
            head = head.getNext();
            head.setPrevious(null);
            return true;
        }else if(data > head.getData() && data != tail.getData()){
            Node previous = head;
            Node current = previous.getNext();
            Node next = current.getNext();

            while (current != null){
                if(data == current.getData()){
                    previous.setPrevious(next);
                    next.setPrevious(previous);
                    return true;
                }

                previous = previous.getNext();
                current = current.getNext();
                next = next.getNext();
            }
            return true;
        }else if(data == tail.getData()){
            Node previous = tail.getPrevious();
            previous.setNext(null);
            return true;
        }
        return false;

    }

    public int search(int key){
        int index = 0;
        Node current = head;
        while(current != null){
            if(key == current.getData()){
                return index;
            }

            current = current.getNext();
            index++;
        }
        return -1;
    }

    public int count(){
        int count = -1;
        Node current = head;
        while(current != null){
            count++;
            current = current.getNext();
        }
        return count;

    }


    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[ ");
        Node current = head;

        while(current != null){
            result.append(current.getData() + " ");
            current = current.getNext();
        }

        result.append(" ]");
        return result.toString();
    }
}
