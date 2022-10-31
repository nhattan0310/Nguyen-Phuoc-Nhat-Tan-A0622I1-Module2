package ss11_stack_queue.bai_tap.swap;

import java.util.Scanner;
import java.util.TreeMap;
public class Count {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        string = string.toUpperCase();
        for (int i = 0; i < string.length(); i++) {
            if (map.containsKey(string.charAt(i))) {
                int j = map.get(string.charAt(i)) + 1;
                map.put(string.charAt(i), j);
            } else {
                map.put(string.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
