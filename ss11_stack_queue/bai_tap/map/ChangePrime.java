package ss11_stack_queue.bai_tap.map;

import ss10_array_list.array_list.linked_list.linked_list.LinkedList;

public class ChangePrime<T> {
    private LinkedList<T> Stack;

    public void MyStack() {
        Stack = new LinkedList<>();
    }

    public void push(T element) {
        Stack.addFirst(element);
    }

    public T pop() {
        return Stack.removeFirst();
    }

    public int size() {
        return Stack.size();
    }

    public boolean isEmpty() {
        if (Stack.size() == 0) {
            return true;
        }
        return false;
    }
}
