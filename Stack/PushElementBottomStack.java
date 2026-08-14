//to push element at the bootom of the stack
import java.util.*;
class PushElementBottomStack{
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp=s.pop();
        pushAtBottom(s,data);
        s.push(temp);
    }
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtBottom(stack,4);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}