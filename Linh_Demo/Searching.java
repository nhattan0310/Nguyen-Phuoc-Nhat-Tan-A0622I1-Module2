//package Linh_Demo;
//
//public class Searching {
//    public int search(int[] array, int value) {
//        for (int i = 0; i <array.length ; i++) {
//            if(array[i] == value) {
//                System.out.println(value);
//                return i;
//            }
//        }
//        System.out.println("Không thấy");
//        return -1;
//    }
//​
//    public long giaithua(int n) {
//        long gt = 1;
//        for (int i = 2; i <= n; i++) {
//            gt *= i;
//        }
//        return gt;
//    }
//​
//    public long giaithua_dequy(int n) {
//        if (n == 1) return 1;
//        return n * giaithua_dequy(n - 1);
//    }
//​
//    public int timkiem_nhiphan(int[] array, int value) {
//        int mid;
//        int left = 0, right = array.length - 1;
//        while (left < right) {
//            mid = (left + right)/2;
//            if (array[mid] == value) {
//                return mid;
//            } else if (array[mid] > value) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return -1;
//    }
//​
//    public int timkiem_nhiphandq(int[] array, int value, int left, int right) {
//        if (left > right) return -1;
//        int mid = (left + right)/2;
//        if (array[mid] == value) return mid;
//        if (array[mid] > value) {
//            return timkiem_nhiphandq(array, value, left, mid - 1);
//        } else {
//            return timkiem_nhiphandq(array, value, mid + 1, right);
//        }
//    }
//}
