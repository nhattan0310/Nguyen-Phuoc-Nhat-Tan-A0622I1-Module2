package final_exam.controller;

import final_exam.modlee.LoaiXe;

import java.util.Scanner;

public class ControllerVehecle {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Dang Ky Phuong Tien ");
            System.out.println("2. Xem Danh Sach");
            System.out.println("3. Huy Dang Ky");
            System.out.println("4. Thoat");
            System.out.println("Chon chuc nang");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    dangKyPhuongTien();
                    break;
                case 2:
                    xemDanhSach();
                    break;
                case 3:
                    huyDangKyPhuongTien();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

    private static void dangKyPhuongTien() {
        LoaiXe loaiXe =new LoaiXe();
        while (true) {
            System.out.println("Chon loai phuong tien can them: ");
            System.out.println("1. Them moi o To");
            System.out.println("2. Them moi Xe Tai");
            System.out.println("3. Quay lai");
            System.out.println("Chon chuc nang: ");
            System.out.println("Enter Number You Want");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n) {
                case 1:
                  loaiXe.add();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                default:
                    displayMainMenu();
            }
        }
    }

    private static void xemDanhSach () {

    }
    private static void  huyDangKyPhuongTien () {

    }
}