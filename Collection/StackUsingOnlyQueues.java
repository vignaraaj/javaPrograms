import java.util.*;
public class StackUsingOnlyQueues {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        static void push(int x) {
            q2.add(x); // Push x first in empty q2
            while (!q1.isEmpty()) {// Push all the remaining elements in q1 to q2.
                q2.add(q1.peek());
                q1.remove();
            }
            Queue<Integer> q = q1; // swap the names of two queues
            q1 = q2;
            q2 = q;
        }
        static void pop() {
            if (q1.isEmpty()) return; // if no elements are there in q1
            q1.remove();
        }
        static int top() {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }
        static int size() { return q1.size(); }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println("current size: " + s.size());
    }
}

