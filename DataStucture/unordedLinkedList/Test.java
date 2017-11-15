package unordedLinkedList;
// 5728309 jian pan
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String []args){

        unorderLinkedList list = new unorderLinkedList();

        System.out.println("input numbers of transactions:");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        ArrayList<Integer>  list1 = new ArrayList<>();
        for(int i = 0; i<a; i++){
            String b = input.next();
            if(b.equals("insert")){
                int c = input.nextInt();
                list1.add(list.insert(c));

            }else if(b.equals("find")){
                int d = input.nextInt();

                list1.add(list.find(d));
            }else if(b.equals("delete")){
                int e = input.nextInt();

                list1.add(list.delete(e));
            }
        }
        System.out.println(list1);
        System.out.println(list);
    }
}
