package ss4_oop.phuong_trinh_bac2;

import java.util.Scanner;

public class MainQE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant(a, b, c) > 0) {
            double root1 = quadraticEquation.getRoot1(a, b, c);
            System.out.println("x1 = " + root1);
            double root2 = quadraticEquation.getRoot2(a, b, c);
            System.out.println("x2 = " + root2);
        } else if (quadraticEquation.getDiscriminant(a, b, c) == 0) {
            double root3 = quadraticEquation.getRoot3(a, b, c);
            System.out.println("x1= x2 = " + root3);
        }
        else{
            System.out.println("The equation has no roots");
        }
    }
}
