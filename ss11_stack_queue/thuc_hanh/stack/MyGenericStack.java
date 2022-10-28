package ss11_stack_queue.thuc_hanh.stack;

import ss10_array_list.array_list.linked_list.linked_list.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

}
