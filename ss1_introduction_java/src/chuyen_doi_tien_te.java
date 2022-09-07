import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap So Tien Ban Muon Quy Doi");
        double rate = 23.500;
        int usd = sc.nextInt();
        double result = usd * rate;
        System.out.println(result);
    }
}
