import java.util.*;

public class Queue1 {

    static class Quiue {

        static Stack<Integer> q1 = new Stack<>();
        static Stack<Integer> q2 = new Stack<>();

        public static boolean isEmpty() {
            return q1.isEmpty();
        }

        public static void add(int data) {

            while (!q1.isEmpty()) {
                q2.push(q1.pop());
            }

            q1.add(data);

            while (!q2.isEmpty()) {
                q1.push(q2.pop());
            }
        }

        public static int remove() {
            return q1.pop();
        }

        public static int peek() {
            return q1.peek();
        }
    }

    public static void main(String args[]) {

    }
}