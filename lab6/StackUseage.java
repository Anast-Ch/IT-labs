package lab6;

public class StackUseage {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>(2);
        System.out.println(stack.peek());
        stack.push(1);
        stack.push(100);
        stack.push(1000);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
