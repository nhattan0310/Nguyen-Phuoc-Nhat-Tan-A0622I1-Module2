package test_the_best;

import java.util.Scanner;

public class AddArrayDemo {
    public static void main(String[] args) {
        int [] arr ={0,1,2,3,4,5};
        System.out.println("Before Add");
        output(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println(" \n Enter Random Number");
        int addArray = sc.nextInt();
        System.out.println("Index");
        int indexArray = sc.nextInt();
        System.out.println("After Add Array");
        //addArray(arr,indexArray,addArray);
        output(addArray(arr,indexArray,addArray));
    }
    public static void output(int[] arr){
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
    public static int[] addArray(int[] arr,int indexArray,int addArray){
        int[] arr2 = new int[arr.length+1];
        if (indexArray <= arr2.length){
            for (int i = 0; i <indexArray ; i++) {
                arr2[i]=arr[i];
            }
            arr2[indexArray]=addArray;
            for (int i = indexArray+1; i <arr2.length ; i++) {
                arr2[i] = arr[i-1];
            }
        }else {
            System.out.println("So TUm Bay Ko choi");
        }

        return arr2;
    }

}
