package ss3_array.thuc_hanh;

import java.util.Scanner;

public class TimSoLanXuatHien {
    public static void main(String[] args) {
      String chuoi ="a,b,c,d,e,a,a,b";
        System.out.println("Nhap Ky Tu Bat Ky");
        Scanner sc =new Scanner(System.in);
        String kyTu ="a";
        int count =0;
        for (int i = 0; i <chuoi.length() ; i++) {
            if ( String.valueOf(chuoi.charAt(i)).equals(kyTu)){
               count++;
           }

        }
        System.out.println(count);
    }
}
