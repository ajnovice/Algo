package Stack;

import java.util.Stack;

public class QueueUsingStack {
    static class Queue {

        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();


         static void enQueue(int x) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            while (!stack2.empty()) {
                stack1.push(stack1.pop());
            }
        }

         static int deQueue() {
            if (stack1.empty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return stack1.pop();
        }
    }

    public static void main(String[] args){
        Queue q = new Queue();
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}
