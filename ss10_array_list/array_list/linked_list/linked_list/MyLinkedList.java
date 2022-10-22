//package ss10_array_list.array_list.linked_list.linked_list;
//
//import java.util.Collection;
//import java.util.LinkedList;
//
//public class MyLinkedList<E> {
//    public MyLinkedList() {
//    }
//    public boolean addAll(int index, Collection<? extends E> c) {
//        checkPositionIndex(index);
//
//        Object[] a = c.toArray();
//        int numNew = a.length;
//        if (numNew == 0)
//            return false;
//
//        LinkedList.Node<E> pred, succ;
//        if (index == size) {
//            succ = null;
//            pred = last;
//        } else {
//            succ = node(index);
//            pred = succ.prev;
//        }
//
//        for (Object o : a) {
//            @SuppressWarnings("unchecked") E e = (E) o;
//            LinkedList.Node<E> newNode = new LinkedList.Node<>(pred, e, null);
//            if (pred == null)
//                first = newNode;
//            else
//                pred.next = newNode;
//            pred = newNode;
//        }
//
//        if (succ == null) {
//            last = pred;
//        } else {
//            pred.next = succ;
//            succ.prev = pred;
//        }
//
//        size += numNew;
//        modCount++;
//        return true;
//    }
//    public void addFirst(E e) {
//        linkFirst(e);
//    }
//
//
//    public void addLast(E e) {
//        linkLast(e);
//    }
//}
