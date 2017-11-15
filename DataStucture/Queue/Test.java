package Queue;

public class Test {
    public static void main(String []args){
        Queue queue = new Queue();

        queue.enqueue("s");
        queue.enqueue("t");
        //queue.enqueue("jfiej");
        queue.enqueue(3);
       // queue.dequeue();
        //System.out.println(queue.isEmpty());
        System.out.println(queue.getFrontItem());

        //queue.dequeue();


        while(queue.isEmpty() == false){
            System.out.print(queue.toString() + " ");
            System.out.println(queue.dequeue());
        }

    }
}
