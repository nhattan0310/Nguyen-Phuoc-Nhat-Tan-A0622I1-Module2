package exam2.controll;

import exam2.control.model.PhoneChinhHang;
import exam2.service.PhoneChinhHangServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemStore {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Them Moi ");
            System.out.println("2. Xoa");
            System.out.println("3. Xem Danh Sach Dien Thoai");
            System.out.println("4. Tim Kiem");
            System.out.println("5. Thoat");
            System.out.println("Chon chuc nang");
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
           switch (n){
               case 1:
                   themmoi();
//               case 2:
//                   xoa();

           }
        }
    }

    private static void themmoi() {
        PhoneChinhHangServiceImpl phoneChinhHangService =new PhoneChinhHangServiceImpl();
        while (true) {
            System.out.println("Chon loai dien thoai can them: ");
            System.out.println("1. Dien Thoai Chinh Hang");
            System.out.println("2. Dien Thoai Xach Tay");
            System.out.println("3. Quay lai");
            System.out.println("Chon chuc nang: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n ==1) {
                List<PhoneChinhHang> phoneChinhHangLists = new ArrayList<>();
                System.out.println("Nhap ID");
                int idDienThoai = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap Ten Dien Thoai");
                String tenDienThoai = sc.nextLine();
                System.out.println("Nhap Gia");
                Double giaBan = Double.parseDouble(sc.nextLine());
                System.out.println("Nhap So Luong");
                int soLuong = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap Nha San Xuat");
                String nhaSanXuat = sc.nextLine();
                System.out.println("Nhap Bao Hanh");
                int thoiGianBaoHanh = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap Pham Vi");
                String phamViBaoHanh = sc.nextLine();
                PhoneChinhHang phoneChinhHang = new PhoneChinhHang(idDienThoai, tenDienThoai, giaBan, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh);
                phoneChinhHangLists.add(phoneChinhHang);
            }
        }
    }
}