package ss11_stack_queue.bai_tap;

import ss11_stack_queue.thuc_hanh.stack.MyGenericStack;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        Stack mStack = new Stack();
        Stack wStack = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your type: ");
        String string = sc.nextLine();

        for (int i = 0; i < string.length(); i++) {
            mStack.push(string.charAt(i));
        }
        while(!mStack.isEmpty()){
            wStack.push(mStack.pop());
        }
        System.out.println(wStack);
    }

}
