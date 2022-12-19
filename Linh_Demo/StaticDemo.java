//package codegym.vn.accessmodifier_static;
//​
//        ​
//import codegym.vn.method.DemoMethod;
//​
//import java.util.function.DoubleToIntFunction;
//​
//public class StaticDemo {
//    int x;
//    static int y = 1;
//    static String str;
//​
//    public StaticDemo() {
//    }
//​
//    public StaticDemo(int x) {
//        this.x = x;
//    }
//​
//    static {
//        str = "Hello world";
//    }
//    public static void main(String[] args) {
//        StaticDemo demo = new StaticDemo();
//        StaticDemo.y++;
//        demo.x++;
//        demo.y--;
//        y++;
//        int x = 5;
//        System.out.println(x);
//​
//        staticMethod();
//        DemoMethod demoMethod = new DemoMethod();
//​
//    }
//    void nonStatic(){
//        int x = 5;
//        int i = 0;
//        for (i = 0; i < 10; i++) {
//            int x = 10;
//        }
//        System.out.println(x);
//        System.out.println(this.x);
//​
//    }
//​
//    static void staticMethod(){}
//}