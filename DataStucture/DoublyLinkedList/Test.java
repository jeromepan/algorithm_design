package DoublyLinkedList;

public class Test {
    public static void main(String [] args){
        DoublyLinkedList list = new DoublyLinkedList();

        list.isEmpty();
        list.insert(1);
        list.insert(3);
        list.insert(4);

        list.insert(9);
        list.delete(4);

        System.out.println(list);
    }
}
