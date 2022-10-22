package ss10_array_list.array_list.linked_list.array_list;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> myLists = new MyList<>();
        System.out.println(myLists.size());
        myLists.add(1);
        myLists.add(2);
        myLists.add(3);
        myLists.add(4);
        myLists.add(6);
        myLists.add(5, 9);
        System.out.println(myLists.indexOf(2));
        System.out.println(myLists.contrains(2));
        myLists.remove(2);
        System.out.println(Arrays.toString(myLists.elements));
        Object[] newlist = myLists.clone();
        System.out.println(Arrays.toString(newlist));
        myLists.clear();
        System.out.println(Arrays.toString(myLists.elements));
    }
}
