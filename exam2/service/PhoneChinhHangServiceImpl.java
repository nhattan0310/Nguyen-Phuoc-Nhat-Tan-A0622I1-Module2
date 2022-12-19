package exam2.service;


import exam2.control.model.PhoneChinhHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneChinhHangServiceImpl implements PhoneChinhHangService{
    List<PhoneChinhHang> phoneChinhHangLists = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void themmoi() {
        System.out.println("Nhap ID");
        int idDienThoai =Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Ten Dien Thoai");
        String tenDienThoai=sc.nextLine();
        System.out.println("Nhap Gia");
        Double giaBan=Double.parseDouble(sc.nextLine());
        System.out.println("Nhap So Luong");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Nha San Xuat");
        String nhaSanXuat=sc.nextLine();
        System.out.println("Nhap Bao Hanh");
        int thoiGianBaoHanh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Pham Vi");
        String phamViBaoHanh=sc.nextLine();
        PhoneChinhHang phoneChinhHang=new PhoneChinhHang(idDienThoai,tenDienThoai,giaBan,soLuong,nhaSanXuat,thoiGianBaoHanh,phamViBaoHanh );
        phoneChinhHangLists.add(phoneChinhHang);
    }

    @Override
    public void xoa() {

    }

    @Override
    public void indanhsach() {
        int autoSTT = 1;
        for (PhoneChinhHang phoneChinhHang:phoneChinhHangLists) {
            System.out.println("STT: " + autoSTT++ + phoneChinhHang.toString());
        }
    }

    @Override
    public void timkiem(PhoneChinhHang autoSTT) {
        System.out.println("Nhap Phone Muon Tim");
        int idTimKiem = Integer.parseInt(sc.nextLine());
       for (PhoneChinhHang phoneChinhHang: phoneChinhHangLists){
           if (idTimKiem==phoneChinhHang.getIdDienThoai()){
               System.out.println(phoneChinhHang);
           }
       }
    }
}
