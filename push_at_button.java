import java.util.Stack;

public class push_at_button {
    public static void pustATbutton(Stack<Integer>s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pustATbutton(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        pustATbutton(stack,6);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
