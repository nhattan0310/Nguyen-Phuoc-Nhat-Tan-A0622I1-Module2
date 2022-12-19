package text_exam.menu_dethi;

import text_exam.input.PersonRent;

import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
    displayMenu();
    }

    public static void displayMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Chức năng đăng ký người thuê/cho thuê nhà\n" +
                    "2. Hiển thị thông tin người thuê/cho thuê nhà\n" +
                    "3. Tìm kiếm người cho thuê phù hợp theo CCCD của người thuê\n" +
                    "4. Hiển thị và xoá những người thuê/cho thuê nhà thành công\n" +
                    "5. Lưu lại dữ liệu người thuê/cho thuê vào file\n" +
                    "6. Import dữ liệu người thuê/cho thuê vào chương trình\n" +
                    "7. Thoát\n");
            System.out.println("Enter Number You Want");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    inputPeople();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    break;
                default:
                    System.out.println("Bye Bye");

            }
        }
    }
    public static void inputPeople(){
        PersonRent personRent=new PersonRent();
        boolean check = true;
        System.out.println("1.Người Cho Thuê\n"+
                "2.Người Thuê");
        while (check){
            Scanner sc= new Scanner(System.in);
            int n =Integer.parseInt(sc.nextLine());
            switch (n){
                case 1:
                    personRent.display();
            }
        }
    }
}
