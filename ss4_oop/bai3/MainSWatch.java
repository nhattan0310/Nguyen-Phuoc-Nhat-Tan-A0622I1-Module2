package ss4_oop.bai3;

import java.util.Scanner;

public class MainSWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Thoi Gian Bat Dau");
        int startTime = scanner.nextInt();
        System.out.println("Nhap Thoi Gian Ket Thuc");
        int endTime = scanner.nextInt();
        StopWatch stopWatch = new StopWatch(startTime,endTime);
            int getElapsedTime = stopWatch.getElapsedTime(startTime,endTime);
        System.out.println(getElapsedTime + " milisecond");
    }
}
