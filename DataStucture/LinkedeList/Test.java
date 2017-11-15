package LinkedeList;

import java.util.List;

public class Test {
    public static void main(String []args){
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);

        System.out.println(node);
        System.out.println(node2);

        LinkedList list = new LinkedList();

        list.isEmpty();

        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(0);
        list.insert(4);
        list.insert(4);
        list.insert(9);



        System.out.println(list.toString());

        System.out.println(list.count());

        System.out.println(list.search(5));

        System.out.println(list.delete(7));

        System.out.println(list.delete(2));

        System.out.println(list.toString());
    }


}
