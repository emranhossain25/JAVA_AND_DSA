import java.util.Stack;

public class stack_reverse {
    public static void pustATbutton(Stack<Integer>s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pustATbutton(s,data);
        s.push(top);
    }

    public static void reverse(Stack<Integer>s){
        if (s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverse(s);
        pustATbutton(s,top);
    }
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        reverse(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
