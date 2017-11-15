package LinkedeList;

public class LinkedList {
    Node head;

    LinkedList(){
        this.head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean insert(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return true;
        }else if(data < head.getData()){
            newNode.setNext(head);
            head = newNode;
            return true;
        }else {

            Node previous = head;
            Node current = head.getNext();

            while (current != null && current.getData()< data){
                previous = previous.getNext();
                current = current.getNext();
            }

            previous.setNext(newNode);
            newNode.setNext(current);

            return true;
        }
    }

    public boolean delete(int data){
        if(isEmpty() || search(data) == -1){
            return false;
        }else if(data == head.getData()){
            head = head.getNext();
            return true;
        }else {
            Node previous = head;
            Node current = head.getNext();
            Node next = current.getNext();

            while(current != null){

                if(current.getData() == data){
                    previous.setNext(next);
                    return true;
                }
                previous = previous.getNext();
                current = current.getNext();
                next = next.getNext();
            }

            return false;
        }
    }


    public int count(){
        int count = -1;
        Node current = head;

        while (current != null){
            count++;
            current = current.getNext();
        }

        return count;
    }




    public int search(int key){
        int index = 0;
        Node current = head;

        while(current != null){
            if(isEmpty()){
                return index;
            }

            current = current.getNext();
            index++;
        }

        return -1;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        Node current = head;

        while(current != null){
            result.append(current.getData()+" ");
            current = current.getNext();
        }

        result.append("]");
        return result.toString();
    }
}
