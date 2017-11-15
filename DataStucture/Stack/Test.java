package Stack;

public class Test {
    public static void main(String []args){
        Stack stack = new Stack();

        stack.push(3);
        stack.push("t");
        stack.push("d");

        while (stack.isEmpty() == false){
            System.out.println(stack.pop());

        }
    }
}
