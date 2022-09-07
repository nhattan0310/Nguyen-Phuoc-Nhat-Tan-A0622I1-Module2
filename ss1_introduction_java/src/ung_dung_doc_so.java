import java.util.Scanner;

public class ung_dung_doc_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Random Number");
        int number =  Integer.parseInt(sc.nextLine());
        if (number < 1000) {

            switch (number / 100) {
                case 1:
                    System.out.println("Mot Tram");
                    break;
                case 2:
                    System.out.println("Hai Tram");
                    break;
                case 3:
                    System.out.println("Ba Tram");
                    break;
                case 4:
                    System.out.println("Bon Tram");
                    break;
                case 5:
                    System.out.println("Nam Tram");
                    break;
                case 6:
                    System.out.println("Sau Tram");
                    break;
                case 7:
                    System.out.println("Bay Tram");
                    break;
                case 8:
                    System.out.println("Tam Tram");
                    break;
                case 9:
                    System.out.println("Chin Tram");
                    break;
                default:
                    System.out.println("");

            }
            //System.out.println((number % 100) / 10);
            switch ((number % 100) / 10 ) {
                case 1:
                    System.out.println("Muoi");
                    break;
                case 2:
                    System.out.println("Hai Muoi");
                    break;
                case 3:
                    System.out.println("Ba Muoi");
                    break;
                case 4:
                    System.out.println("Bon Muoi");
                    break;
                case 5:
                    System.out.println("Nam Muoi");
                    break;
                case 6:
                    System.out.println("Sau Muoi");
                    break;
                case 7:
                    System.out.println("Bay Muoi");
                    break;
                case 8:
                    System.out.println("Tam Muoi");
                    break;
                case 9:
                    System.out.println("Chin Muoi");
                    break;
                default:
                    System.out.println("");

            }
            switch (number % 10) {
                case 1:
                    System.out.println("Mot");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bon");
                    break;
                case 5:
                    System.out.println("Nam");
                    break;
                case 6:
                    System.out.println("Sau");
                    break;
                case 7:
                    System.out.println("Bay");
                    break;
                case 8:
                    System.out.println("Tam");
                    break;
                case 9:
                    System.out.println("Chin");
                    break;
                default:
                    System.out.println("");

            }
        } else {
            System.out.println("Vui Long Nhap So Co Ba Chu So");
        }
    }
}



