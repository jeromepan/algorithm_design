package unordedLinkedList;
// 5728309 jian pan
public class unorderLinkedList {
    private Node head;

    unorderLinkedList(){
        this.head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int insert(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = newNode;
            return 1;
        }else {
            Node previous = head;
            Node current = head.getNext();

            while(current != null){
                previous = previous.getNext();
                current = current.getNext();
            }

            previous.setNext(newNode);
            newNode.setNext(current);

            return 1;
        }
    }


    public int find(int data){
        //int index = 0;
        Node current = head;

        while(current != null){

            if(isEmpty()){
                return 0;
            }

            current = current.getNext();
           // index++;

        }


        return 1;

    }


    public int delete(int data){

        if(isEmpty() || find(data) == 0){
            return 0;
        }else if(data == head.getData()) {
            head = head.getNext();
            return 1;
        }else{
            Node previous = head;
            Node current = head.getNext();
            Node next = current.getNext();

            while(current != null){

                if(data == current.getData()){
                    previous.setNext(next);
                    return 1;
                }

                previous = previous.getNext();
                current = current.getNext();
                next = next.getNext();
            }


        }

        return 0;
    }

    public int count(){
        int count = -1;
        Node current = head;

        if(current != null){

            current = current.getNext();
            count++;
        }

        return count;
    }


    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        Node current = head;

        while (current != null){
            result.append(current.getData() + " ");
            current = current.getNext();
        }

        result.append("]");
        return result.toString();
    }


}
